package ru.training.jf.algorithms;

import java.util.function.ToDoubleBiFunction;

public class Power implements ToDoubleBiFunction<Double, Integer> {

    @Override
    public double applyAsDouble(Double a, Integer power) {
        return applyAsDouble(a.doubleValue(), power.intValue());
    }

    public double applyAsDouble(double a, int power) {
        double result = 1;
        double aInPowerOf2 = a;
        while (power > 0) {
            if ((power & 1) == 1)
                result *= aInPowerOf2;
            aInPowerOf2 *= aInPowerOf2;
            power /= 2;
        }

        return result;
    }
}
