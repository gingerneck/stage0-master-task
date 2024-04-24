package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        if (cathetusLength == 0) {
            System.out.println("");
        } else if (cathetusLength == 1) {
            System.out.println("1");
        } else if (cathetusLength > 1) {
            for (int i = cathetusLength; i != 0; i--) {

            }
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
