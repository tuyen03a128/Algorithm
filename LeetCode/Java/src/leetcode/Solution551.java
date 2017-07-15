/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 * Student Attendance Record
 * 
 * You are given a string representing an attendance record for a student. The 
 * record only contains the following three characters:
 *  1. 'A' : Absent.
 *  2. 'L' : Late.
 *  3. 'P' : Present.
 * 
 * A student could be rewarded if his attendance record doesn't contain more 
 * than one 'A' (absent) or more than two continuous 'L' (late).
 * 
 * You need to return whether the student could be rewarded according to his 
 * attendance record.
 * 
 * Example 1:
 * Input: "PPALLP"
 * Output: True
 * 
 * Example 2:
 * Input: "PPALLL"
 * Output: False
 * 
 * @author Johnny
 */
public class Solution551 {
    public boolean checkRecord(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }
        
        int countAbsent = 0;
        for (int i = 0; i < s.length(); i++) {
            char state = s.charAt(i);
            if (state == 'A') {
                countAbsent++;
                if (countAbsent > 1) {
                    return false;
                }
            } else if (state == 'L') {
                if (i + 2 < s.length() && s.charAt(i + 1) == 'L' && s.charAt(i + 2) == 'L') {
                    return false;
                }
            }
        }
        
        return true;
    }   
}