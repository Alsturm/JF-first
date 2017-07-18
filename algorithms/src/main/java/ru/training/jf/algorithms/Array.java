package ru.training.jf.algorithms;

import edu.umd.cs.findbugs.annotations.NonNull;

import java.util.Comparator;

public class Array {

    public static <T> boolean contains(T t, T... ts) {
        return indexOf(t, ts) != -1;
    }

    public static <T> T max(Comparator<T> comparator, T... ts) {
        assert ts.length > 0;
        T max = ts[0];
        for (int i = 1; i < ts.length; i++)
            if (comparator.compare(ts[i], max) > 0)
                max = ts[i];
        return max;
    }

    public static <T extends Comparable<? super T>> T max(T... ts) {
        return max(Comparator.naturalOrder(), ts);
    }

    public static <T> int indexOf(T t, T... ts) {
        assert ts.length > 0;
        for (int i = 0; i < ts.length; i++)
            if (ts[i] == t)
                return i;
        return -1;
    }

    public static <T> int lastIndexOf(T t, T... ts) {
        assert ts.length > 0;
        Object[] ts1 = new Object[ts.length + 1];
        ts1[0] = t;
        System.arraycopy(ts, 0, ts1, 1, ts.length);
        return lastIndexOfInner(ts1);

//        T tmp = ts[0];
//        ts[0] = t;
//        int i = ts.length - 1;
//        while (ts[i--] != t);
//        return (i != 0) ? i:
//                (tmp == t) ? 0: -1;
    }

    private static int lastIndexOfInner(Object... ts) {
        int i = ts.length - 1;
        Object t = ts[0];
        while (ts[i--] != t) ;
        return i;
    }

    public static <T> int binarySearch(@NonNull Comparator<T> comparator, @NonNull T t, @NonNull T... ts) {
        int leftBorder = 0;
        int rightBorder = ts.length - 1;
        int i;
        int tmp;
        while (leftBorder <= rightBorder) {
            i = (leftBorder + rightBorder) / 2;
            if ((tmp = comparator.compare(ts[i], t)) == 0)
                return i;
            else if (tmp > 0)
                rightBorder = i - 1;
            else
                leftBorder = i + 1;
        }
        return -leftBorder;
    }

    public static <T extends Comparable<? super T>> int binarySearch(T t, T... ts) {
        return binarySearch(Comparator.naturalOrder(), t, ts);
    }
}
