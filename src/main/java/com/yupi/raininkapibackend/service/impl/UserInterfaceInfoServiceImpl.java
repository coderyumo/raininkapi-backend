package com.yupi.raininkapibackend.service.impl;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yupi.raininkapibackend.common.ErrorCode;
import com.yupi.raininkapibackend.exception.BusinessException;
import com.yupi.raininkapibackend.exception.ThrowUtils;
import com.yupi.raininkapibackend.mapper.UserInterfaceInfoMapper;
import com.yupi.raininkapibackend.model.entity.UserInterfaceInfo;
import com.yupi.raininkapibackend.service.UserInterfaceInfoService;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @author linli
 * @description 针对表【user_interface_info(接口信息表)】的数据库操作Service实现
 * @createDate 2024-01-19 15:14:24
 */
@Service
public class UserInterfaceInfoServiceImpl extends ServiceImpl<UserInterfaceInfoMapper, UserInterfaceInfo>
        implements UserInterfaceInfoService {


    @Resource
    private RedissonClient redissonClient;

    @Override
    public void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add) {
        if (userInterfaceInfo == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        // 创建时，所有参数必须非空
        if (add) {
            if (userInterfaceInfo.getInterfaceInfoId() <= 0 || userInterfaceInfo.getUserId() <= 0) {
                throw new BusinessException(ErrorCode.PARAMS_ERROR, "接口或用户不存在");
            }
        }
        if (userInterfaceInfo.getLeftNum() < 0) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "剩余次数不能小于 0");
        }
    }


    @Override
    public boolean invokeCount(long interfaceInfoId, long userId) {
        ThrowUtils.throwIf(interfaceInfoId <= 0 || userId <= 0, ErrorCode.PARAMS_ERROR);

        //分布式锁
        RLock lock = redissonClient.getLock("rainapi:invoke_count:lock");
        try {

            if (lock.tryLock(1000, -1, TimeUnit.MILLISECONDS)) {
                UpdateWrapper<UserInterfaceInfo> updateWrapper = new UpdateWrapper<>();
                updateWrapper.lambda()
                        .eq(UserInterfaceInfo::getInterfaceInfoId, interfaceInfoId)
                        .eq(UserInterfaceInfo::getUserId, userId)
                        .gt(UserInterfaceInfo::getLeftNum,0)
                        .setSql("totalNum = totalNum+1,leftNum = leftNum-1");
                return this.update(updateWrapper);
            }
        } catch (InterruptedException e) {
            log.error("redis set key error");
        } finally {
            //只能释放自己的锁
            if (lock.isHeldByCurrentThread()) {
                lock.unlock();
            }
        }
        return false;
    }
}




