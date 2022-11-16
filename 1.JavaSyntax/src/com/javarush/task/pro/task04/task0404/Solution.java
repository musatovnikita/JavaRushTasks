package com.javarush.task.pro.task04.task0404;

/* 
Заполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        int numberOne = 0;
        while (numberOne < 5) {
            int numberTwo = 0;
            while (numberTwo < 10) {
                System.out.print("Q");
                numberTwo++;
            }
            System.out.println();
            numberOne++;
        }
    }
}