package ru.training.jf.algorithms.uf;

public interface UnionFind {

    void union(int p, int q);

    int find(int i);

    boolean connected(int p, int q);
}
