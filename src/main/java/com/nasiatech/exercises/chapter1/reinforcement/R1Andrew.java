package com.nasiatech.exercises.chapter1.reinforcement;

import java.util.Scanner;
public class R1Andrew {
    Scanner keyboard = new Scanner(System.in);

    public int addNumber(int a, int b){
        return a + b;
    }

    public void R1inputAllBase(){
        int intValue;
        char charValue;
        double doubleValue;
        long longValue;
        byte byteValue;

        System.out.println("Enter Integer Value: ");
        intValue = keyboard.nextInt();
        System.out.println("Integer value: "+intValue);

        System.out.println("Enter Character Value: ");
        charValue = keyboard.next().charAt(0);
        System.out.println("Integer value: "+charValue);

        System.out.println("Enter Byte Value: ");
        byteValue = keyboard.nextByte();
        System.out.println("Integer value: "+byteValue);

        System.out.println("Enter Double Value: ");
        doubleValue = keyboard.nextDouble();
        System.out.println("Integer value: "+doubleValue);

        System.out.println("Enter Long Value: ");
        longValue = keyboard.nextLong();
        System.out.println("Long value: "+longValue);

    }

    public boolean R3isMultiple(long m, long n){
        if(m == 0){
            return false;
        }
        return n % m == 0;
    }

    public boolean R4isEven(int value){
        boolean flag = false;
        for(int i = 0; i<=value; i++){
            flag = !flag;
        }
        return flag;
    }

    public int sumOfAll(int value){
        int sum = 0;
        for(int a = 0; a <= value; a++){
            sum = sum+a;
        }
        return sum;
    }
}
