package com.sparta.springauth.food;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Chicken implements Food{
    @Override
    public void eat() {
        System.out.println("eat chicken!!!!!");
    }
}
