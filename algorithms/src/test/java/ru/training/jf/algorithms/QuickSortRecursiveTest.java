package ru.training.jf.algorithms;

import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

class QuickSortRecursiveTest {
    @Test
    void sort() {
        Integer[] integers = {2, 7, 3, 5, 10, 1};
        QuickSortRecursive.sort(Integer::compareTo, integers);
        assertThat(integers, Is.is(new int[]{1, 2, 3, 5, 7, 10}));
    }

}