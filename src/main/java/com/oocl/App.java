package com.oocl;

/**
 * Hello world!
 *
 */
public class App 
{
    public String fizzBuzz(int sequenceNumber) {
        String result = "";
        if (sequenceNumber % 3 == 0) {
            result += "Fizz";
        }
        if (sequenceNumber % 5 == 0) {
            result += "Buzz";
        }
        return result == "" ? String.valueOf(sequenceNumber) : result;
    }

    public String fizzBuzzWithClassSize(int classSize) {
        String result = "";

        for(int index = 1; index <= classSize; index++) {
            result += fizzBuzz(index) + "\n";
        }
        return result;
    }
}

