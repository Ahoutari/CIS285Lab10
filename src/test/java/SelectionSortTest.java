import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Assert;

public class SelectionSortTest {
    private SelectionSort selectionSort;

    @Before
    public void setUp() {
        selectionSort = new SelectionSort();
    }

    @Test
    public void test() {
        testPositive();
        testNegative();
        testMixed();
        testDuplicates();
    }

    public void testPositive() {
        /** Test data contains positive values only **/

    }

    public void testNegative(){
        /** Test data contains negative values only **/


    }

    public void testMixed() {
        // Test data contains with both positive, negative and zeros
    }

    public void testDuplicates() {
        // Test data contains duplicates
    }

}