package com.nasiatech.exercises.chapter1.reinforcement;

import java.util.Scanner;

public class R1Dzenyuy {
    private static final Scanner input = new Scanner(System.in);

    public void inputAllBaseTypes(){
        System.out.print("Enter a string :");
        String c = input.next();
        System.out.printf("You entered : %s\n\n", c);

        System.out.print("Enter a long value: ");
        long l = input.nextLong();
        System.out.printf("You entered : %d\n\n", l);

        System.out.print("Enter a double :");
        double d = input.nextDouble();
        System.out.printf("You entered : %f\n\n", d);

        System.out.print("Enter a float :");
        float f = input.nextFloat();
        System.out.printf("You entered : %f\n\n", f);

        System.out.print("Enter an integer : ");
        int i = input.nextInt();
        System.out.printf("You entered : %d\n\n", i);

        System.out.print("Enter a character : ");
        char c1 = input.next().charAt(0);
        System.out.printf("You entered : %s\n\n", c1);
    }

    // method to check if number is a multiple of the other
    public boolean isMultiple(long m, long n){
    return  m%n==0;
    }

    //method is iseven r14
    public boolean isEven(long a){
        boolean status = false;
        for(int i=0; i<=a; i++)
        {
            status = !status;
        }
        return status;
    }

    //sum all integers less than or equall to n
    public int SumOfNumbersLessthanN(int n){
        int total =0;
        for(int i=1; i<=n; i++)
        {
            total+=i;
        }
        return total;
    }

    //sum of all numbers less than or equall to n
    public int sumOfOddlessthanN(int n){
        int total =0;
        for(int i=1; i<=n; i++)
        {
            if(i%2 != 0)
                total+=i;
        }
        return total;
    }

    //sum of squares less than or equall to n
    public long SumOfSquares(long n)
    {
        long total =0;
        for(long i=1; i<=n; i++)
        {
            total+=i*i;
        }
        return total;
    }

    public int numberOfVowels(String s){
        int total = 0;
        for(int i =0; i<s.length(); i++)
        {
            char c = s.toLowerCase().charAt(i);
            if(c=='a'  || c=='e' || c=='o'  || c=='u' || c=='i')
                total++;
        }
        return total;
    }

    //method to remove punctuation from a string buffer
    public StringBuilder removePonctuation(String s)
    {
        StringBuilder sb = new StringBuilder(s);

        for(int i=0; i<sb.length(); i++)
        {
            char c = sb.charAt(i);
            if(!Character.isAlphabetic(c) && !Character.isDigit(c) && !Character.isWhitespace(c))
                    sb.deleteCharAt(i);

        }
        return sb;
    }
}

class Flower
{
    private  String name;
    private int numberOfPetals;
    private float price;


    //constructor
    public Flower(String s, int n, float f)
    {
        name = s;
        numberOfPetals = n;
        price = f;
    }

    //setter functions for each data member
    public  void setName(String name)
    {
        this.name = name;
    }

    public void setNumberOfPetals(int n)
    {
        numberOfPetals = n;
    }

    public void setPrice(float price)
    {
        this.price = price;
    }

    //getters for each data e=member
    public String getName()
    {
        return name;
    }

    public int getNumberOfPetals()
    {
        return numberOfPetals;
    }

    public float getPrice() {
        return price;
    }
}
