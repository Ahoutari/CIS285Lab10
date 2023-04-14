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

        int arr[] = {5, -4, 3, 1, -7};
        int sorted[] = {-7, -4, 1, 3, 5};

        int[] result = selectionSort.basicSelectionSort(arr);

        assertArrayEquals(sorted, result);
    }

    public void testDuplicates() {
        // Test data contains duplicates

        int arr[] = {5, 5, -3, -3, 0 , 0};
        int sorted[] = {-3, -3, 0, 0, 5, 5};

        int[] result = selectionSort.basicSelectionSort(arr);

        assertArrayEquals(sorted, result);
    }

}