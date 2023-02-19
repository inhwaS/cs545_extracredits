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
        /* Time Complexity : O(N*logN) - sorting by Array.sort() takes n*logN */

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
        /* Time Complexity : O(n) */
    }


    /**
     * 561. Array Partition
     * https://leetcode.com/problems/array-partition/
     */
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);

        int sum = 0;
        for (int i = 0 ; i < nums.length; i = i + 2) {
            // figured out that I do not need to compare again if it is already sorted!!
//            sum += Math.min( nums[i], nums[i+1]);

            sum += nums[i];
        }

        return sum;
        /* Time Complexity : O(n*logN) */

    }

    /**
     * 2389. Longest Subsequence With Limited Sum
     * https://leetcode.com/problems/longest-subsequence-with-limited-sum/
     */
    public int[] answerQueries(int[] nums, int[] queries) {
        int[] rtn = new int[queries.length];
        // Sort given values first
        Arrays.sort(nums);

        for(int i = 0 ; i < queries.length; i++ ){
            // set target number first
            int diff = queries[i];

            // count for  index passed from nums array
            int cnt = 0;
            for(int j = 0; j < nums.length; j++ ){

                // still need to check next value from nums array
                if ( diff >= nums[j] ){
                    // increment count
                    cnt++;
                    // decrement remain value
                    diff -= nums[j];
                }else{
                    // finished counting
                    break;
                }
            }
            rtn[i] = cnt;
        }

        return rtn;
        /* Time Complexity : O(n*longN)*/
    }

}
