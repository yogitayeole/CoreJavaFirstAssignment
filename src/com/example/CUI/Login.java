package com.example.CUI;
import javax.swing.*;
import java.io.*;
import java.util.*;

public class Login {

    static String username = ("dale");
    static String Pass = ("Yogita");
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        boolean login = false;
        int count=0;
        String username1;
        String pass1;
        System.out.println("Hello and Welcome. \n");
        for (int n = 0; n < 3; n++) {
            System.out.println("Please enter your username to login: ");
            username1 = console.next();
            System.out.println("Please enter your Password to login: ");
            pass1 = console.next();

            if ((username1.equals(username))&& (pass1.equals(Pass)) ) {
                System.out.println("");
                System.out.println("Welcome ");
                login = true;
                System.exit(0);

            }

            if (login == false) {

                System.out.println("");
                System.out.println("Incorrect username, please try again.");
                count++;
                if(count==3)
                  System.out.println("contact admin");
            }

        }
    }
}
