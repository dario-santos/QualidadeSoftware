package maths;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MathsTest {

    @Test(groups = { "basic-operation" })
    public void testSum()
    {
        assertEquals((double)0,  Maths.Sum(0, 0));
        assertEquals((double)1,  Maths.Sum(0, 1));
        assertEquals((double)1,  Maths.Sum(1, 0));
        assertEquals((double)-2, Maths.Sum(-1, -1));
        assertEquals((double)0,  Maths.Sum(-1, 1));
        assertEquals((double)0,  Maths.Sum(1, -1));
        assertEquals((double)2,  Maths.Sum(1, 1));
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

    @Test(groups = { "logarithm" })
    public void testLn() {
    }

    @Test(groups = { "logarithm" })
    public void testLog10() {
    }

    @Test(groups = { "logarithm" })
    public void testLog() {
    }

    @Test(groups = { "exponentialt" })
    public void testPow() {
    }

    @Test(groups = { "exponentialt" })
    public void testRoot() {
    }

    @Test(groups = { "exponentialt" })
    public void testSquareRoot() {
    }

    @Test(groups = { "trigonometric" })
    public void testCos() {
    }

    @Test(groups = { "trigonometric" })
    public void testSin() {
    }

    @Test(groups = { "trigonometric" })
    public void testTan() {
    }

    @Test(groups = { "trigonometric" })
    public void testArcCos() {
    }

    @Test(groups = { "trigonometric" })
    public void testArcSin() {
    }

    @Test(groups = { "trigonometric" })
    public void testArcTan() {
    }

    @Test(groups = { "trigonometric" })
    public void testCosh() {
    }

    @Test(groups = { "trigonometric" })
    public void testSinh() {
    }

    @Test(groups = { "trigonometric" })
    public void testTanh() {
    }

    @Test(groups = { "combinatoric" })
    public void testFact() {
    }

    @Test(groups = { "combinatoric" })
    public void testPermutation() {
    }

    @Test(groups = { "combinatoric" })
    public void testCombination() {
    }
}