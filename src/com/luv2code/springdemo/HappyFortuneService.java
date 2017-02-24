package com.luv2code.springdemo;
import java.util.Random;

/**
 * Created by jonathan on 2/23/17.
 */
public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        String fortunes[] = {
            "Today is your very lucky day!",
            "This month is your very lucky month!",
            "This year is your very lucky year!"
        };

        Random rand = new Random();

        int  n = rand.nextInt(3);

        return fortunes[n];
    }
}
