package com.timhealz.cs.algorithms.graph.dynamicconnectivity;

public abstract class AbstractUnionFind {
    
    protected int[] id;
    
    public AbstractUnionFind(int N) {

        id = new int[N];

        for(int i = 0; i < id.length; i++) {
            id[i] = i;
        }   
    }

    public int[] getId() {
        return id;
    }

    abstract public void union(int p, int q);

    abstract public int find(int p);

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

}
