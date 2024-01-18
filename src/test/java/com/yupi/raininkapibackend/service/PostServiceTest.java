package com.yupi.raininkapibackend.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yupi.raininkapibackend.model.dto.post.PostQueryRequest;
import com.yupi.raininkapibackend.model.entity.Post;

import javax.annotation.Resource;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 帖子服务测试
 *
 * @author yumo
 */
@SpringBootTest
class PostServiceTest {

    @Resource
    private PostService postService;

    @Test
    void searchFromEs() {
        PostQueryRequest postQueryRequest = new PostQueryRequest();
        postQueryRequest.setUserId(1L);
        Page<Post> postPage = postService.searchFromEs(postQueryRequest);
        Assertions.assertNotNull(postPage);
    }

}