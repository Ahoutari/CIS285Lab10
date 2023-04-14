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
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;

        int[] sorted = selectionSort.basicSelectionSort(arr);

        assertArrayEquals(sorted, Sortedarr);
    }

    public void testNegative(){
        /** Test data contains negative values only **/

        int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -10;
        arr[4] = -2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = -8;
        Sortedarr[3] = -7;
        Sortedarr[4] = -2;

        int[] sorted = selectionSort.basicSelectionSort(arr);

        assertArrayEquals(sorted, Sortedarr);
    }

    public void testMixed() {
        // Test data contains with both positive, negative and zeros
    }

    public void testDuplicates() {
        // Test data contains duplicates
    }

}