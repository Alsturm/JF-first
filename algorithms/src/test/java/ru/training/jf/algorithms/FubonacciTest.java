package ru.training.jf.algorithms;

import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

class FubonacciTest {

    private Fubonacci fubonacci = new Fubonacci();

    @Test
    void apply() {
        assertThat(fubonacci.applyAsInt(0), Is.is(0));
        assertThat(fubonacci.applyAsInt(1), Is.is(1));
        assertThat(fubonacci.applyAsInt(2), Is.is(1));
        assertThat(fubonacci.applyAsInt(3), Is.is(2));
        assertThat(fubonacci.applyAsInt(4), Is.is(3));
        assertThat(fubonacci.applyAsInt(5), Is.is(5));
        assertThat(fubonacci.applyAsInt(6), Is.is(8));
        assertThat(fubonacci.applyAsInt(7), Is.is(13));
    }

}