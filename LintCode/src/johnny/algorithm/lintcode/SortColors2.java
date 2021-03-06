/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.lintcode;

/**
 * Sort Colors II
 * @author Johnny
 */
public class SortColors2 {
    public void sortColors2(int[] colors, int k) {
        // write your code here
        if (colors == null || colors.length == 0) {
            return;
        }

        int[] counts = new int[k];

        for (int i = 0; i < colors.length; i++) {
            counts[colors[i] - 1]++;
        }

        int i = 0;
        while (i < colors.length) {
            for (int p = 1; p <= k; p++) {
                for (int j = 0; j < counts[p - 1]; j++) {
                    colors[i] = p;
                    i++;
                }
            }           
        }
    }
}
