package ru.training.jf.algorithms;

import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

class PowTest {

    private Pow pow = new Pow();

    @Test
    void name() {
        assertThat(pow.applyAsLong(0L, 0), Is.is(1L));
        assertThat(pow.applyAsLong(0L, 2), Is.is(0L));
        assertThat(pow.applyAsLong(1L, 1), Is.is(1L));
        assertThat(pow.applyAsLong(2L, 2), Is.is(4L));
        assertThat(pow.applyAsLong(3L, 2), Is.is(9L));
    }
}