package com;

import com.dao.Read_CSV;

import java.io.IOException;

public class Main {
    public static Read_CSV readFile = new Read_CSV();
    public static void main(String[] args) throws IOException {
        readFile.readFileCSV("companies.csv");
        System.out.println("Hello");
        System.out.println("Sài git lần 2");
        System.out.println("Sua code demo");
        int a = 8;
        int b = 5;
        System.out.println("Sua code feature-test");
        System.out.println(a + b);
    }
}
