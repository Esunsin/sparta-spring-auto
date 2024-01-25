package com.sparta.springauth.bean;

import com.sparta.springauth.food.Food;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 등록된 빈이 2개일때
 * 1. 직접 명시 : Food chicken;
 * 2. @Primary (우선순위를 높힘) - 범용적인 것
 * 3. @Qualifier (빈을 사용을 연결) - 지역적인 것
 * **직접 연결 시켜주는 @Qualifier 가 높음. (좁은 범위가 우선순위가 높음)
 */
@SpringBootTest
public class BeanTest {

    private final Food food;
    @Autowired
    public BeanTest(@Qualifier Food food) {
        this.food = food;
    }

    @Test
    @DisplayName("test")
    void test1(){
        food.eat();
    }
}
