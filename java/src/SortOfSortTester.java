import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class SortOfSortTester {

    @Test
    public void test1(){//this was just a normal sample problem athat I used to construct and troubleshoot the sorting algorithm
        int[] arr = {7, 8, 6, 9, 3};
        int[] expectedArr = {7,6,3,8,9};

        SortOfSort.sortOfSort(arr);
        assertArrayEquals(expectedArr, arr);//I have to create a asserArrayEquals because if i do assertable it will compare the addresses which wont match
    }

    @Test
    public void test2(){//checks if given a sorted array does it still "sort it" I concluded that the answer is yes
        int[] arr = {7, 6, 3, 8, 9};
        int[] expectedArr = {7, 6, 3, 8, 9};

        SortOfSort.sortOfSort(arr);
        assertArrayEquals(expectedArr, arr);
    }

    @Test
    public void test3(){//checks if given a negative set of integers does it still sorts it accordingly
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

