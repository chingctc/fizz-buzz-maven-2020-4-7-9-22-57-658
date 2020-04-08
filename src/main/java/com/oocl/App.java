package com.oocl;

/**
 * Hello world!
 *
 */
public class App 
{
    public String FizzBuzz(int sequenceNumber) {
        String result = "";

        if(sequenceNumber % 3 == 0){
            result += "Fizz";
        }
        if(sequenceNumber % 5 == 0){
            result += "Buzz";
        }
        return result == "" ? String.valueOf(sequenceNumber) : result;
    }
}

