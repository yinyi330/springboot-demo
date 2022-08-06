package com.yinyispringbootdemo.test;

import com.github.javafaker.Faker;
import com.yinyispringbootdemo.entity.User;
import com.yinyispringbootdemo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.*;

@SpringBootTest
public class JavaFakerJunit {
    @Resource
    UserService userService;


    @Test
    public  void  testJavaFaker(){
        Faker faker = new Faker(Locale.CHINA);
        List<User> users = new ArrayList<User>();
        for (int i = 0; i <10000 ; i++) {
            User user = new User();
            user.setName(faker.name().name());
            user.setAge((new Random().nextInt(100) + 1));
            user.setAddress(faker.address().country()+
                    faker.address().cityName()+
                    faker.address().streetName()+
                    faker.address().buildingNumber());
            user.setSex((new Random().nextInt(2) + 1));
            user.setUseflag("1000");
            user.setInserttime(new Date());
            user.setUpdatetime(new Date());
            users.add(user);
        }
        userService.saveBatch(users);
    }
}
