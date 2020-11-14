package maths;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MathsTest {

    @Test(groups = { "basic-operation" })
    public void testSum()
    {
        assertEquals((double)6, Maths.Sum(1, 5));
    }

    @Test(groups = { "basic-operation" })
    public void testSub() {
    }

    @Test(groups = { "basic-operation" })
    public void testMul() {
    }

    @Test(groups = { "basic-operation" })
    public void testDiv() {
    }

    @Test(groups = { "basic-operation" })
    public void testMod() {
    }

    @org.testng.annotations.Test
    public void testLn() {
    }

    @org.testng.annotations.Test
    public void testLog10() {
    }

    @org.testng.annotations.Test
    public void testLog() {
    }

    @org.testng.annotations.Test
    public void testCos() {
    }

    @org.testng.annotations.Test
    public void testSin() {
    }

    @org.testng.annotations.Test
    public void testTan() {
    }

    @org.testng.annotations.Test
    public void testArcCos() {
    }

    @org.testng.annotations.Test
    public void testArcSin() {
    }

    @org.testng.annotations.Test
    public void testArcTan() {
    }

    @org.testng.annotations.Test
    public void testRoot() {
    }

    @org.testng.annotations.Test
    public void testSquareRoot() {
    }

    @org.testng.annotations.Test
    public void testPow() {
    }

    @org.testng.annotations.Test
    public void testFact() {
    }

    @org.testng.annotations.Test
    public void testPermutation() {
    }

    @org.testng.annotations.Test
    public void testCombination() {
    }
}