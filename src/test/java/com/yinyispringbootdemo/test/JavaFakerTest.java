package com.yinyispringbootdemo.test;

import com.github.javafaker.Faker;
import com.yinyispringbootdemo.entity.User;

import java.util.Locale;
import java.util.Random;
public class JavaFakerTest {

    public static void main(String[] args) {
        Faker faker = new Faker(Locale.CHINA);

        for (int i = 0; i <10000 ; i++) {
            User user = new User();
            user.setName(faker.name().name());
            user.setAge((new Random().nextInt(100) + 1));
            user.setAddress(faker.address().country()+
                            faker.address().cityName()+
                            faker.address().streetName()+
                            faker.address().buildingNumber());
            user.setSex((new Random().nextInt(2) + 1));
            System.out.println("JavaFakerTest.main="+user);

        }
    }

}
