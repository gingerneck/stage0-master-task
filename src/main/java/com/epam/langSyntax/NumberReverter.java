package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        System.out.println(
                new StringBuilder(Integer.valueOf(number).toString()).reverse());
    }

}
