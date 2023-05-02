package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task1
{
    public static String numberGreaterThanSeven(int num) {
        String result = null;

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String exit = "exit";
            String inputString;
            double inputNumber;

            System.out.println("Ввести любое число больше " + num);

            while (true) {
                inputString = reader.readLine();

                /*
                    exit для перехода к следующей задаче
                */
                
                if (inputString.equals(exit)) {
                    result = exit;
                    break;
                } else {
                    try {
                        inputNumber = Double.parseDouble(inputString);

                        if (inputNumber > (double) num) {
                            result = "Привет";
                            break;
                        } else
                            System.out.println("Ввести любое число больше " + num);
                    } catch (NumberFormatException e) {
                        System.out.println("Ввести любое число больше " + num);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
