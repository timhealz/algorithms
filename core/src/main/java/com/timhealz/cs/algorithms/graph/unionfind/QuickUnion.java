package com.timhealz.cs.algorithms.graph.dynamicconnectivity;

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
            p = id[p];
        }

        return p;
    }

}