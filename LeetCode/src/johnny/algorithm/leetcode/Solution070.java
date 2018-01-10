package johnny.algorithm.leetcode;

/**
 * Climbing Stairs .
 * 
 * You are climbing a stair case. It takes n steps to reach to the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can 
 * you climb to the top?
* 
 * @author Johnny
 */
public class Solution070 {
    public int climbStairs(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        // Define function, f[i] is the count of ways to climb to level i. 
        // f[i] = f[i-1] + f[i-2]
        int[] f = new int[n];
        // Initial
        f[0] = 1;
        f[1] = 2;
        // Calculate f[i]
        int i = 2;
        while(i < n) {
            f[i] = f[i-1] + f[i-2];
            i++;
        }
        // Get result;
        return f[n - 1];        
    }
    
    /*public int climbStairs(int n) {
        if (n <= 0) {
            return 0;
        }
        
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        }
        
        int[] steps = new int[n];
        steps[0] = 1;
        steps[1] = 2;
        for (int i = 2; i < n; i++) {
            steps[i] = steps[i - 1] + steps[i - 2];
        }
        return steps[n-1];
    } */
    
    
    /*
    public int climbStairs(int n) {
        if (n<=0)
            return 0;
        if (n==1)
            return 1;
        if (n==2)
            return 2;
        
        return climbStairs(n-1) + climbStairs(n-2);
    }
    
    public int climbStairs2(int n) {
        if (n<=0)
            return 0;
        if (n==1)
            return 1;
        if (n==2)
            return 2;
        
        int[] ret = new int[n+1];
        ret[0] = 0;
        ret[1] = 1;
        ret[2] = 2;
        
        for (int i=3; i<=n; i++) {
            ret[i] = ret[i-1] + ret[i-2];
        }
        return ret[n];
    }*/
}