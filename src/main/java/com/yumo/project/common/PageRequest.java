package com.yumo.project.common;

import com.yumo.project.constant.CommonConstant;
import lombok.Data;

/**
 * 分页请求
 *
 * @author <a href=" https://github.com/coderyumo">程序员雨墨</a>
 */
@Data
public class PageRequest {

    /**
     * 当前页号
     */
    private long current = 1;

    /**
     * 页面大小
     */
    private long pageSize = 10;

    /**
     * 排序字段
     */
    private String sortField;

    /**
     * 排序顺序（默认升序）
     */
    private String sortOrder = CommonConstant.SORT_ORDER_ASC;
}
