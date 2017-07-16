package ru.training.jf.algorithms;

import java.util.function.ToLongBiFunction;

public class Pow implements ToLongBiFunction<Long, Integer> {
    @Override
    public long applyAsLong(Long aLong, Integer integer) {

        long result = 1;

//        for (Integer i = 0; i < integer; i++)
//            result *= aLong;

        long x = aLong;
        while (integer != 0) {
            if ((integer & 1) == 1)
//            if ((integer % 2) == 1)
                result *= x;
            integer /= 2;
//            integer >>= 1;
            x *= aLong;
        }

        return result;
    }
}
