package cs545;

import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class ExtraCredit2Test {

    ExtraCredit2 extraCredit2 = new ExtraCredit2();

    @Test
    void sortArrayByParity() {
        extraCredit2.sortArrayByParity(
                new int[]{0,1,2}
        );
    }

    @Test
    void heightChecker() {
        System.out.println(
                extraCredit2.heightChecker(new int[]{5,1,2,3,4})
        );
    }

    @Test
    void intersection() {
        int[] intersection = extraCredit2.intersection(new int[]{4,9,5}, new int[]{9,4,9,8,4});
        for (int i : intersection) {
            System.out.println(i);
        }
    }
}