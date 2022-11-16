package com.javarush.task.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        int height = 0;
        while (height <= 9) {
            int weight = 0;
            while (weight <= 19) {
                if (height == 0 || height == 9) {
                    System.out.print("Б");
                } else if (weight == 0 || weight == 19) {
                    System.out.print("Б");
                } else {
                    System.out.print(" ");
                }
                weight++;
            }
            System.out.println();
            height++;
        }
    }
}