package com.javarush.task.pro.task05.task0507;

import java.util.Scanner;

/* 
Максимальное из N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        array = new int[number];

        for (int i = 0; i < array.length; i++) {
            array[i] = console.nextInt();
        }
        int numberMax = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > numberMax)
                numberMax = array[i];
        }
        System.out.println(numberMax);
    }
}
