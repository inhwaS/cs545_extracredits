package cs545;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExtraCredit5Test {

    ExtraCredit5 extraCredit5 = new ExtraCredit5();

    @Test
    void minimumSum() {
        System.out.println(
                extraCredit5.minimumSum(4009)
        );
    }

    @Test
    void getDecimalValue() {
        ExtraCredit5.ListNode node = new ExtraCredit5.ListNode(1, new ExtraCredit5.ListNode(0, new ExtraCredit5.ListNode(1)));

        extraCredit5.getDecimalValue(node);

    }

    @Test
    void middleNode() {

        ExtraCredit5.ListNode node = new ExtraCredit5.ListNode(1, new ExtraCredit5.ListNode(0, new ExtraCredit5.ListNode(1)));

        extraCredit5.middleNode(node);
    }
}