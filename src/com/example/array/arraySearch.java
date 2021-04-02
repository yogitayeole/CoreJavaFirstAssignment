package com.example.array;
import java.util.Scanner;

public class arraySearch {
    public static void main(String[] args)
    {
        int n, search,count=1;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();

        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();

        }
        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println("\n Enter a number you want to search in array:");
        search = s.nextInt();

        for (int i = 0; i < n; i++)
        {
            if (a[i] == search)
            {
                System.out.println(search + " is present at location " + (i + 1) + ".");
                count=0;
                break;
            }
        }

        if(count==1)
            System.out.println("not present");






    }
}
