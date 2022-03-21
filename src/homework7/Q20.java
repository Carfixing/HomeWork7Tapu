/*Write a Java program to test if an array contains a specific value*/
package homework7;

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {

            int[] array = { 1, 4, 6, 2, 5 };
        Scanner scr = new Scanner(System.in);//create object for scanner
        System.out.print("Please enter the Number :  ");//print statement
        int x = scr.nextInt();//read the number

           int findValueOf = x;

            boolean isFound = false;
            for (int i = 0; i < array.length; i++) {

                if (array[i] == findValueOf) {
                    isFound = true;
                    break;
                }

            }

            if (isFound) {
                System.out.println("Number " + findValueOf + " is found in the  array");
            } else {
                System.out.println("Number " + findValueOf + " is not found in the  array");
            }
    }

}
