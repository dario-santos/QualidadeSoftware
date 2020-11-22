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
    public void testSub()
    {
        assertEquals((double)0,  Maths.Sub(0, 0));
        assertEquals((double)-1, Maths.Sub(0, 1));
        assertEquals((double)1,  Maths.Sub(1, 0));
        assertEquals((double)0,  Maths.Sub(-1, -1));
        assertEquals((double)-2, Maths.Sub(-1, 1));
        assertEquals((double)2,  Maths.Sub(1, -1));
        assertEquals((double)0,  Maths.Sub(1, 1));
    }

    @Test(groups = { "basic-operation" })
    public void testMul()
    {
        assertEquals((double)0,  Maths.Mul(0, 0));
        assertEquals((double)0,  Maths.Mul(0, 1));
        assertEquals((double)0,  Maths.Mul(1, 0));
        assertEquals((double)1,  Maths.Mul(-1, -1));
        assertEquals((double)-1, Maths.Mul(-1, 1));
        assertEquals((double)-1, Maths.Mul(1, -1));
        assertEquals((double)1,  Maths.Mul(1, 1));
    }

    @Test(groups = { "basic-operation" })
    public void testDiv()
    {
        assertEquals((double)0,  Maths.Div(0, -1));
        assertEquals((double)0,  Maths.Div(0, 1));
        assertEquals((double)1,  Maths.Div(-1, -1));
        assertEquals((double)-1, Maths.Div(-1, 1));
        assertEquals((double)-1, Maths.Div(1, -1));
        assertEquals((double)1,  Maths.Div(1, 1));
    }

    @Test(groups = { "basic-operation" })
    public void testMod()
    {
        assertEquals((double)0,  Maths.Mod(0, -1));
        assertEquals((double)0,  Maths.Mod(0, 1));
        assertEquals((double)0,  Maths.Mod(-1, -1));
        assertEquals((double)0,  Maths.Mod(-1, 1));
        assertEquals((double)0,  Maths.Mod(1, -1));
        assertEquals((double)0,  Maths.Mod(1, 1));
    }

    @Test(groups = { "logarithm" })
    public void testLn()
    {
        try
        {
            Maths.Ln(-1);
            fail("Natural Logarithm should throw exception when v <= 0 .\nTEST CASE :\nv=-1");
        } catch (MathsExceptions mathsExceptions) {
            assertTrue(true);
        }

        try
        {
            Maths.Ln(0);
            fail("Natural Logarithm should throw exception when v <= 0 .\nTEST CASE :\nv=0");
        } catch (MathsExceptions mathsExceptions) {
            assertTrue(true);
        }

        try
        {
            assertEquals((double)0,  Maths.Ln(1));
        } catch (MathsExceptions mathsExceptions) {
            assertTrue(false);
        }
    }

    @Test(groups = { "logarithm" })
    public void testLog10()
    {
        try
        {
            Maths.Log10(-1);
            fail("Logarithm with Base 10 should throw exception when v <= 0 .\nTEST CASE :\nv=-1");
        } catch (MathsExceptions mathsExceptions) {
            assertTrue(true);
        }

        try
        {
            Maths.Log10(0);
            fail("Logarithm with Base 10 should throw exception when v <= 0 .\nTEST CASE :\nv=0");
        } catch (MathsExceptions mathsExceptions) {
            assertTrue(true);
        }

        try
        {
            assertEquals((double)0,  Maths.Log10(1));
        } catch (MathsExceptions mathsExceptions) {
            assertTrue(false);
        }
    }

    @Test(groups = { "logarithm" })
    public void testLog()
    {
        try {
            Maths.Log(0, -1);
            fail("Logarithm with Base should throw exception when base <= 1 or v <= 0 .\nTEST CASE :\nbase=0\nv=-1");
        } catch (MathsExceptions mathsExceptions) {
            assertTrue(true);
        }
        try {
            Maths.Log(0, 0);
            fail("Logarithm with Base should throw exception when base <= 1 or v <= 0 .\nTEST CASE :\nbase=0\nv=0");
        } catch (MathsExceptions mathsExceptions) {
            assertTrue(true);
        }
        try {
            Maths.Log(0, 1);
            fail("Logarithm with Base should throw exception when base <= 1 or v <= 0 .\nTEST CASE :\nbase=0\nv=1");
        } catch (MathsExceptions mathsExceptions) {
            assertTrue(true);
        }
        try {
            Maths.Log(1, -1);
            fail("Logarithm with Base should throw exception when base <= 1 or v <= 0 .\nTEST CASE :\nbase=1\nv=-1");
        } catch (MathsExceptions mathsExceptions) {
            assertTrue(true);
        }
        try {
            Maths.Log(1, 0);
            fail("Logarithm with Base should throw exception when base <= 1 or v <= 0 .\nTEST CASE :\nbase=1\nv=0");
        } catch (MathsExceptions mathsExceptions) {
            assertTrue(true);
        }
        try {
            Maths.Log(1, 1);
            fail("Logarithm with Base should throw exception when base <= 1 or v <= 0 .\nTEST CASE :\nbase=1\nv=1");
        } catch (MathsExceptions mathsExceptions) {
            assertTrue(true);
        }
        try {
            Maths.Log(2, -1);
            fail("Logarithm with Base should throw exception when base <= 1 or v <= 0 .\nTEST CASE :\nbase=2\nv=-1");
        } catch (MathsExceptions mathsExceptions) {
            assertTrue(true);
        }
        try {
            Maths.Log(2, 0);
            fail("Logarithm with Base should throw exception when base <= 1 or v <= 0 .\nTEST CASE :\nbase=2\nv=0");
        } catch (MathsExceptions mathsExceptions) {
            assertTrue(true);
        }
        try {
            assertEquals((double)0,Maths.Log(2, 1));
        } catch (MathsExceptions mathsExceptions) {
            assertTrue(false);
        }
    }

    @Test(groups = { "exponential" })
    public void testPow() {
    }

    @Test(groups = { "exponential" })
    public void testRoot() {
    }

    @Test(groups = { "exponential" })
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

    @Test(groups = { "combinatorial" })
    public void testFact() {
    }

    @Test(groups = { "combinatorial" })
    public void testPermutation() {
    }

    @Test(groups = { "combinatorial" })
    public void testCombination() {
        try
        {
            Maths.Combination(-1, -2);
            fail("Combination should throw exception on r > n.\nTEST CASE :\nn=-1\nr=-2\n");
        } catch (MathsExceptions mathsExceptions) {
            assertTrue(true);
        }
    }
}