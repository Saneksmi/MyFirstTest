package com.company;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

public class MySortTest {

    @Test
    public void selectionSortTest() {
        ArrayList<Integer> testList = new ArrayList<>();
        testList.add(18);
        testList.add(0);
        testList.add(35);
        testList.add(-12);
        testList.add(3);
        testList.add(87);
        testList.add(41);

        ArrayList<Integer> sortedList = new ArrayList<>();
        sortedList.add(-12);
        sortedList.add(0);
        sortedList.add(3);
        sortedList.add(18);
        sortedList.add(35);
        sortedList.add(41);
        sortedList.add(87);

        Integer [] expetedArray = sortedList.toArray(new Integer[7]);
        Integer [] actualArray = MySort.selectionSort(testList).toArray(new Integer[7]);

        Assert.assertArrayEquals(expetedArray, actualArray);
    }

    @Test
    public void gnomeSortTest() {
        ArrayList<Integer> testList = new ArrayList<>();
        testList.add(18);
        testList.add(0);
        testList.add(35);
        testList.add(-12);
        testList.add(3);
        testList.add(87);
        testList.add(41);

        ArrayList<Integer> sortedList = new ArrayList<>();
        sortedList.add(-12);
        sortedList.add(0);
        sortedList.add(3);
        sortedList.add(18);
        sortedList.add(35);
        sortedList.add(41);
        sortedList.add(87);

        Integer [] expetedArray = sortedList.toArray(new Integer[7]);
        Integer [] actualArray = MySort.gnomeSort(testList).toArray(new Integer[7]);

        Assert.assertArrayEquals(expetedArray, actualArray);
    }

    @Test
    public void coctailSortTest() {
        ArrayList<Integer> testList = new ArrayList<>();
        testList.add(18);
        testList.add(0);
        testList.add(35);
        testList.add(-12);
        testList.add(3);
        testList.add(87);
        testList.add(41);

        ArrayList<Integer> sortedList = new ArrayList<>();
        sortedList.add(-12);
        sortedList.add(0);
        sortedList.add(3);
        sortedList.add(18);
        sortedList.add(35);
        sortedList.add(41);
        sortedList.add(87);

        Integer [] expetedArray = sortedList.toArray(new Integer[7]);
        Integer [] actualArray = MySort.coctailSort(testList).toArray(new Integer[7]);

        Assert.assertArrayEquals(expetedArray, actualArray);
    }
}
