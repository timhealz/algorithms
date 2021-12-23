package com.timhealz.algorithms.problems;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

import com.timhealz.algorithms.graph.unionfind.QuickFind;

public class DynamicConnectivity {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner in = new Scanner(new File(args[0]));

        int N = in.nextInt();

        QuickFind quickFind = new QuickFind(N);

        while (in.hasNextInt()) {
            int p = in.nextInt();
            int q = in.nextInt();

            if (quickFind.connected(p, q)) continue;

            quickFind.union(p, q);
            System.out.println(p + " " + q);
        }
        
        System.out.println(quickFind.count() + " components");

        in.close();
    }
}
