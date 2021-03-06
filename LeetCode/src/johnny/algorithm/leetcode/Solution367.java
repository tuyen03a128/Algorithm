package johnny.algorithm.leetcode;

/**
 * Valid Perfect Square.
 * 
 * Given a positive integer num, write a function which returns True if num is 
 * a perfect square else False.
 * 
 * Note: Do not use any built-in library function such as sqrt.
 * Example 1:
 * Input: 16, Returns: True
 * 
 * Example 2: 
 * Input: 14, Returns: False
 *  
 * @author Johnny
 */
public class Solution367 {
    // Binary search, log(n)
    public boolean isPerfectSquare2(int num) {
        if (num < 0) {
            return false;
        }
        
        if (num == 0) {
            return true;
        }
        
        long start = 1;
        long end = num;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            long product = mid * mid;
            if (product > num) {
                end = mid - 1;
            } else if (product < num) {
                start = mid + 1;
            } else {
                return true;
            }
        }
        
        return false;
    }
    
    // Newton Method
    public boolean isPerfectSquare(int num) {
        long x = num;
        while (x * x > num) {
            x = (x + num / x) >> 1;
        }
        return x * x == num;
    }
}
