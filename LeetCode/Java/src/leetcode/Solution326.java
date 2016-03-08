/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 * Power of Three.
 * Given an integer, write a function to determine if it is a power of three.
 * 
 * Follow up:
 * Could you do it without using any loop / recursion?
 * 
 * @author Johnny
 */
public class Solution326 {
    //http://blog.csdn.net/ebowtang/article/details/50485622
    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        return (1162261467 % n) == 0; //1162261467 is the bigest power of 3 in integer
    }
}
