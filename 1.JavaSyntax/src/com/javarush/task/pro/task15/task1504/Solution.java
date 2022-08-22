package com.javarush.task.pro.task15.task1504;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             var inputStream = Files.newInputStream(Paths.get(scanner.nextLine()));
             var outputStream = Files.newOutputStream(Paths.get(scanner.nextLine()))
        ) {
            byte[] byteInput = inputStream.readAllBytes();
            byte[] byteOutput = new byte[byteInput.length];

            for (int i = 0; i < byteInput.length; i = i + 2) {
                if (i < byteInput.length - 1) {
                    byteOutput[i] = byteInput[i + 1];
                    byteOutput[i + 1] = byteInput[i];
                } else {
                    byteOutput[i] = byteInput[i];
                }
            }
            outputStream.write(byteOutput);
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}

