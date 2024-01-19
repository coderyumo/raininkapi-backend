package com.yumo.raininkapiinterface.controller;

import cn.hutool.core.util.NumberUtil;
import cn.hutool.core.util.StrUtil;
import com.yumo.raininkapiclientsdk.model.User;
import com.yumo.raininkapiclientsdk.utils.SignUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/**
 * @description: 查询名称API
 * @author: yumo
 * @create: 2024-01-18 19:03
 **/
@RestController
@RequestMapping("/name")
public class NameController {

    @GetMapping("/{name}")
    public String getNameByGet(@PathVariable(value = "name") String name) {

        return "发送GET请求 你的名字是：" + name;
    }

    @PostMapping()
    public String getNameByPost(@RequestParam(value = "name") String name) {
        return "发送POST请求 你的名字是：" + name;
    }

    @PostMapping("/user")
    public String getNameByPostWithJson(@RequestBody User user, HttpServletRequest request) throws UnsupportedEncodingException {
        String accessKey = request.getHeader("accessKey");
        // 防止中文乱码
        String body = URLDecoder.decode(request.getHeader("body"), StandardCharsets.UTF_8.name());
        String sign = request.getHeader("sign");
        String nonce = request.getHeader("nonce");
        String timestamp = request.getHeader("timestamp");
        boolean hasBlank = StrUtil.hasBlank(accessKey, body, sign, nonce, timestamp);
        // 判断是否有空
        if (hasBlank) {
            return "无权限";
        }
        // TODO 使用accessKey去数据库查询secretKey
        // 假设查到的secret是abc 进行加密得到sign
        String secretKey = "abcdefg";
        String sign1 = SignUtils.getSign(body, secretKey);
        if (!StrUtil.equals(sign, sign1)) {
            return "无权限";
        }
        // TODO 判断随机数nonce
        // 时间戳是否为数字
        if (!NumberUtil.isNumber(timestamp)) {
            return "无权限";
        }
        // 五分钟内的请求有效
        if (System.currentTimeMillis() - Long.parseLong(timestamp) > 5 * 60 * 1000) {
            return "无权限";
        }
        return "发送POST请求 JSON中你的名字是：" + user.getUsername();
    }

}
