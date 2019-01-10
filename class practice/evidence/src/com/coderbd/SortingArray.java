package com.coderbd;

import java.util.Arrays;

public class SortingArray {

    public static void main(String[] args) {
        int[][] twoD = {
            {5, 4, 2},
            {9, 7, 10},
            {23, 54, 7}
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
