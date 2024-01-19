package com.yumo.raininkapiinterface;

import com.yumo.raininkapiclientsdk.client.RainApiClient;
import com.yumo.raininkapiclientsdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@SpringBootTest
class RaininkapiInterfaceApplicationTests {

    @Resource
    private RainApiClient rainApiClient;


    @Test
    void contextLoads() {
        String result1 = rainApiClient.getNameByGet("yumo");
        User user = new User();
        user.setUsername("yumo");
        user.setAge(18);
        String result2 = rainApiClient.getNameByPostWithJson(user);
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }

}
