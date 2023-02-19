package cs545;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExtraCredit3Test {

    ExtraCredit3 extraCredit3 = new ExtraCredit3();

    @Test
    void maxProductDifference() {
        extraCredit3.maxProductDifference(new int[]{5,6,2,7,4});
    }

    @Test
    void arrayPairSum() {
        System.out.println(
                extraCredit3.arrayPairSum(new int[]{6,2,6,5,1,2})
        );
    }

    @Test
    void answerQueries() {
        extraCredit3.answerQueries(new int[]{4,5,2,1}, new int[]{3,10,21});
    }
}