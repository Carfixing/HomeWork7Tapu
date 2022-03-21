/* Write a java program to input any year like (ex.2007) and find out if it is leap year or
        not?*/

package homework7;

import java.util.Scanner;

public class Q2 {
   /* public static void main(String[] args) {

        int year;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any Year:");
        year = scan.nextInt();
        scan.close();
        boolean Leap = false;

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    Leap = true;
                else
                    Leap = false;
            }
            else
                Leap = true;
        }
        else {
            Leap = false;
        }

        if(Leap==true)
            System.out.println(year + " is a Leap Year.");
        else
            System.out.println(year + " is not a Leap Year.");
    }*/

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);//sdcanner object creation
        System.out.print("Enter the year : ");//print statement
        int year = scr.nextInt();//read the input

        if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) {
            System.out.println( year + " This is leap year");//true condition
        } else {
            System.out.println( year + " This is not a leap year");//false condition
        }
    }
}
