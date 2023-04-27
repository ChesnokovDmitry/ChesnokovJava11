package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task3 {
    public static String arrayMultiplicity(int num) {
        StringBuilder result = new StringBuilder();

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String exit = "exit";
            int[] arr;
            String inputString;
            int count = 0;

            System.out.println("Ввести целое число, чтобы задать длину массива:");

            while (true) {
                inputString = reader.readLine();

                try {
                    int lengthArr = Integer.parseInt(inputString);

                    if (lengthArr < 0) {
                        lengthArr *= (-1);
                        arr = new int[lengthArr];
                        break;
                    } else if (lengthArr > 0) {
                        arr = new int[lengthArr];
                        break;
                    } else
                        System.out.println("Ввести целое число, чтобы задать длину массива:");
                } catch (NumberFormatException e) {
                    System.out.println("Ввести целое число, чтобы задать длину массива:");
                }
            }

            System.out.println("Заполнить массив данными (целые числа)");

            for (int i = 0; i < arr.length; i++) {
                inputString = reader.readLine();

                if (inputString.equals(exit)) {
                    result = new StringBuilder(exit);
                    break;
                }

                try {
                    arr[i] = Integer.parseInt(inputString);
                } catch (NumberFormatException e) {
                    System.out.println("Ввести целое число:");
                    i -= 1;
                }
            }

            System.out.print("Элементы массива кратные " + num + ": ");

            for (int i : arr) {
                if (i != 0 && i % 3 == 0) {
                    result.append(i).append(" ");
                    count++;
                }
            }

            if (count == 0)
                result = new StringBuilder("элементы отсутствуют");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result.toString().trim();
    }
}
