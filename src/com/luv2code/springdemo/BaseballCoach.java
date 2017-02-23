package com.luv2code.springdemo;

/**
 * Created by jonathan on 2/22/17.
 */
public class BaseballCoach implements Coach{

    // define a private field for the dependency
    private FortuneService fortuneService;

    // define a constructor for dependency injection
    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {

        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {

        // Use my fortuneService to get a fortune
        // dependency = helper
        return fortuneService.getFortune();
    }
}
