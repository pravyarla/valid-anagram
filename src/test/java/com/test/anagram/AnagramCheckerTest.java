package com.test.anagram;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class AnagramCheckerTest {

    @Test
    void testValidAnagram() {
        assertTrue(AnagramChecker.isAnagram("listen", "silent"));
        assertTrue(AnagramChecker.isAnagram("triangle", "integral"));
    }

    @Test
    void testInvalidAnagram() {
        assertFalse(AnagramChecker.isAnagram("apple", "pale"));
        assertFalse(AnagramChecker.isAnagram(null, "null"));
    }

    @Test
    void testEdgeCase() {
        assertTrue(AnagramChecker.isAnagram("", ""));
        assertTrue(AnagramChecker.isAnagram("aabbcc", "abcabc"));
    }
}