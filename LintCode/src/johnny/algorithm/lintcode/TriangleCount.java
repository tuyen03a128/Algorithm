/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.lintcode;

import java.util.Arrays;

/**
 * Triangle Count.
 * Given an array of integers, how many three numbers can be found in the array,
 * so that we can build an triangle whose three edges length is the three 
 * numbers that we find?
 * 
 * Example
 * Given array S = [3,4,6,7], return 3. They are:
 * 
 * [3,4,6]
 * [3,6,7]
 * [4,6,7]
 * 
 * Given array S = [4,4,4,4], return 4. They are:
 * 
 * [4(1),4(2),4(3)]
 * [4(1),4(2),4(4)]
 * [4(1),4(3),4(4)]
 * [4(2),4(3),4(4)]
 * @author Johnny
 */
public class TriangleCount {
    public int triangleCount(int[] S) {
        // write your code here
        if (S == null || S.length < 3) {
            return 0;
        }

        Arrays.sort(S);
        int count = 0;
        for (int i = 0; i < S.length; i++) {
            int start = 0;
            int end = i - 1;
            while (start < end) {
                if (S[start] + S[end] <= S[i]) {
                    start++;
                } else {
                    count += end - start;
                    end--;
                }
            }
        }

        return count;
    }
}
