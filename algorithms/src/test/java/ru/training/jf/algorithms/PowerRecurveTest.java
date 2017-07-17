package ru.training.jf.algorithms;

import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.hamcrest.MatcherAssert.assertThat;
import static ru.training.jf.algorithms.PowerRecurve.*;

class PowerRecurveTest {
    @Test
    void powTest() {
        assertThat(pow(new BigInteger("0"), 0), Is.is(new BigInteger("1")));
        assertThat(pow(new BigInteger("0"), 2), Is.is(new BigInteger("0")));
        assertThat(pow(new BigInteger("1"), 1), Is.is(new BigInteger("1")));
        assertThat(pow(new BigInteger("2"), 2), Is.is(new BigInteger("4")));
        assertThat(pow(new BigInteger("3"), 2), Is.is(new BigInteger("9")));
    }
    @Test
    void pow2_4() {
        assertThat(pow(new BigInteger("2"), 4), Is.is(new BigInteger("16")));
    }
    @Test
    void pow3_6() {
        assertThat(pow(new BigInteger("3"), 6), Is.is(new BigInteger("729")));
    }
    @Test
    void pow3_17() {
        assertThat(pow(new BigInteger("3"), 17), Is.is(new BigInteger("129140163")));
    }



}