/*Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
any other alphabet should be invalid entry
9. Same as above program-8 using switch statement.*/

package homework7;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        char ch;
        Scanner scr = new Scanner(System.in);//scanner creation
        System.out.println("Please Enter the alphabet between A to F : ");
        ch = scr.next().charAt(0);//read the input

        switch (ch) {
            case 'A':
                System.out.println("A = Ahmedabad");
                break;
            case 'B':
                System.out.println("B = Banglore");
                break;
            case 'C':
                System.out.println("C = Channai ");
                break;
            case 'D':
                System.out.println("D = Delhi");
                break;
            case 'E':
                System.out.println("E = Ellora");
                break;
            case 'F':
                System.out.println("F = Fatehpur");
                break;
            default:
                System.out.println("Invalid Alphabet");
        }

    }
}
