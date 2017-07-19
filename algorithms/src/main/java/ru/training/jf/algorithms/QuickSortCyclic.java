package ru.training.jf.algorithms;

import java.util.Comparator;

public class QuickSortCyclic {

    public <T> void sort(Comparator<T> comparator, T... ts) {
        int p = 0;
        int q = ts.length - 1;
        if (p < q) {
            int i = SortUtils.partition(comparator, p, q, ts);
//            while () {
//
//            }
        }
    }
}
