package cs545;

import java.util.Arrays;
import java.util.HashMap;

public class ExtraCredit2 {

    /**
     * 905. Sort Array By Parity
     * https://leetcode.com/problems/sort-array-by-parity/
     *
     */
    public int[] sortArrayByParity(int[] nums) {
        int i = 0;
        int j = nums.length - 1;

        while ( j >= i ){
            if ( nums[i] % 2 != 0 & nums[j] % 2 != 1){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }else if ( nums[i] % 2 == 0 & nums[j] % 2 != 1){
                i++;
            }else if ( nums[i] % 2 != 0 & nums[j] % 2 == 1){
                j--;
            }else{
                i++;
                j--;
            }
        }
        return nums;
        /* Time Complexity : O(n) */

    }

    /**
     * 1051. Height Checker
     * https://leetcode.com/problems/height-checker/
     */
    public int heightChecker(int[] heights) {
        int[] original = new int[heights.length];

        // I need to copy every value because assigning to new int will copy by reference
        for (int i  = 0 ; i < heights.length; i++) {
            original[i] = heights[i];
        }

        // sort the height in non-decreasing order
        Arrays.sort(heights);

        int diffCnt = 0;
        for (int i = 0 ; i < heights.length; i++) {
            if ( heights[i] != original[i]){
                diffCnt++;
            }
        }

        return diffCnt;
        /* Time Complexity : O(n) */
    }

}
