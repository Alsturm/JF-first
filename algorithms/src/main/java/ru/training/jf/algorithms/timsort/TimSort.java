package ru.training.jf.algorithms.timsort;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Comparator;

public class TimSort {

    public static <T> T[] sort(T[] ts, Comparator<T> comparator) {
        assert ts.length > 2;

        int minRun = getMinRun(ts.length);
        assert ts.length >= minRun;

        //noinspection unchecked
        T[][] runs = (T[][]) new Object[ts.length / minRun + 1][];

        int i = 0;
        int start = 1;
        T[] run;
        while ((run = insertionSort(comparator, getRun(ts, comparator, start, minRun))) != null) {
            runs[i++] = run;
            start += run.length;
        }

        //noinspection unchecked
        T[][] runs1 = (T[][]) new Object[i][];
        System.arraycopy(runs, 0, runs1, 0, i);



        return null;
    }

    private static <T> T[] getRun(T[] ts, Comparator<T> comparator, int start, int minRun) {

        return ts.length - 1 == start ? null :
                getTs(ts, comparator, start, minRun,
                        !(0 <= comparator.compare(ts[start + 1], ts[start])));
    }

    @NotNull
    private static <T> T[] getTs(T[] ts, Comparator<T> comparator, int start, int minRun, boolean isReverse) {
        if (isReverse)
            comparator = comparator.reversed();

        int i = start + 1;
        while (comparator.compare(ts[i + 1], ts[i]) >= 0 && i + 2 < ts.length)
            i++;

        if (i - 1 - start < minRun) {
            T[] run = Arrays.copyOfRange(ts, start, start + minRun);
            if (isReverse) {
                int length = run.length - 1;
                for (int j = 0; j < run.length / 2; j++) {
                    T tmp = run[j];
                    run[j] = run[length - j];
                    run[length - j] = tmp;
                }
            }
            return run;
        } else {
            return Arrays.copyOfRange(ts, start, start + i - 1);
        }
    }

    private static int getMinRun(int n) {
        int r = 0;           /* станет 1 если среди сдвинутых битов будет хотя бы 1 ненулевой */
        while (n >= 64) {
            r |= n & 1;
            n >>= 1;
        }
        return n + r;
    }

    static <T> T[] insertionSort(Comparator<T> comparator, T... ts) {
        for (int i = 1; i < ts.length; i++) {
            T key = ts[i];

            int j = i - 1;
            while (j >= 0 && comparator.compare(ts[j], key) > 0)
                ts[j + 1] = ts[j--];

            ts[j + 1] = key;
        }

        return ts;
    }
}
