package com.yumo.project.model.vo;

import com.yumo.project.model.entity.Post;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 帖子视图
 *
 * @author <a href=" https://github.com/coderyumo">程序员雨墨</a>
 * @TableName product
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PostVO extends Post {

    private static final long serialVersionUID = 1L;
    /**
     * 是否已点赞
     */
    private Boolean hasThumb;
}