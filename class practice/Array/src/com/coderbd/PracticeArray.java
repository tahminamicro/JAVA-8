package com.coderbd;

import java.util.Arrays;

public class PracticeArray {

    public static void main(String[] args) {
        int[][] twoD = {
            {2, 3, 5},
            {9, 6, 8},
            {10, 12, 14}
        };
        for (int[] oneD : twoD) {

            Arrays.sort(oneD);
            for (int i : oneD) {
                System.out.print(i + " ");
            }

            System.out.println();

        }
    }
}
