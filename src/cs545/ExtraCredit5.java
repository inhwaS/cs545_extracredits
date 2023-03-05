package cs545;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class ExtraCredit5 {

    /**
     * 2160. Minimum Sum of Four Digit Number After Splitting Digits
     * https://leetcode.com/problems/minimum-sum-of-four-digit-number-after-splitting-digits/
     */
    public int minimumSum(int num) {
        char[] digits = String.valueOf(num).toCharArray();
        Arrays.sort(digits);
//        int num1 = Integer.parseInt(String.valueOf(digits[0]) + String.valueOf(digits[3]));
//        int num2 = Integer.parseInt(String.valueOf(digits[1]) + String.valueOf(digits[2]));

        // This way, we don't need to convert string
        int num1 = digits[0] * 10 + digits[3];
        int num2 = digits[1] * 10 + digits[2];

        return num1 + num2;
    }


}
