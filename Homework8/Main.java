package ru.vsu.cs.course1;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(args[0]))) {
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line).append(System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] data = sb.toString().split(" ");
        int count = 0;
        for (int i = 0;i < data.length; i++) {
            if (data[i].equals("")) {
                continue;
            }
            if (data[i].contains("\r\n") && i != data.length - 1) {
                count += 2;
                continue;
            }
            count++;
        }
        System.out.println(count);
    }
}
