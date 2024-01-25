package com.sparta.springauth.food;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier
public class Pizza implements Food{
    @Override
    public void eat() {
        System.out.println("eat Pizza!!!!! ");
    }
}
