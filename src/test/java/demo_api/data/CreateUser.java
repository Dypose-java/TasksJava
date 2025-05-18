package demo_api.data;

import com.github.javafaker.Faker;
import com.github.javafaker.IdNumber;
import demo_api.pojo.get.UserPojo;

import java.util.Locale;
import java.util.Random;

public class CreateUser {
    static Faker fakerEn = new Faker(Locale.ENGLISH);
    static UserPojo addUser(){
       return new UserPojo(new Random().nextLong(1_000_000_000_000_000_000L)
                ,fakerEn.name().username()
                ,fakerEn.name().firstName()
                ,fakerEn.name().lastName()
                ,fakerEn.internet().emailAddress()
                ,fakerEn.internet().password()
                ,fakerEn.phoneNumber().phoneNumber()
                ,200);
    }


}

