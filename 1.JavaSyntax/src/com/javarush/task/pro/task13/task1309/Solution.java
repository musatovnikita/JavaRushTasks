package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Роман", 5.4d);
        grades.put("Дмитрий", 3.4d);
        grades.put("Александр", 4.8d);
        grades.put("Иван", 3.9d);
        grades.put("Алексей", 2.7d);
    }
}
