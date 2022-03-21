/* Write a Java program to sum values of an array.*/
package homework7;

import java.util.Scanner;

public class Q18 {
    /*public static void main(String[] args) {
         int my_array[ ]= {10,20,30,40,50,60,70,80,90,100};
         int sum = 0;

         for(int i : my_array)
             sum += i;
             System.out.println("The sum is " + sum);*/

    public static void main(String[] args) {
        int n, sum = 0;
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter no. of elements you want in array :  ");
        n = scr.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements : ");
        for (int i = 0; i<n; i++) {
            a[i] = scr.nextInt();
            sum = sum + a[i];
        }
        System.out.println("sum : " + sum);
        }

}
