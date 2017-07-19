package ru.training.jf.algorithms;

import java.util.Comparator;

public interface SortUtils {

    static <T> int partition(Comparator<T> comparator, int p, int q, T[] ts) {
        T t = ts[q];
        int i = p - 1;
        for (int j = p; j < q; j++)
            if (comparator.compare(ts[j], t) <= 0) {
                i++;
                T tmp = ts[i];
                ts[i] = ts[j];
                ts[j] = tmp;
            }
        T tmp = ts[q];
        int i1 = i + 1;
        ts[q] = ts[i1];
        ts[i1] = tmp;
        return i1;
    }
}
