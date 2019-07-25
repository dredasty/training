package org.fresh.leetcode.medium.gameoflife;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testGameOfLife() {
        Solution solution = new Solution();
        int[][] input = new int[][]{
                {0, 1, 0},
                {0, 0, 1},
                {1, 1, 1},
                {0, 0, 0}
        };
        int[][] output = new int[][]{
                {0, 0, 0},
                {1, 0, 1},
                {0, 1, 1},
                {0, 1, 0}
        };

        solution.gameOfLife(input);

        Assertions.assertArrayEquals(output, solution.gameOfLifeTest(input));
    }
}
