package ex38;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilterEvensTest {

    @Test
    void filterEvenNumberNormal() {
        int array[]={1,2,3,4,5,6,7};
        FilterEvens filterEvens=new FilterEvens();
        int arrayNew[]=filterEvens.filterEvenNumber(array);
        assertEquals(3,arrayNew.length);
    }

    @Test
    void filterEvenNumberTestNoEvens() {
        int array[]={1,1,3,3,5,3,7};
        FilterEvens filterEvens=new FilterEvens();
        int arrayNew[]=filterEvens.filterEvenNumber(array);
        assertEquals(0,arrayNew.length);
    }
}