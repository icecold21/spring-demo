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
        CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);

        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theCoach.getDailyFortune());


        // close the context
        context.close();
    }
}
