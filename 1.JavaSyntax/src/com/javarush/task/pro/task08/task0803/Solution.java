package com.javarush.task.pro.task08.task0803;

import java.util.Scanner;

/* 
Минимальный элемент массива
*/

public class Solution {

    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        int min = Integer.MAX_VALUE;
        int curentMin = Integer.MAX_VALUE;
        for (int i = 0; i < 10; i= i + 2) {
            curentMin = Math.min(ints[i], ints[i + 1]);
            min = Math.min(curentMin, min);
        }
        return min;
    }

    public static int[] getArrayOfTenElements() {
        Scanner console = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = console.nextInt();

        }
        return array;
    }
}
