package com.epam.algorithms;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {
        return new String[]{
                "winter", "spring", "summer", "autumn"
        };
    }

    /**
     * Generate an int[] array of consecutive positive integers starting at 1 of the given length (length parameter >
     * 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1] length = 3  -> [1, 2, 3] length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {
        var res = new int[length];
        for (int i = 1; i <= length; i++) {
            res[i - 1] = i;
        }
        return res;
    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9 arr = [5, -3, -4] -> sum = -2
     */
    public int totalSum(int[] arr) {
        var res = 0;
        for (int j : arr) {
            res += j;
        }
        return res;
    }

    /**
     * Return the index of the first occurrence of number in the arr array. If there is no such element in the array,
     * return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2 arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {
        var res = -1;
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
                res = i;
                break;
            }
        }
        return res;
    }

    /**
     * Return the new String[] array obtained from the arr array by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"] arr = ["pineapple", "apple", "pen"] -> ["pen", "apple",
     * "pineapple"]
     */
    public String[] reverseArray(String[] arr) {
        var res = new String[arr.length];
        var resLength = arr.length - 1;
        for (int i = resLength; i >= 0; i--) {
            res[resLength - i] = arr[i];
        }
        return res;
    }

    /**
     * Return new int[] array obtained from arr int[] array by choosing positive numbers only. P.S. 0 is not a positive
     * number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3] arr = [-1, -2, -3]   -> [] arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {
        var positive = 0;
        for (int j : arr) {
            if (j > 0) {
                positive++;
            }
        }
        var res = new int[positive];
        positive = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                res[positive++] = arr[i];
            }
        }
        return res;
    }

    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules: Incoming one-dimensional arrays
     * must be arranged in ascending order of their length; numbers in all one-dimensional arrays must be in ascending
     * order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]] arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public int[][] sortRaggedArray(int[][] arr) {

        for (int z = 0; z < arr.length; z++) {
            var arrToRange = arr[z];
            for (int i = 0; i < arrToRange.length; i++) {
                var min = arrToRange[i];
                var indexmin = i;
                for (int j = i + 1; j < arrToRange.length; j++) {
                    if (min > arrToRange[j]) {
                        indexmin = j;
                    }
                }
                if (i != indexmin) {
                    var temp = arrToRange[i];
                    arrToRange[i] = arrToRange[indexmin];
                    arrToRange[indexmin] = temp;
                }
            }
        }
        for (int z = 0; z < arr.length; z++) {
            var min = arr[z].length;
            var indexmin = z;
            for (int i = z + 1; i < arr.length; i++) {
                if ((arr[i].length != min) && (arr[i].length < min)) {
                    min = arr[i].length;
                    indexmin = i;
                }
            }
            if (indexmin != z) {
                arr = swap(arr, indexmin, z);
            }

        }

        return arr;
    }

    private int[][] swap(int[][] arr, int indexmin, int current) {
        var res = new int[arr.length][];
        res[current] = arr[indexmin];
        res[current + 1] = arr[current];
        for (int i = 0; i < current; i++) {
            res[i] = arr[i];
        }
        int resCount = 1;
        for (int i = current + 1; i < arr.length; i++) {
            if (i == indexmin) {
                resCount = 0;
                continue;
            }
            res[i + resCount] = arr[i];
        }
        return res;
    }
}
