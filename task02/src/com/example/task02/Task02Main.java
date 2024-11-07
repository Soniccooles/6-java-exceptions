package com.example.task02;

public class Task02Main {

    public static void main(String[] args) {
        System.out.println(getSeason(-5));
    }

    static String getSeason(int monthNumber) {
        if (monthNumber <= 0 || monthNumber > 12)
        {
            throw new IllegalArgumentException("monthNumber " + monthNumber + " is invalid, month number should be between 1..12");
        }
        if (monthNumber == 12 || monthNumber < 3) return "зима";
        if (monthNumber < 6) return "весна";
        if (monthNumber < 9) return "лето";
        return "осень";
    }
}