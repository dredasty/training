package org.fresh.leetcode.medium.integertoroman_12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void testConvertion() {
        Solution solution = new Solution();
        assertEquals("III", solution.intToRoman(3));
        assertEquals("IV", solution.intToRoman(4));
        assertEquals("V", solution.intToRoman(5));
        assertEquals("IX", solution.intToRoman(9));
        assertEquals("XLVIII", solution.intToRoman(48));
        assertEquals("MCMXCIV", solution.intToRoman(1994));
        assertEquals("MMMCMXCIX", solution.intToRoman(3999));
    }
}
