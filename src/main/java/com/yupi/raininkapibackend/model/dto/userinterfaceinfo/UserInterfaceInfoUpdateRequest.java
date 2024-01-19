package com.yupi.raininkapibackend.model.dto.userinterfaceinfo;

import lombok.Data;

import java.io.Serializable;

/**
 * @description: 更新请求
 * @author: yumo
 * @create: 2024-01-19 15:24
 **/
@Data
public class UserInterfaceInfoUpdateRequest implements Serializable {

    /**
     * 主键
     */
    private Long id;

    /**
     * 总调用次数
     */
    private Integer totalNum;

    /**
     * 剩余调用次数
     */
    private Integer leftNum;

    /**
     * 0-正常，1-禁用
     */
    private Integer status;

    private static final long serialVersionUID = 1L;
}
