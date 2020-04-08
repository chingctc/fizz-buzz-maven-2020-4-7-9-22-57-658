package com.oocl;


import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertThat;


public class AppTest {
    @Test
    public void should_return_number_when_normal_number_is_inputted() {
        App app = new App();
        String result = app.fizzBuzz(1);

        Assert.assertEquals("1", result);
    }

    @Test
    public void should_return_number_when_number_is_multiple_of_3() {
        App app = new App();
        String result = app.fizzBuzz(3);

        Assert.assertEquals("Fizz", result);
    }

    @Test
    public void should_return_number_when_number_is_multiple_of_5() {
        App app = new App();
        String result = app.fizzBuzz(5);

        Assert.assertEquals("Buzz", result);
    }

    @Test
    public void should_return_number_when_number_is_multiple_of_15() {
        App app = new App();
        String result = app.fizzBuzz(15);

        Assert.assertEquals("FizzBuzz", result);
    }

    @Test
    public void should_return_Fizz_Buzz_result_for_nth_number() {
        App app = new App();
        String result = app.fizzBuzzWithClassSize(20);

        Assert.assertEquals("1\n" +
                "2\n" +
                "Fizz\n" +
                "4\n" +
                "Buzz\n" +
                "Fizz\n" +
                "7\n" +
                "8\n" +
                "Fizz\n" +
                "Buzz\n" +
                "11\n" +
                "Fizz\n" +
                "13\n" +
                "14\n" +
                "FizzBuzz\n" +
                "16\n" +
                "17\n" +
                "Fizz\n" +
                "19\n" +
                "Buzz\n", result);
    }
}