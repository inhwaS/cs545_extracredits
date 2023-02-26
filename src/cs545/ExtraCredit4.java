package cs545;

import java.util.*;

public class ExtraCredit4 {

    /**
     * 2363. Merge Similar Items
     * https://leetcode.com/problems/merge-similar-items/
     */
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        TreeMap<Integer, Integer> hm = new TreeMap<>();
        for (int[] ints : items1) {
            hm.put(ints[0], ints[1]);
        }

        for (int[] ints : items2) {
            hm.put(ints[0],ints[1]+hm.getOrDefault( ints[0], 0));
        }


        List<List<Integer>> output = new ArrayList<>();

        for (Integer integer : hm.keySet()) {
            List<Integer> elem = new ArrayList<>();
            elem.add(integer);
            elem.add(hm.get(integer));
            output.add(elem);
        }
        return output;

    }



    /**
     * 922. Sort Array By Parity II
     * https://leetcode.com/problems/sort-array-by-parity-ii/
     */
    public int[] sortArrayByParityII(int[] nums) {
        // even index starts
        int even = 0;
        // odd index starts
        int odd = 1;

        while ( odd < nums.length && even < nums.length ){
            // if the even index is not a even number
            if ( nums[even] % 2 != 0 ){
                // should swap with odd index value
                swap(nums, even, odd);
                odd += 2;
            }else{
                even += 2;
            }
        }

        return nums;
    }

    public void swap(int[] arr , int e1 , int e2){
        int temp = arr[e1];
        arr[e1] = arr[e2];
        arr[e2] = temp ;
    }


    /**
     * 2089. Find Target Indices After Sorting Array
     * https://leetcode.com/problems/find-target-indices-after-sorting-array/
     */
    public List<Integer> targetIndices(int[] nums, int target) {

        // This was my first solution
//        Arrays.sort(nums);
//
//        List<Integer> out = new ArrayList<>();
//        for (int i = 0 ; i < nums.length ; i++) {
//            if ( nums[i] == target ){
//                out.add(i);
//            }
//        }
//        return out;

        // I figured out that I do not need to sort array
        // These are better algorithm as solution
        int smaller = 0;
        int equal = 0;
        // Here, we need to count how many numbers are same to target,
        //                    and how many are smaller than the target
        for (int num : nums) {
            if (num < target) {
                smaller++;
            } else if (num == target) {
                equal++;
            }
        }
        List<Integer> indices = new ArrayList<>(equal);

        // start from smaller than count, to smaller+equal count
        // smaller count == start of equal count
        for (int i = smaller; i < smaller + equal; i++) {
            indices.add(i);
        }
        return indices;

    }


}
