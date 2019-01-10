package com.coderbd;

import java.util.Arrays;

public class SortingArray {

    public static void main(String[] args) {
        int[][] twoD = {
            {2, 4, 1},
            {5, 9, 8},
            {12, 14, 11}
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
