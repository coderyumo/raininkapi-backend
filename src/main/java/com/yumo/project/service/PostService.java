package com.yumo.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yumo.project.model.entity.Post;

/**
 * 帖子服务
 *
 * @author <a href=" https://github.com/coderyumo">程序员雨墨</a>
 */
public interface PostService extends IService<Post> {

    /**
     * 校验
     *
     * @param post
     * @param add  是否为创建校验
     */
    void validPost(Post post, boolean add);
}
