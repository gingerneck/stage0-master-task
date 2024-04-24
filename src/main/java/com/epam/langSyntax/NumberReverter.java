package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        var res = 0;
        for (; number != 0; number /= 10) {
            int mod = number % 10;
            res = res * 10 + mod;
        }
        System.out.println(res);
    }
}
