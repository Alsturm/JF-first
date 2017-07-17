package ru.training.jf.algorithms;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;
import org.junit.jupiter.api.Test;

import java.util.function.ToDoubleBiFunction;

import static org.hamcrest.MatcherAssert.assertThat;

class PowerTest {

    private ToDoubleBiFunction<Double, Integer> pow = new Power();

    private static TypeSafeMatcher<Number> closeTo(double value) {
        return new TypeSafeMatcher<Number>() {
            @Override
            protected boolean matchesSafely(Number item) {
                return item.doubleValue() == value;
            }

            @Override
            public void describeTo(Description description) {
            }
        };
    }

    @Test
    void name() {
        assertThat(pow.applyAsDouble(0d, 0), closeTo(1));
        assertThat(pow.applyAsDouble(0d, 2), closeTo(0));
        assertThat(pow.applyAsDouble(1d, 1), closeTo(1));
        assertThat(pow.applyAsDouble(2d, 2), closeTo(4));
        assertThat(pow.applyAsDouble(3d, 2), closeTo(9));
        assertThat(pow.applyAsDouble(3d, 0), closeTo(1));
    }
    @Test
    void pow2_4() {
        assertThat(pow.applyAsDouble(2d, 4), closeTo(16L));
    }
    @Test
    void pow3_6() {
        assertThat(pow.applyAsDouble(3d, 6), closeTo(729L));
    }
    @Test
    void pow3_17() {
        assertThat(pow.applyAsDouble(3d, 17), closeTo(129140163L));
    }
}