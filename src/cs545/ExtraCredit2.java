package cs545;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

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

    /**
     * 349. Intersection of Two Arrays
     * https://leetcode.com/problems/intersection-of-two-arrays/
     */
    public int[] intersection(int[] nums1, int[] nums2) {

        // Declare Set to remove duplicates from int arrays
        Set<Integer> sNum1 = new HashSet<>();
        Set<Integer> sNum2 = new HashSet<>();

        for (int i : nums1) {
            sNum1.add(i);
        }

        for (int i : nums2) {
            sNum2.add(i);
        }

        // Declare output set to remove duplicate
        Set<Integer> output = new HashSet<>();

        // Check the size of sets
        if ( sNum1.size() > sNum2.size() ){
            // Iterate bigger set check if the smaller set contains the value
            for (Integer integer : sNum2) {
                if ( sNum1.contains(integer) ){
                    output.add(integer);
                }
            }
        }else{
            // Iterate bigger set check if the smaller set contains the value
            for (Integer integer : sNum1) {
                if ( sNum1.contains(integer) ){
                    output.add(integer);
                }
            }
        }

        // return type should be int[]
        int[] arr = new int[output.size()];
        int idx = 0;
        for (Integer value : output) {
            arr[idx] = value;
            idx++;
        }

        return arr;
        /* Time Complexity : O(n) */
    }

}
