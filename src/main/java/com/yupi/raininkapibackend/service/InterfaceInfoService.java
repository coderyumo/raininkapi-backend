package com.yupi.raininkapibackend.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.raininkapibackend.model.dto.Interfaceinfo.InterfaceInfoQueryRequest;
import com.yupi.raininkapibackend.model.entity.InterfaceInfo;
import com.yupi.raininkapibackend.model.entity.InterfaceInfo;
import com.yupi.raininkapibackend.model.vo.InterfaceInfoVO;

import javax.servlet.http.HttpServletRequest;

/**
* @author   yumo
* @description 针对表【interface_info(接口信息表)】的数据库操作Service
* @createDate 2024-01-18 14:16:45
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    /**
     * 校验
     *
     * @param interfaceInfo
     * @param add
     */
    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);


}
