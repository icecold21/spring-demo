package com.luv2code.springdemo;

/**
 * Created by jonathan on 2/23/17.
 */
public class PoolCoach implements Coach {

    @Override
    public String getDailyWorkout() {

        return("Do 100 times trick shots");
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
