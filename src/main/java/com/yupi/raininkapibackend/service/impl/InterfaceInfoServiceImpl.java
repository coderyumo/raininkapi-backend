package com.yupi.raininkapibackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yupi.raininkapibackend.common.ErrorCode;
import com.yupi.raininkapibackend.exception.BusinessException;
import com.yupi.raininkapibackend.exception.ThrowUtils;
import com.yupi.raininkapibackend.mapper.InterfaceInfoMapper;
import com.yupi.raininkapibackend.model.entity.InterfaceInfo;
import com.yupi.raininkapibackend.service.InterfaceInfoService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
* @author yumo
* @description 针对表【interface_info(接口信息表)】的数据库操作Service实现
* @createDate 2024-01-18 14:16:45
*/
@Service
public class InterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper, InterfaceInfo>
    implements InterfaceInfoService {


    @Override
    public void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add) {
        if (interfaceInfo == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        Long id = interfaceInfo.getId();
        String name = interfaceInfo.getName();
        String description = interfaceInfo.getDescription();
        String url = interfaceInfo.getUrl();
        String method = interfaceInfo.getMethod();
        Integer status = interfaceInfo.getStatus();
        Long userId = interfaceInfo.getUserId();
        String requestHeader = interfaceInfo.getRequestHeader();
        String responseHeader = interfaceInfo.getResponseHeader();

        // 创建时，参数不能为空
        if (add) {
            ThrowUtils.throwIf(StringUtils.isAnyBlank(name, url, method), ErrorCode.PARAMS_ERROR);
        }
        // 有参数则校验
        if (StringUtils.isNotBlank(name) && name.length() > 80) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "标题过长");
        }
    }

}




