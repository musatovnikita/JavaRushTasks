package com.javarush.task.pro.task03.task0307;

import java.util.Scanner;

/* 
Работать или не работать - вот в чем вопрос
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int age = console.nextInt();
        boolean young = (age < 20);
        boolean old = (age > 60);
        if (young || old) {
            System.out.println("можно не работать");
        }
    }
}
