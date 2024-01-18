package com.yupi.raininkapibackend.model.dto.post;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
 * 创建请求
 *
 * @author yumo
 */
@Data
public class PostAddRequest implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 标题
     */
    private String title;
    /**
     * 内容
     */
    private String content;
    /**
     * 标签列表
     */
    private List<String> tags;
}