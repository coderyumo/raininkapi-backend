package com.yumo.project.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 删除请求
 *
 * @author <a href=" https://github.com/coderyumo">程序员雨墨</a>
 */
@Data
public class DeleteRequest implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * id
     */
    private Long id;
}

// https://www.code-nav.cn/