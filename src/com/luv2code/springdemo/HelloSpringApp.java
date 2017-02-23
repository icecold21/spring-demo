package com.luv2code.springdemo;


import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jonathan on 2/23/17.
 */
public class HelloSpringApp {
    public static void main(String[] args) {

        // load spring configuration file
        ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext("spring-config.xml");

        // retrieve bean from spring container, getBean receive bean_id, actual name of the interface / class
        Coach theCoach = context.getBean("myCoach", Coach.class);

        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        // Call new method for fortunes services
        System.out.println(theCoach.getDailyFortune());

        // close the context
        context.close();
    }
}
