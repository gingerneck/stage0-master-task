package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        var num = number;
        int sum = 0;
        while (num != 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println(sum);
    }

}
