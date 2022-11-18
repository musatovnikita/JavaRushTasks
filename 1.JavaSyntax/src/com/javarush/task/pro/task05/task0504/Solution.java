package com.javarush.task.pro.task05.task0504;

/* 
Объединяем массивы
*/

public class Solution {
    public static int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    public static int[] resultArray = new int[firstArray.length + secondArray.length];

    public static void main(String[] args) {
        for (int a = 0; a < firstArray.length; a++) {
            resultArray[a] = firstArray[a];
        }
        for (int b = 0; b < secondArray.length; b++) {
            resultArray[b + firstArray.length] = secondArray[b];
        }
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + ", ");
        }
    }
}
