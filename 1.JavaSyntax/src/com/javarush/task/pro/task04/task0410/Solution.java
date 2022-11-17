package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        while (console.hasNextInt()) {
            int number = console.nextInt();
            if (number < max) {
                min = max;
                max = number;
            } else if (number < min && number != max) {
                min = number;
            }
        }
        System.out.println(min);
    }
}