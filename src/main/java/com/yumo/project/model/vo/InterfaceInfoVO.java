package com.yumo.project.model.vo;

import com.yupi.yuapicommon.model.entity.InterfaceInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 接口信息封装视图
 *
 * @author <a href=" https://github.com/coderyumo">程序员雨墨</a>
 * @TableName product
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class InterfaceInfoVO extends InterfaceInfo {

    private static final long serialVersionUID = 1L;
    /**
     * 调用次数
     */
    private Integer totalNum;
}