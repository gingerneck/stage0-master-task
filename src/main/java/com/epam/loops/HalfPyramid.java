package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        if (cathetusLength == 0) {
            System.out.print("");
        } else if (cathetusLength == 1) {
            System.out.println("1");
        } else if (cathetusLength > 1) {
            for (int i = 1; i < cathetusLength + 1; i++) {

                for (int j = 0; j < cathetusLength - i; j++) {
                    System.out.print(" ");
                }
                for (int k = i; k > 0; k--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
