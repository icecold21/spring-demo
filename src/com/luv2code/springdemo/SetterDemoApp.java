package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jonathan on 2/23/17.
 */
public class SetterDemoApp {
    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext("spring-config.xml");


        // retrieve bean from spring container
        //CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
        Coach theCoach = context.getBean("myCoach", Coach.class);

        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theCoach.getDailyFortune());

        // call our new methods to get the literal values
        //System.out.println(theCoach.getEmailAddress());

        // System.out.println(theCoach.getTeam());

        System.out.println("Ide is very strong need this not to duplicate");
        // close the context
        context.close();

    }
}
