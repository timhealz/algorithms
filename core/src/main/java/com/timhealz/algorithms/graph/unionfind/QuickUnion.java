package com.timhealz.algorithms.graph.unionfind;

public class QuickUnion extends AbstractUnionFind {

    public QuickUnion(int N) {
        super(N);
    }

    public void union(int p, int q) {
        int i = find(p);
        int j = find(q);

        components.remove(j);

        id[j] = i;
    }

    public int find(int p) {
        while (p != id[p]) {
            id[p] = id[id[p]];
            p = id[p];
        }

        return p;
    }

}
