package homework7;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        Scanner ob = new Scanner(System.in);
        System.out.print("Input Name : ");
        String name = ob.next(); //Input the name of the student
        System.out.print("INput roll number : ");
        int roll = ob.nextInt();//input the roll number of the student
        System.out.print("Input Marks for Maths : ");
        double Maths = ob.nextDouble();//input Maths subject result
        //Error handling
        if (Maths > 100 || Maths < 0) {
            System.out.println("Invalid Input,Marks should be between 0 and 100 ");
        }
        //Science
        System.out.print("Input the marks  for Science : ");
        double Science = ob.nextDouble();
        if (Science > 100 || Science < 0) {
            System.out.println("Invalid Input,Marks should be between 0 and 100 ");
        }
            //English
        System.out.print("Input the marks for English : ");
            double English = ob.nextDouble();//
            if (English > 100 || English < 0) {
                System.out.println("Invalid Input,Marks should be between 0 and 100 ");

            }
            double total = Maths + Science + English;

            double percentage = total/3;

        System.out.println("------------------------------");

        //Grading
        String Result = "0";//declare variable without value
          if(percentage>=35){
              Result = "pass";
          }else{
              Result = "fail";
          }
        //Grade
        String Grade ="0";
          if(percentage >= 80) {
              Grade = "A+";
          }else if (percentage >=60) {
              Grade = "A";
          }else if (percentage >=50) {
              Grade = "B";
          }else if (percentage >=35){
              Grade = "C";
          }

          //Display the data
        System.out.println("|------------Mark Sheet---------------------|");
        System.out.println("|Name           :            " + name+"              |" );
        System.out.println("|Roll Number    :              "+ roll+"           |" );
        System.out.println("|-------------------------------------------|");
        System.out.println("|Subject        :                 Marks     |");
        System.out.println("|-------------------------------------------|");
        System.out.println("|Maths          :              "+ Maths+"         |");
        System.out.println("|Science        :            "+ Science+"           |");
        System.out.println("|English        :            "+ English+"           |");
        System.out.println("|-------------------------------------------|");
        System.out.println("|Total          :              "+ total+"         |");
        System.out.println("|-------------------------------------------|");
        System.out.println("|percentage     :         "+ percentage+"              |");
        System.out.println("|Result         :             "+ Result+"          |");
        System.out.println("|Grade          :              "+ Grade+"            |");
        System.out.println("|-------------------------------------------|");

        }

    }