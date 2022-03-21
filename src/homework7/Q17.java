/*Write a Java program to sort a numeric array and a string array.*/

package homework7;

import java.util.Arrays;

public class Q17 {
    public static void main(String[] args) {
        int[] arraydata1 ={1,6,3,4,5,56,7,98,9,10};
        String[]arraydata2 = {"jone","jack","ema","cat","book"};
        //print the arraydata1
        System.out.println("original value : " + Arrays.toString(arraydata1));
        Arrays.sort(arraydata1);
        System.out.println("sorted value : " + Arrays.toString(arraydata1));
         //print for arraydata2
        System.out.println("original value : " + Arrays.toString(arraydata2));
        Arrays.sort(arraydata2);
        System.out.println("sorted value : " + Arrays.toString(arraydata2));

    }
}
