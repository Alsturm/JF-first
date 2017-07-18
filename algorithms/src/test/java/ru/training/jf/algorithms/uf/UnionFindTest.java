package ru.training.jf.algorithms.uf;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UnionFindTest {

    UnionFind unionFind;

    @BeforeEach
    void setUp() {
//        unionFind = new QuickFind(10);
        unionFind = new QuickUnion(10);
    }

    @Test
    void union() {
        unionFind.union(4,3);
        unionFind.union(3,8);
        unionFind.union(6,5);
        unionFind.union(9,4);
        unionFind.union(2,1);

        assertFalse(unionFind.connected(0, 7));
        assertTrue(unionFind.connected(8, 9));

        unionFind.union(5,0);
        unionFind.union(7,2);
        unionFind.union(6,1);
        unionFind.union(1,0);

        assertTrue(unionFind.connected(0, 7));
    }

}