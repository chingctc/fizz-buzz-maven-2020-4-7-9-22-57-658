package com.oocl;

/**
 * Hello world!
 *
 */
public class App 
{
//    public static void main( String[] args )
//    {
//        System.out.println( "Hello World!" );
//    }

    public String FizzBuzz(int sequenceNumber) {
        if(sequenceNumber % 3 == 0){
            return "Fizz";
        }
        if(sequenceNumber % 5 == 0){
            return "Buzz";
        }
        return String.valueOf(sequenceNumber);
    }
}

