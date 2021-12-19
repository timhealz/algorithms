package com.timhealz.cs.algorithms.graph.dynamicconnectivity;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;

abstract public class AbstractUnionFindTest {

    protected AbstractUnionFind UF;

    @Test public void testInit() {
        assertEquals(
            Arrays.toString(UF.getId()),
            Arrays.toString(new int[]{0, 1, 2})
        );
    }

    @Test public void testFind() {
        assertEquals(
            UF.find(2),
            2
        );
    }

    @Test public void testConnected() {
        assertEquals(
            UF.connected(0, 2),
            false
        );
    }

    @Test public void testUnion() {
        UF.union(0, 2);
        assertEquals(
            Arrays.toString(new int[]{0, 1, 0}),
            Arrays.toString(UF.getId())
            );
    }

    @Test public void testNegativeConnected() {
        UF.union(0, 2);
        assertNotEquals(
            UF.connected(0, 2),
            false
        );
    }

}
