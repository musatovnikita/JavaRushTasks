package com.javarush.task.pro.task04.task0416;

import java.util.Scanner;

/* 
Share a Coke
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int numberJar = console.nextInt();
        int numberPersons = console.nextInt();
        double result = 1.0 * numberJar / numberPersons;
        System.out.println(result);
    }
}