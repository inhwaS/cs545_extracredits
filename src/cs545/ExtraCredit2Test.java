package cs545;

import org.junit.jupiter.api.Test;

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
}