package com.luv2code.springdemo;

/**
 * Created by jonathan on 2/23/17.
 */
public class BluffCoach implements Coach {
    private FortuneService fortuneService;

    public BluffCoach(FortuneService fortuneService) {

        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Bluff 1000 times a day";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}

