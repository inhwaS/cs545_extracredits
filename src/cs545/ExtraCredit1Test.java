package cs545;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExtraCredit1Test {

    ExtraCredit1 extraCredit1 = new ExtraCredit1();

    @Test
    void countNegatives() {
        System.out.println(
                extraCredit1.countNegatives(new int[][]{ {4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}})
        );
    }

    @Test
    void sortSentence() {
        System.out.println(
                extraCredit1.sortSentence("is2 sentence4 This1 a3")
        );

    }

    @Test
    void sortPeople() {
        System.out.println(
                extraCredit1.sortPeople(new String[]{"Mary","John","Emma"}, new int[]{180,165,170})
        );
    }
}