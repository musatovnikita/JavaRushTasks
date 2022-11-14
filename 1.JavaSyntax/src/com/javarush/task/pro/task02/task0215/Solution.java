package com.javarush.task.pro.task02.task0215;

import java.util.Scanner;

/* 
Чтение чисел
*/

public class Solution {

    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        int age1 = console.nextInt();
        int age2 = console.nextInt();
        int age3 = console.nextInt();
        int age4 = (age1 + age2 + age3) / 3;
        System.out.println(age4);
    }
}
