package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class TaskTest {

    @ParameterizedTest
    @CsvSource({"7"})
    public void validDataCheckTask1Test(int inputNumber) {
        ByteArrayInputStream in = new ByteArrayInputStream("8".getBytes());
        InputStream inputStream = System.in;
        System.setIn(in);
        String str = "Привет";
        Assertions.assertEquals(str, Task1.numberGreaterThanSeven(inputNumber));
        System.setIn(inputStream);
    }

    @ParameterizedTest
    @CsvSource({"Вячеслав"})
    public void validDataCheckTask2Test(String inputString) {
        ByteArrayInputStream in = new ByteArrayInputStream("Вячеслав".getBytes());
        InputStream inputStream = System.in;
        System.setIn(in);
        String str = "Привет, Вячеслав";
        Assertions.assertEquals(str, Task2.nameCheck(inputString));
        System.setIn(inputStream);
    }

    @ParameterizedTest
    @CsvSource({"3"})
    public void validDataCheckTask3Test(int inputNumber) {
        ByteArrayInputStream in = new ByteArrayInputStream("3\n2\n1\n9".getBytes());
        InputStream inputStream = System.in;
        System.setIn(in);
        String str = "9";
        Assertions.assertEquals(str, Task3.arrayMultiplicity(inputNumber));
        System.setIn(inputStream);
    }
}