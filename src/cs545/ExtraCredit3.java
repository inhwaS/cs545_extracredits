package cs545;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ExtraCredit3 {

    /**
     * 1913. Maximum Product Difference Between Two Pairs
     * https://leetcode.com/problems/maximum-product-difference-between-two-pairs/
     */
    public int maxProductDifference(int[] nums) {
        // This is too simple to sort and inefficient to sort
//        Arrays.sort(nums);

        // Changed based on solution
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for(int val : nums){
            // Set the first two maximum values
            if(val > max1){
                max2 = max1;
                max1 = val;
            } else if(val > max2){
                max2 = val;
            }

            // Set the first two minimum values
            if(val < min1){
                min2 = min1;
                min1 = val;
            } else if(val < min2){
                min2 = val;
            }
        }

        return (max1 * max2) - (min1 * min2);
        /* Time complexity : O(n) */
    }


    /**
     * 561. Array Partition
     * https://leetcode.com/problems/array-partition/
     */
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);

        int sum = 0;
        for (int i = 0 ; i < nums.length; i = i + 2) {
            sum += Math.min( nums[i], nums[i+1]);
        }

        return sum;

    }

}
