package ru.training.jf.algorithms;

import io.vavr.Tuple;
import io.vavr.Tuple2;

import java.util.function.LongToIntFunction;

public class Fubonacci implements LongToIntFunction {

    @Override
    public int applyAsInt(long value) {
//        if (value == 0) return 0;
//        if (value == 1) return 1;
//
//        int prePrev = 0;
//        int prev = 1;
//        for (int i = 2; i < value; i++) {
//            int temp = prev + prePrev;
//            prePrev = prev;
//            prev = temp;
//        }
//
//        return prev + prePrev;

        return (value == 0) ? 0 :
                (value == 1) ? 1 :
                        getPrevPair(value)._1.intValue();
    }

    private Tuple2<Long, Long> getPrevPair(long i) {
        assert i > 0;

        if (i == 1) return Tuple.of(1L, 0L);

        Tuple2<Long, Long> prevPair = getPrevPair(i - 1);
        return Tuple.of(prevPair._1 + prevPair._2, prevPair._1);
    }
}
