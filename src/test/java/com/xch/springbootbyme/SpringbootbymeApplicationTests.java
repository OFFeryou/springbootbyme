package com.xch.springbootbyme;

import com.xch.springbootbyme.pojo.HelloPojo;
import com.xch.springbootbyme.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootbymeApplicationTests {
    @Autowired
    private HelloService helloService;
    @Test
    public void contextLoads() {
        List<HelloPojo> helloServiceAll = helloService.getAll();
        System.out.println(helloServiceAll);
    }

}
