package com.yumo.project.model.dto.post;

import lombok.Data;

import java.io.Serializable;

/**
 * 创建请求
 *
 * @author <a href=" https://github.com/coderyumo">程序员雨墨</a>
 */
@Data
public class PostAddRequest implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 性别（0-男, 1-女）
     */
    private Integer gender;
    /**
     * 学历
     */
    private String education;
    /**
     * 地点
     */
    private String place;
    /**
     * 职业
     */
    private String job;
    /**
     * 联系方式
     */
    private String contact;
    /**
     * 感情经历
     */
    private String loveExp;
    /**
     * 内容（个人介绍）
     */
    private String content;

    // [加入编程导航](https://t.zsxq.com/0emozsIJh) 入门捷径+交流答疑+项目实战+求职指导，帮你自学编程不走弯路
    /**
     * 照片地址
     */
    private String photo;
}