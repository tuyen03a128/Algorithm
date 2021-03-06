package johnny.algorithm.leetcode;

/**
 * Merge Sorted Array.
 * 
 * Given two sorted integer arrays A and B, merge B into A as one sorted array.
 * Note:
 * You may assume that A has enough space (size that is greater or equal 
 * to m + n) to hold additional elements from B. The number of elements 
 * initialized in A and B are m and n respectively.
* 
 * @author Johnny
 */
public class Solution088 {
    public void merge(int nums1[], int m, int nums2[], int n) {
        if(nums1 == null || nums1.length == 0) {
            return;
        }
        if(nums2 == null || nums2.length == 0) {
            return;
        }
        
        int i = m - 1;
        int j = n - 1;
        int end = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[end] = nums1[i];
                i--;
            } else {
                nums1[end] = nums2[j];
                j--;
            }
            end--;
        }
        
        if (j >= 0) {
            for (int k = j; k >= 0; k--) {
                nums1[end] = nums2[k];
                end--;
            }
        }
    }
}
