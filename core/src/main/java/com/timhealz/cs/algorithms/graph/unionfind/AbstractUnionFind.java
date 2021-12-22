package com.timhealz.cs.algorithms.graph.dynamicconnectivity;

import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;

public abstract class AbstractUnionFind {
    
    protected Integer[] id;
    Set<Integer> components;
    
    public AbstractUnionFind(int N) {

        id = new Integer[N];

        for(int i = 0; i < id.length; i++) {
            id[i] = i;
        }

        components = new HashSet<Integer>(Arrays.asList(id));
    }

    public Integer[] getId() {
        return id;
    }

    abstract public void union(int p, int q);

    abstract public int find(int p);

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    public int count() {
        return components.size();
    }
}
