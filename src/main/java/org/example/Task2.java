package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task2 {
    public static String nameCheck(String str) {
        String result = null;

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String exit = "exit";
            String inputString;

            System.out.println("Ввести имя " + str);

            while (true) {
                inputString = reader.readLine();

                if (inputString.equals(str)) {
                    result = "Привет, " + str;
                    break;
                } else if (inputString.equals(exit)) {
                    result = exit;
                    break;
                } else
                    System.out.println("Ввести имя " + str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
}
