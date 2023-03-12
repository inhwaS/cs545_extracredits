package cs545;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExtraCredit6Test {

    ExtraCredit6 extraCredit6 = new ExtraCredit6();

    @Test
    void maxDepth() {
        System.out.println(extraCredit6.maxDepth("(1)+((2))+(((3)))"));
    }

    @Test
    void removeOuterParentheses() {
        System.out.println( extraCredit6.removeOuterParentheses("(()())(())(()(()))"));
    }

    @Test
    void countStudents() {
        extraCredit6.countStudents(new int[]{1,1,1,0,0,1}, new int[]{1,0,0,0,1,1});
    }
}