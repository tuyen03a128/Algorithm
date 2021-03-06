package johnny.algorithm.leetcode;

/**
 * Ransom Note
 * 
 * Given an arbitrary ransom note string and another string containing letters 
 * from all the magazines, write a function that will return true if the ransom 
 * note can be constructed from the magazines ; otherwise, it will return false.
 * Each letter in the magazine string can only be used once in your ransom note.
 * 
 * Note:
 * You may assume that both strings contain only lowercase letters.
 * canConstruct("a", "b") -> false
 * canConstruct("aa", "ab") -> false
 * canConstruct("aa", "aab") -> true
 * 
 * @author Johnny
 */ 
public class Solution383 { 
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote == null || ransomNote.isEmpty()) {
            return true;
        }
        
        if (magazine == null || magazine.isEmpty() 
                || ransomNote.length() > magazine.length()) {
            return false;
        }
        
        int[] countNote = new int[26];
        char[] arrayNote = ransomNote.toCharArray();
        for (int i = 0; i < arrayNote.length; i++) {
            countNote[arrayNote[i] - 'a']++;
        }
        
        int[] countMag = new int[26];
        char[] arrayMag = magazine.toCharArray();
        for (int i = 0; i < arrayMag.length; i++) {
            countMag[arrayMag[i] - 'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            if (countNote[i] > countMag[i]) {
                return false;
            }
        }
        
        return true;
    }
}
