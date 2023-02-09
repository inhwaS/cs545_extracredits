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

    }

}
