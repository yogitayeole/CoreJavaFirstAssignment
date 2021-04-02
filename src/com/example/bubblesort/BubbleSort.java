package com.example.bubblesort;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        int n, temp = 0, count = 1;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();

        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (a[j - 1] > a[j]) {

                    temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }

            }
        }
        System.out.println("Array After Bubble Sort");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");


        }
    }
}
