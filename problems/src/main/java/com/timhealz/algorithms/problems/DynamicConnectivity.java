package com.timhealz.algorithms.problems;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.UnsupportedOperationException;

import com.timhealz.algorithms.graph.unionfind.QuickFind;
import com.timhealz.algorithms.graph.unionfind.QuickUnion;
import com.timhealz.algorithms.graph.unionfind.AbstractUnionFind;


enum Algorithms {
    QUICK_FIND,
    QUICK_UNION
}

public class DynamicConnectivity {

    private Algorithms algorithm;
    private AbstractUnionFind unionFind;

    public DynamicConnectivity(Algorithms algorithm) {
        this.algorithm = algorithm;
    }

    public void run(String filename) throws FileNotFoundException {

        Scanner in = new Scanner(new File(filename));

        int N = in.nextInt();

        switch (this.algorithm) {
            case QUICK_FIND: 
                System.out.println("Running with Quick Find.");
                unionFind = new QuickFind(N);
                break;

            case QUICK_UNION: 
                System.out.println("Running with Quick Union.");
                unionFind = new QuickUnion(N);
                break;

            default:
                throw new UnsupportedOperationException("No algorithm provided!");
        }

        while (in.hasNextInt()) {
            int p = in.nextInt();
            int q = in.nextInt();

            if (unionFind.connected(p, q)) continue;

            unionFind.union(p, q);
            System.out.println(p + " " + q);
        }
        
        System.out.println(unionFind.count() + " components");

        in.close();
    }

    public static void main(String[] args) throws FileNotFoundException {

        DynamicConnectivity dynConn1 = new DynamicConnectivity(Algorithms.QUICK_FIND);
        dynConn1.run(args[0]);

        DynamicConnectivity dynConn2 = new DynamicConnectivity(Algorithms.QUICK_UNION);
        dynConn2.run(args[0]);

    }
}
