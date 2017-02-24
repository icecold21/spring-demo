package com.luv2code.springdemo;

/**
 * Created by jonathan on 2/23/17.
 */
public class CricketCoach implements Coach {
    private FortuneService fortuneService;

    // add new fields for emailAddress and team
    private String emailAddress;
    private String team;


    public String getEmailAddress() {

        return emailAddress;
    }

    public String getTeam() {

        return team;
    }


    public void setEmailAddress(String emailAddress) {

        System.out.println("CricketCoach: inside setter method - setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {

        System.out.println("CricketCoach: inside setter method - setTeam");
        this.team = team;
    }

    // create a no arg constructor
    public CricketCoach() {

        System.out.println("CricketCoach: Inside no-arg constructor");
    }

    public void setFortuneService(FortuneService fortuneService) {

        System.out.println("CricketCoach: Inside setter method setFortuneService");
        System.out.println("Fuck you");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {

        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {

        return fortuneService.getFortune();
    }
}
