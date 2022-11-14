package com.javarush.task.pro.task02.task0208;

/* 
Пустота и пробелы
*/

public class Solution {

    public static void main(String[] args) {
        String emptiness = "пустота";
        String space = " ";
        String fullness = emptiness + space + emptiness + space + emptiness;
        System.out.println(fullness);
    }
}
