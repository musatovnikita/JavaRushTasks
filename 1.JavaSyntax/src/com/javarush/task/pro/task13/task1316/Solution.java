package com.javarush.task.pro.task13.task1316;

public class Solution {

    public static void main(String[] args) {
        JavarushQuest[] quest = JavarushQuest.values();
        for (int i = 0; i < quest.length; i++) {
            System.out.println(quest[i].ordinal());
        }
    }
}
