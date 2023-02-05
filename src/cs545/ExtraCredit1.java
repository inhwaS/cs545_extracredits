package cs545;

import java.util.*;

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

        /* Running time for the algorithms: O(n^2) */
        return cnt;
    }


    /**
     * 1859. Sorting the Sentence
     * https://leetcode.com/problems/sorting-the-sentence/
     */
    public String sortSentence(String s) {
        // Split the input by blank space
        String[] words = s.split(" ");

        // Create a return String array with the size of input
        String[] rtn = new String[words.length];

        // idx is for the input that does not have sequence at the end
        int idx = 0;

        for (String word : words) {

            // Get the last character
            String substring = word.substring(word.length()-1, word.length());

            // If the last character is a letter then we have to shuffle
            if ( Character.isLetter(substring.toCharArray()[0]) ){
                rtn[idx] = word+(idx+1);
                idx++;
            }else{
                // If the last character is a number, we need to shuffle for original position
                rtn[Integer.parseInt(substring)-1] = word.substring(0, word.length()-1);
            }

        }

        StringBuilder rtnVal = new StringBuilder();
        for (String s1 : rtn) {
            rtnVal.append(s1).append(" ");
        }

        /* Running time for the algorithms: O(n) */
        // We have to remove blank space at the end
        return rtnVal.toString().substring(0, rtnVal.length()-1);
    }

    /**
     * 2418. Sort the People
     * https://leetcode.com/problems/sort-the-people/
     */
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> hm = new HashMap<>();
        List<Integer> hs = new ArrayList<>();

        int idx = 0;
        for (String name : names) {
            hm.put(heights[idx], name);
            hs.add(idx, heights[idx]);
            idx++;
        }

        Collections.sort(hs, Collections.reverseOrder());

        String[] rtn = new String[names.length];
        for(int i = 0 ; i < hs.size(); i++){
            rtn[i] = hm.get(hs.get(i));
        }

        return rtn;
    }
}
