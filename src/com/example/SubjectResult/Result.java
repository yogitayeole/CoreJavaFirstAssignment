package com.example.SubjectResult;
import java.util.Scanner;

public class Result {
    public static void main(String args[]){

       System.out.println("Enter marks marks of 3 Subject :");
       Scanner subject = new Scanner(System.in);
       int sub1 = subject.nextInt();
       int sub2 = subject.nextInt();
       int sub3 = subject.nextInt();

       if (sub1>=60 && sub2>=60 && sub3>=60)
           System.out.println("Passed");
       else if ((sub1>=60 && sub2>=60 && sub3<=60) || (sub1>=60 && sub2<=60 && sub3>=60) || (sub1<=60 && sub2>=60 && sub3>=60))
           System.out.println("Promoted");
       else
           System.out.println("Failed");
    }
}
