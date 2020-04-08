package com.oocl;


import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertThat;


public class AppTest {
    @Test
    public void helloWorld() {

    }

    @Test
    public void should_return_number_when_normal_number_is_inputted() {
        App app = new App();
        String result = app.FizzBuzz(1);

        Assert.assertEquals("1", result);
    }

    @Test
    public void should_return_number_when_number_is_multiple_of_3() {
        App app = new App();
        String result = app.FizzBuzz(3);

        Assert.assertEquals("Fizz", result);
    }
}