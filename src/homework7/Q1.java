/*Write a java program that tells us that Input number is odd or even?
        HINT: use ternary operator (? :)*/


package homework7;

import java.util.Scanner;

public class Q1 {
    //declare main method
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);//create object for scanner
        System.out.print("Please enter the Number :  ");//print statement
        int num = scr.nextInt();//read the number
      //use if--else condition
        if(num%2==0)
         {
            System.out.println(num + " is a Even number");
         }
        else
         {
            System.out.println("Odd number");
         }
       // System.out.println("Invalid number");
    }


}
