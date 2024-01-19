package com.yupi.raininkapibackend.service;

import com.yupi.raininkapibackend.model.entity.UserInterfaceInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author linli
 * @description 针对表【user_interface_info(接口信息表)】的数据库操作Service
 * @createDate 2024-01-19 15:14:24
 */
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {

    void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add);


    boolean invokeCount(long interfaceInfoId, long userId);
}
