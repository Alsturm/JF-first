package ru.training.jf.algorithms;

import java.util.Comparator;

public class QuickSortRecursive {

    static <T> void sort(Comparator<T> comparator, T... ts) {
        sort(0, ts.length - 1, comparator, ts);
    }

    private static <T> void sort(int p, int q, Comparator<T> comparator, T... ts) {
        if (p < q) {
            int i = SortUtils.partition(comparator, p, q, ts);
            sort(p, i - 1, comparator, ts);
            sort(i + 1, q, comparator, ts);
        }
    }
}
