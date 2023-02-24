package cs545;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExtraCredit4Test {

    ExtraCredit4 extraCredit4 = new ExtraCredit4();


    @Test
    void mergeSimilarItems() {
        int[][] ints = new int[][]{{1,1},{4,5},{3,8}};
        int[][] ints2 = new int[][]{{3,1},{1,5}};
        extraCredit4.mergeSimilarItems(ints, ints2);
    }

    @Test
    void sortArrayByParityII() {
        extraCredit4.sortArrayByParityII(new int[]{3,0,4,0,2,1,3,1,3,4});
    }

}