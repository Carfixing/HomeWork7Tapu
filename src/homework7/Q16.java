/*Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
        “ZERO”*/


        package homework7;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args){

      Scanner scr = new Scanner(System.in);
        System.out.print("Enter the number :  ");
        int num1 = scr.nextInt();


        if(num1> 0)
        {
            System.out.println(num1 +" is a positive number");
        }
        else if(num1 < 0)
        {
            System.out.println(num1+" is a negative number");
        }
        else
        {
            System.out.println(num1+" is Zero ");
        }
    }

}
