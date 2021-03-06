package johnny.algorithm.leetcode;

/**
 * 942. DI String Match
Given a string S that only contains "I" (increase) or "D" (decrease), let N = S.length.

Return any permutation A of [0, 1, ..., N] such that for all i = 0, ..., N-1:

If S[i] == "I", then A[i] < A[i+1]
If S[i] == "D", then A[i] > A[i+1]
 

Example 1:

Input: "IDID"
Output: [0,4,1,3,2]
Example 2:

Input: "III"
Output: [0,1,2,3]
Example 3:

Input: "DDI"
Output: [3,2,0,1]
 

Note:

1 <= S.length <= 10000
S only contains characters "I" or "D".

 * @author Johnny
 */
public class Solution942 {
    public int[] diStringMatch(String S) {
        if (S == null || S.length() == 0) {
            return null;
        }
        
        int left = 0;
        int right = S.length();
        int[] res = new int[S.length() + 1];
        int index = 0;
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c == 'I') {
                res[index] = left;
                left++;
            } else {
                res[index] = right;
                right--;
            }
            index++;
        }
        res[index] = left;
        return res;
    }
}
