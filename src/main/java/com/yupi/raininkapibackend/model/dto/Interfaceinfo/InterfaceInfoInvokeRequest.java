package com.yupi.raininkapibackend.model.dto.Interfaceinfo;

import lombok.Data;

import java.io.Serializable;

/**
 * @description:
 * @author: yumo
 * @create: 2024-01-19 14:04
 **/
@Data
public class InterfaceInfoInvokeRequest implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 用户请求参数
     */
    private String userRequestParams;

    private static final long serialVersionUID = 1L;

}
