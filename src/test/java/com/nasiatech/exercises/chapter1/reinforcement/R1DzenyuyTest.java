package com.nasiatech.exercises.chapter1.reinforcement;

import com.sun.security.jgss.GSSUtil;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class R1DzenyuyTest {
    public R1Dzenyuy ob = new R1Dzenyuy();
    @Test
     public void testIsMultiple(){
         assertTrue(ob.isMultiple(6,3));
     }

     @Test
    public void testIsEven(){
        assertTrue(ob.isEven(4));
     }

     @Test
     public void  testSum(){
        assertEquals(6,ob.SumOfNumbersLessthanN(3));
     }

     //test for all ood sum
     @Test
    public  void testOddSum(){
        assertEquals(9, ob.sumOfOddlessthanN(5));
     }

     //test for sumOfSquares
    @Test
    public  void testSumSquares()
    {
        assertEquals(14,ob.SumOfSquares(3));
    }

    //test case for number of vowels
    @Test
    public void testNumberOFvowels(){
        assertEquals(5,ob.numberOfVowels("aeoui"));
    }

    //test remove punctuation
    @Test
    public void testRemovePunctuation(){
        assertEquals("Hello World", new String(ob.removePonctuation("Hello, World!")));
    }


    public static void main(String[] args) {
        //test for class Flower
        Flower flower = new Flower("Lantana", 34, 4500);
        System.out.printf("%-10s%-5s%12s\n","Flower","Petals","Price");
        System.out.printf("%-10s%-5d%12.3f\n",flower.getName(),flower.getNumberOfPetals(), flower.getPrice());
    }

}