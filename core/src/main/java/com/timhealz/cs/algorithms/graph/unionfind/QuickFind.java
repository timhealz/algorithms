package com.timhealz.cs.algorithms.graph.dynamicconnectivity;

public class QuickFind extends AbstractUnionFind {

    public QuickFind(int N) {
        super(N);
    }

    public void union(int p, int q) {
        int p_id = find(p);
        int q_id = find(q);

        components.remove(q_id);

        for(int i = 0; i < id.length; i++) {
            if (id[i] == q_id) {
                id[i] = p_id; 
            }
        }
    }

    public int find(int p) {
        return id[p];
    }

}
