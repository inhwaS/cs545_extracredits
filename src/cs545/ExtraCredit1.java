package cs545;

public class ExtraCredit1 {
    /**
     * 1351. Count Negative Numbers in a Sorted Matrix
     * https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
     */
    public int countNegatives(int[][] grid) {
        int cnt = 0 ;

        for (int[] ints : grid) {
            for(int i=0; i < ints.length; i++){
                if (ints[i] < 0){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
