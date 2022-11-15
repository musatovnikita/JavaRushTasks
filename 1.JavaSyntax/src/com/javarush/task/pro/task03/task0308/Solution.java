package com.javarush.task.pro.task03.task0308;

import java.util.Scanner;

/* 
Координатные четверти
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int x = console.nextInt();
        int y = console.nextInt();
        boolean chapter1 = (x > 0 && y > 0);
        boolean chapter2 = (x < 0 && y > 0);
        boolean chapter3 = (x < 0 && y < 0);
        boolean chapter4 = (x > 0 && y < 0);
        if (chapter1)
            System.out.println(1);
        if (chapter2)
            System.out.println(2);
        if (chapter3)
            System.out.println(3);
        if (chapter4)
            System.out.println(4);
    }
}
