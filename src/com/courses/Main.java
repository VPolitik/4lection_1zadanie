package com.courses;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = 36;
        int books_arr[] = new int[size];
        int sum = 0;

        for (int i = 1; i < size; ++i) {
            System.out.print("Введите кол-во книг в " + i + "-ом разделе: ");
            books_arr[i] = in.nextInt();

            sum += books_arr[i];
        }

        if (sum > 99999 && sum < 1000000)
            System.out.println("Число шестизначное");
        else
            System.out.println("Число не шестизначное");
    }
}
