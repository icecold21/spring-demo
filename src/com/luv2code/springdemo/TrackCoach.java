package com.luv2code.springdemo;

/**
 * Created by jonathan on 2/22/17.
 */
public class TrackCoach implements Coach {
    private FortuneService fortuneService;


    public TrackCoach() {
        // no argument constructor, for the default, not always needed
    }

    public TrackCoach(FortuneService fortuneService) {

        this.fortuneService = fortuneService;
    }

    @Override
    public  String getDailyWorkout() {

        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {

        return "Just do it: " + fortuneService.getFortune();
    }
}
