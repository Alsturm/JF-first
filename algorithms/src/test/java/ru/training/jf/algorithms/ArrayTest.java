package ru.training.jf.algorithms;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ArrayTest {

    private Integer[] integers = {1,2,3,4,5,6,7,8,9,10,5,4,3,2,1};

    @Test
    void contains() {
        assertTrue(Array.contains(1, integers));
        assertFalse(Array.contains(11, integers));
        assertTrue(Array.contains(10, integers));
    }

    @Test
    void max() {
        assertThat(Array.max(integers), is(10));
    }

    @Test
    void indexOf() {
        assertThat(Array.indexOf(1, integers), is(0));
        assertThat(Array.indexOf(10, integers), is(9));
        assertThat(Array.indexOf(55, integers), is(-1));
    }

    @Test
    void lastIndexOf() {
        assertThat(Array.lastIndexOf(1, integers), is(14));
        assertThat(Array.lastIndexOf(10, integers), is(9));
        assertThat(Array.lastIndexOf(55, integers), is(-1));
    }

}