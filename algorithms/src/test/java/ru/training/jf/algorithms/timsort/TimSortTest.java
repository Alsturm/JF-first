package ru.training.jf.algorithms.timsort;

import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

class TimSortTest {
    @Test
    void sort() {
    }

    @Test
    void insertionSort() {
        Integer[] integers = TimSort.insertionSort(Integer::compareTo, 2, 7, 3, 5, 10, 1);
        assertThat(integers, Is.is(new int[]{1, 2, 3, 5, 7, 10}));
    }

}