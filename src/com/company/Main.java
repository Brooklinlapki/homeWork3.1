package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double sum = 0.0;
        int count = 0;
        boolean isNegative = false;


        double[] average = {-34.2, 54.6, -92.4, 28.5, 48.5, 29.7, 66.4};
        for (double number : average) {
            if (number < 0) {
                isNegative = true;
            } else if (isNegative) {
                sum += number;
                count++;
            }
        }
        System.out.println("Среднее арифметическое число: " + sum / count);
    }
}
