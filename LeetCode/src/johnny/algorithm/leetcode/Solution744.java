package johnny.algorithm.leetcode;

/**
 * 
 744. Find Smallest Letter Greater Than Target
Given a list of sorted characters letters containing only lowercase letters, and given a target letter target, find the smallest element in the list that is larger than the given target.

Letters also wrap around. For example, if the target is target = 'z' and letters = ['a', 'b'], the answer is 'a'.

Examples:
Input:
letters = ["c", "f", "j"]
target = "a"
Output: "c"

Input:
letters = ["c", "f", "j"]
target = "c"
Output: "f"

Input:
letters = ["c", "f", "j"]
target = "d"
Output: "f"

Input:
letters = ["c", "f", "j"]
target = "g"
Output: "j"

Input:
letters = ["c", "f", "j"]
target = "j"
Output: "c"

Input:
letters = ["c", "f", "j"]
target = "k"
Output: "c"
Note:
letters has a length in range [2, 10000].
letters consists of lowercase letters, and contains at least 2 unique letters.
target is a lowercase letter.
 * @author Johnny
 */
public class Solution744 {
    public char nextGreatestLetter(char[] letters, char target) {
        if (letters == null || letters.length == 0) {
            return target;
        }
        
        int start = 0;
        int end = letters.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            char c = letters[mid];
            if (c > target) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        
        if (end <= letters.length - 1 && letters[end] > target) {
            return letters[end];
        } else {
            return letters[0];
        }
    }
}
