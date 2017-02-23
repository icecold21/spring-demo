package com.luv2code.springdemo;

/**
 * Created by jonathan on 2/23/17.
 */
public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {

        return "Today is your very lucky day!";
    }
}
