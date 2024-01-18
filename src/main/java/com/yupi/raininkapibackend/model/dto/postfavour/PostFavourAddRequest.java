package com.yupi.raininkapibackend.model.dto.postfavour;

import java.io.Serializable;

import lombok.Data;

/**
 * 帖子收藏 / 取消收藏请求
 *
 * @author yumo
 */
@Data
public class PostFavourAddRequest implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 帖子 id
     */
    private Long postId;
}