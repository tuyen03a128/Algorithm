package johnny.algorithm.leetcode;

/**
 * Reverse Words in a String III
 * 
 * Given a string, you need to reverse the order of characters in each word 
 * within a sentence while still preserving whitespace and initial word order.
 * 
 * Example 1:
 * Input: "Let's take LeetCode contest"
 * Output: "s'teL ekat edoCteeL tsetnoc"
 * 
 * Note: In the string, each word is separated by single space and there will 
 * not be any extra space in the string.
 * 
 * @author Johnny
 */
public class Solution557 {
    public String reverseWords(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        
        int len = s.length();
        int slow = 0;
        int fast = 1;
        char[] chs = s.toCharArray();
        while (slow < len && fast < len) {
            while (fast < len) {
                if (chs[fast] == ' ') {
                    reverse(chs, slow, fast - 1);
                    break;
                } else if (fast == len - 1) {
                    reverse(chs, slow, fast);
                    break;
                }
                fast++;
            }
            slow = fast;
        }
        
        return new String(chs);
    }
    
    public String reverseWords2(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }
        
        s = s.trim();
        char[] letters = s.toCharArray();
        int start = 0;
        int index = 0;
        
        while (index < letters.length) {
            if (letters[index] == ' ') {
                reverse(letters, start, index - 1);
                while (index < letters.length && letters[index] == ' ') {
                    index++;
                }
                start = index;
            } else {
                index++;
            }
        }
        
        reverse(letters, start, index - 1);
        
        return String.valueOf(letters);
    }
    
    private void reverse(char[] letters, int start, int end) {
        if (start >= letters.length || end >= letters.length || start >= end) {
            return;
        }
        
        while (start < end) {
            char temp = letters[start];
            letters[start] = letters[end];
            letters[end] = temp;
            start++;
            end--;
        }
    }
}
