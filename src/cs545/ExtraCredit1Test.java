package cs545;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExtraCredit1Test {

    @Test
    void countNegatives() {
        ExtraCredit1 extraCredit1 = new ExtraCredit1();

        System.out.println(
                extraCredit1.countNegatives(new int[][]{ {4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}})
        );
    }
}