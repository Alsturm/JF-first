package ru.training.jf.algorithms.uf;

public class QuickFind implements UnionFind {

    private int[] ids;

    public QuickFind(int capacity) {
        ids = new int[capacity];
        for (int i = 0; i < ids.length; i++)
            ids[i] = i;
    }

    @Override
    public void union(int p, int q) {
        assert 0 <= p && p < ids.length;
        assert 0 <= q && q < ids.length;

        int pid = ids[p];
        int qid = ids[q];
        for (int i = 0; i < ids.length; i++)
            if (ids[i] == pid)
                ids[i] = qid;
    }

    @Override
    public int find(int i) {
        return ids[i];
    }

    @Override
    public boolean connected(int p, int q) {
        assert 0 <= p && p < ids.length;
        assert 0 <= q && q < ids.length;

        return ids[p] == ids[q];
    }
}
