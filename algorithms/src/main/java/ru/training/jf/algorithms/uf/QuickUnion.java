package ru.training.jf.algorithms.uf;

public class QuickUnion implements UnionFind {

    private int[] ids;

    public QuickUnion(int capacity) {
        ids = new int[capacity];
        for (int i = 0; i < ids.length; i++)
            ids[i] = i;
    }

    @Override
    public void union(int p, int q) {
        assert 0 <= p && p < ids.length;
        assert 0 <= q && q < ids.length;

        int i = find(p);
        int j = find(q);
        ids[i] = j;
    }

    @Override
    public int find(int i) {
        while (i != ids[i]) {
            ids[i] = ids[ids[i]];
            i = ids[i];
        }
        return i;
    }

    @Override
    public boolean connected(int p, int q) {
        assert 0 <= p && p < ids.length;
        assert 0 <= q && q < ids.length;

        return find(p) == find(q);
    }
}
