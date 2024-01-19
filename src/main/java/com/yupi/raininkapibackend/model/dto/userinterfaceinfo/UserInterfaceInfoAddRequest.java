package com.yupi.raininkapibackend.model.dto.userinterfaceinfo;

import lombok.Data;

/**
 * @description: 新增请求
 * @author: yumo
 * @create: 2024-01-19 15:23
 **/
@Data
public class UserInterfaceInfoAddRequest {
    /**
     * 调用用户 id
     */
    private Long userId;

    /**
     * 接口 id
     */
    private Long interfaceInfoId;

    /**
     * 总调用次数
     */
    private Integer totalNum;

    /**
     * 剩余调用次数
     */
    private Integer leftNum;

}
