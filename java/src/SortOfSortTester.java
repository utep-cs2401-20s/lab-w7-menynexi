import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class SortOfSortTester {

    @Test
    public void test1(){
        int[] arr = {7, 8, 6, 9, 3};
        int[] expectedArr = {7,6,3,8,9};

        SortOfSort.sortOfSort(arr);
        assertArrayEquals(expectedArr, arr);
    }

    @Test
    public void test2(){//checks if sorted does it do anything even if its sorted it still sorts it in place it still runs there no feature tat cheaks if it is sorted
        int[] arr = {7, 6, 3, 8, 9};
        int[] expectedArr = {7, 6, 3, 8, 9};

        SortOfSort.sortOfSort(arr);
        assertArrayEquals(expectedArr, arr);
    }

    @Test
    public void test3(){//checks negatives
        int[] arr = {-7, -8, -6, -9, -3};
        int[] expectedArr = {-7, -8, -9, -6, -3};

        SortOfSort.sortOfSort(arr);
        assertArrayEquals(expectedArr, arr);
    }

    @Test
    public void test4(){
        int[] arr = {7, 8, 6, 0,-1, 9, 3,2};//testing with multiple variables that are mixed negative and positive numbers
        int[] expectedArr = {7,6, 0, -1, 2, 3, 8, 9};

        SortOfSort.sortOfSort(arr);
        assertArrayEquals(expectedArr, arr);
    }

    @Test
    public void test5(){ //if given an empty array it never runs
        int[] arr = {};
        int[] expectedArr = {};

        SortOfSort.sortOfSort(arr);
        assertArrayEquals(expectedArr, arr);
    }
}

