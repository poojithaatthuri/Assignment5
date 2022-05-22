package com.bridgelabzs;
import java.util.Scanner;
public class PowerOfTwo {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the  Number: ");
        int num = scanner. nextInt();
        int p=3;
        int power = 1;
        for (int i = 1; i <= p; i++)
        {

            power = power * num;
        }

        System.out.println(power);


    }

}