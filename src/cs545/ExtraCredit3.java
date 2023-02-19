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
        Arrays.sort(nums);

        return  (nums[0] * nums[1]) - (nums[nums.length-2]*nums[nums.length]-1);
    }

}
