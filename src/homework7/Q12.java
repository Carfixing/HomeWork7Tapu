/*12. Write a program that tells us input value is number or an alphabet or symbol*/

package homework7;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);//scanner creation
        System.out.print("Enter the input  :  ");//print statement
        char ch = scr.next().charAt(0);//read the input

        if ((ch>='a' && ch <='z') || (ch>='A' && ch <= 'Z')) {
            System.out.println( "This is Alphabet ");
           }else if (ch >= '0' && ch<='9') {
            System.out.println( " This is a Number ");
        }
        else{
            System.out.println( " This  is a Special character");
            }
        }

 }

