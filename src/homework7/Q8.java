/*Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
        any other alphabet should be invalid entry*/

package homework7;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        char ch;
      Scanner scr = new Scanner(System.in);
        System.out.print("Please Enter the alphabet between A to F :  ");
        ch = scr.next().charAt(0);

       // String city = x;
        if (ch == 'A')
        {
            System.out.println("Ahmedabad");
        } else if (ch == 'B') {
            System.out.println("Banglore ");
        } else if (ch == 'C') {
            System.out.println("Chennai ");
        } else if (ch == 'D') {
            System.out.println("Delhi");
        } else if (ch == 'E') {
            System.out.println("Ellora");
        } else if (ch == 'F') {
            System.out.println("Fatehpur ");
        }
        else
        {
            System.out.println("Invalid Alphabet");
        }
    }
}
