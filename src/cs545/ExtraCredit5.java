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


    /**
     * 1290. Convert Binary Number in a Linked List to Integer
     * https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
     */
    public int getDecimalValue(ListNode head) {

        // My previous solution
//        ListNode cur = head;
//
//        String val = "";
//        while ( cur != null ){
//            val += cur.val;
//            cur = cur.next;
//        }
//
//        return Integer.parseInt(val, 2);

        // Another better solution from Discussion
        int sum = 0;

        while (head != null){
            sum *= 2;
            sum += head.val;
            head = head.next;
        }
        return sum;
    }


    /**
     * 876. Middle of the Linked List
     * https://leetcode.com/problems/middle-of-the-linked-list/
     */
    public ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while ( fast != null && fast.next != null ){
            // fast goes 2 steps every time
            fast = fast.next.next;

            // fast goes 1 step every time
            slow = slow.next;
        }

        // If there is n elements, fast reaches at the end at n/2 round
        //      which means slow is at n/2 position
        return slow;

    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


}
