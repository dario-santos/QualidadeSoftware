package maths;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MathsTest {

    @Test(groups = { "basic-operation" })
    public void testSum()
    {
        assertEquals(Maths.Sum(0, 0), 0.0);
        assertEquals(Maths.Sum(0, 1), 1.0);
        assertEquals(Maths.Sum(1, 0), 1.0);
        assertEquals(Maths.Sum(-1, -1), -2.0);
        assertEquals(Maths.Sum(-1, 1), 0.0);
        assertEquals(Maths.Sum(1, -1), 0.0);
        assertEquals(Maths.Sum(1, 1), 2.0);
    }

    @Test(groups = { "basic-operation" })
    public void testSub()
    {
        assertEquals(Maths.Sub(0, 0), 0.0);
        assertEquals(Maths.Sub(0, 1), -1.0);
        assertEquals(Maths.Sub(1, 0), 1.0);
        assertEquals(Maths.Sub(-1, -1), 0.0);
        assertEquals(Maths.Sub(-1, 1), -2.0);
        assertEquals(Maths.Sub(1, -1), 2.0);
        assertEquals(Maths.Sub(1, 1), 0.0);
    }

    @Test(groups = { "basic-operation" })
    public void testMul()
    {
        assertEquals(Maths.Mul(0, 0), 0.0);
        assertEquals(Maths.Mul(0, 1), 0.0);
        assertEquals(Maths.Mul(1, 0), 0.0);
        assertEquals(Maths.Mul(-1, -1), 1.0);
        assertEquals(Maths.Mul(-1, 1), -1.0);
        assertEquals(Maths.Mul(1, -1), -1.0);
        assertEquals(Maths.Mul(1, 1), 1.0);
    }

    @Test(groups = { "basic-operation" })
    public void testDiv()
    {
        assertEquals(Maths.Div(0, -1), 0.0);
        assertEquals(Maths.Div(0, 1), 0.0);
        assertEquals(Maths.Div(-1, -1), 1.0);
        assertEquals(Maths.Div(-1, 1), -1.0);
        assertEquals(Maths.Div(1, -1), -1.0);
        assertEquals(Maths.Div(1, 1), 1.0);
    }

    @Test(groups = { "basic-operation" })
    public void testMod()
    {
        assertEquals(Maths.Mod(0, -1), 0.0);
        assertEquals(Maths.Mod(0, 1), 0.0);
        assertEquals(Maths.Mod(-1, -1), 0.0);
        assertEquals(Maths.Mod(-1, 1), 0.0);
        assertEquals(Maths.Mod(1, -1), 0.0);
        assertEquals(Maths.Mod(1, 1), 0.0);
    }

    @Test(groups = { "logarithm" })
    public void testLn()
    {
        try {
            Maths.Ln(-1);
            fail("Natural Logarithm should throw exception when v <= 0 .\nTEST CASE :\nv=-1");
        } catch (MathsExceptions mathsExceptions) {
            assertTrue(true);
        }
        try {
            Maths.Ln(0);
            fail("Natural Logarithm should throw exception when v <= 0 .\nTEST CASE :\nv=0");
        } catch (MathsExceptions mathsExceptions) {
            assertTrue(true);
        }
        try {
            assertEquals(Maths.Ln(1), 0.0);
        } catch (MathsExceptions mathsExceptions) {
            fail();
        }
    }

    @Test(groups = { "logarithm" })
    public void testLog10()
    {
        try {
            Maths.Log10(-1);
            fail("Logarithm with Base 10 should throw exception when v <= 0 .\nTEST CASE :\nv=-1");
        } catch (MathsExceptions mathsExceptions) {
            assertTrue(true);
        }
        try {
            Maths.Log10(0);
            fail("Logarithm with Base 10 should throw exception when v <= 0 .\nTEST CASE :\nv=0");
        } catch (MathsExceptions mathsExceptions) {
            assertTrue(true);
        }
        try {
            assertEquals(Maths.Log10(1), 0.0);
        } catch (MathsExceptions mathsExceptions) {
            fail();
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
            assertEquals(Maths.Log(2, 1), 0.0);
        } catch (MathsExceptions mathsExceptions) {
            fail();
        }
    }

    @Test(groups = { "exponential" })
    public void testPow()
    {
        try {
            Maths.Pow(0, 0);
            fail("Exponential should throw exception when base = expoent = 0.\nTEST CASE :\nbase=0\nexpoent=0");
        } catch (MathsExceptions mathsExceptions) {
            assertTrue(true);
        }
        try {
            assertEquals(Maths.Pow(0, 1), 0.0);
        } catch (MathsExceptions mathsExceptions) {
            fail();
        }
        try {
            assertEquals(Maths.Pow(1, 0), 1.0);
        } catch (MathsExceptions mathsExceptions) {
            fail();
        }
        try {
            assertEquals(Maths.Pow(-1, -1), -1.0);
        } catch (MathsExceptions mathsExceptions) {
            fail();
        }
        try {
            assertEquals(Maths.Pow(-1, 1), -1.0);
        } catch (MathsExceptions mathsExceptions) {
            fail();
        }
        try {
            assertEquals(Maths.Pow(1, -1), 1.0);
        } catch (MathsExceptions mathsExceptions) {
            fail();
        }
        try {
            assertEquals(Maths.Pow(1, 1), 1.0);
        } catch (MathsExceptions mathsExceptions) {
            fail();
        }
    }

    @Test(groups = { "exponential" })
    public void testRoot()
    {
        try {
            Maths.Root(0, 0);
            fail();
        } catch (MathsExceptions mathsExceptions) {
            assertTrue(true);
        }

        try{
            assertEquals(Maths.Root(0, 1), 0.0);
        }catch (MathsExceptions mathsExceptions)
        {
            fail();
        }

        try{
            Maths.Root(1, 0);
            fail();
        }catch (MathsExceptions mathsExceptions)
        {
            assertTrue(true);
        }

        try {
            assertEquals(Maths.Root(-1, -1), -1.0);
        } catch (MathsExceptions mathsExceptions)
        {
            fail();
        }

        try {
            assertEquals(Maths.Root(-1, 1), -1.0);
        } catch (MathsExceptions mathsExceptions)
        {
            fail();
        }

        try {
            assertEquals(Maths.Root(1, -1), 1.0);
        } catch (MathsExceptions mathsExceptions)
        {
            fail();
        }

        try {
            assertEquals(Maths.Root(1, 1), 1.0);
        } catch (MathsExceptions mathsExceptions)
        {
            fail();
        }
    }

    @Test(groups = { "exponential" })
    public void testSquareRoot()
    {
        try{
            assertEquals(Maths.SquareRoot(0), 0.0);
        }catch (MathsExceptions mathsExceptions)
        {
            fail();
        }

        try{
            Maths.SquareRoot(-1);
            fail();
        }catch (MathsExceptions mathsExceptions)
        {
            assertTrue(true);
        }
        try{
            assertEquals(Maths.SquareRoot(4), 2.0);
        }catch (MathsExceptions mathsExceptions)
        {
            fail();
        }

    }

    @Test(groups = { "trigonometric" })
    public void testCos()
    {
        assertEquals(Maths.Cos(0), 1.0);
        assertEquals(Maths.Cos(Maths.PI/2), Math.cos(Maths.PI/2));
        assertEquals(Maths.Cos(Maths.PI), -1.0);
    }

    @Test(groups = { "trigonometric" })
    public void testSin()
    {
        assertEquals(Maths.Sin(0), 0.0);
        assertEquals(Maths.Sin(Maths.PI), Math.sin(Maths.PI));
        assertEquals(Maths.Sin(Maths.PI/2), 1.0);
        assertEquals(Maths.Sin(-Maths.PI/2), -1.0);
    }

    @Test(groups = { "trigonometric" })
    public void testTan()
    {
        /*
            TEST CASES THAT ARE SUPPOSED TO SUCCEED
         */
        try {
            assertEquals(Maths.Tan((-Maths.PI/2)-1), Math.tan((-Maths.PI/2)-1));
        } catch (MathsExceptions mathsExceptions) {
            fail();
        }
        try {
            assertEquals(Maths.Tan((-Maths.PI/2)+1), Math.tan((-Maths.PI/2)+1));
        } catch (MathsExceptions mathsExceptions) {
            fail();
        }
        try {
            assertEquals(Maths.Tan((Maths.PI/2)-1), Math.tan((Maths.PI/2)-1));
        } catch (MathsExceptions mathsExceptions) {
            fail();
        }
        try {
            assertEquals(Maths.Tan((Maths.PI/2)+1), Math.tan((Maths.PI/2)+1));
        } catch (MathsExceptions mathsExceptions) {
            fail();
        }
        /*
            TEST CASES THAT ARE SUPPOSED TO SUCCEED BY FAILING
         */
        try {
            Maths.Tan(-Maths.PI/2);
            fail("Tangent of π/2 SHOULD throw exception. TEST CASE : -π/2");
        } catch (MathsExceptions mathsExceptions) {
            assertTrue(true);
        }
        try {
            Maths.Tan(Maths.PI/2);
            fail("Tangent of -π/2 SHOULD throw exception. TEST CASE : π/2");
        } catch (MathsExceptions mathsExceptions) {
            assertTrue(true);
        }
    }

    @Test(groups = { "trigonometric" })
    public void testArcCos()
    {
        /*
            TEST CASES THAT ARE SUPPOSED TO SUCCEED
         */
        try {
            assertEquals(Maths.ArcCos(-1), Maths.PI);
        } catch (MathsExceptions mathsExceptions) {
            fail();
        }
        try {
            assertEquals(Maths.ArcCos(0), Maths.PI/2);
        } catch (MathsExceptions mathsExceptions) {
            fail();
        }
        try {
            assertEquals(Maths.ArcCos(1), 0.0);
        } catch (MathsExceptions mathsExceptions) {
            fail();
        }
        /*
            TEST CASES THAT ARE SUPPOSED TO SUCCEED BY FAILING
         */
        try {
            Maths.ArcCos(-1.1);
            fail("ArcCos of -1.1 SHOULD throw exception. TEST CASE : -1.1");
        } catch (MathsExceptions mathsExceptions) {
            assertTrue(true);
        }
        try {
            Maths.ArcCos(1.1);
            fail("ArcCos of 1.1 SHOULD throw exception. TEST CASE : 1.1");
        } catch (MathsExceptions mathsExceptions) {
            assertTrue(true);
        }
    }

    @Test(groups = { "trigonometric" })
    public void testArcSin()
    {
        /*
            TEST CASES THAT ARE SUPPOSED TO SUCCEED
         */
        try {
            assertEquals(Maths.ArcSin(-1), -Maths.PI/2);
        } catch (MathsExceptions mathsExceptions) {
            fail();
        }
        try {
            assertEquals(Maths.ArcSin(0), 0.0);
        } catch (MathsExceptions mathsExceptions) {
            fail();
        }
        try {
            assertEquals(Maths.ArcSin(1), Maths.PI/2);
        } catch (MathsExceptions mathsExceptions) {
            fail();
        }
        /*
            TEST CASES THAT ARE SUPPOSED TO SUCCEED BY FAILING
         */
        try {
            Maths.ArcSin(-1.1);
            fail("ArcSin of -1.1 SHOULD throw exception. TEST CASE : -1.1");
        } catch (MathsExceptions mathsExceptions) {
            assertTrue(true);
        }
        try {
            Maths.ArcSin(1.1);
            fail("ArcSin of 1.1 SHOULD throw exception. TEST CASE : 1.1");
        } catch (MathsExceptions mathsExceptions) {
            assertTrue(true);
        }
    }

    @Test(groups = { "trigonometric" })
    public void testArcTan()
    {
        assertEquals(Maths.ArcTan(-1), -Maths.PI/4);
        assertEquals(Maths.ArcTan(0), 0.0);
        assertEquals(Maths.ArcTan(1), Maths.PI/4);
    }

    @Test(groups = { "trigonometric" })
    public void testCosh()
    {
        assertEquals(Maths.Cosh(-1), Math.cosh(-1));
        assertEquals(Maths.Cosh(0), 1.0);
        assertEquals(Maths.Cosh(1), Math.cosh(1));
    }

    @Test(groups = { "trigonometric" })
    public void testSinh()
    {
        assertEquals(Maths.Sinh(-1), Math.sinh(-1));
        assertEquals(Maths.Sinh(0), Math.sinh(0));
        assertEquals(Maths.Sinh(1), Math.sinh(1));
    }

    @Test(groups = { "trigonometric" })
    public void testTanh()
    {
        assertEquals(Maths.Tanh(-1), Math.tanh(-1));
        assertEquals(Maths.Tanh(0), Math.tanh(0));
        assertEquals(Maths.Tanh(1), Math.tanh(1));
    }

    @Test(groups = { "combinatorial" })
    public void testFact()
    {
        try {
            Maths.Fact(-1);
            fail("Factorial should throw exception when v < 0 .\nTEST CASE :\nv=-1");
        } catch (MathsExceptions mathsExceptions) {
            assertTrue(true);
        }

        try {
            assertEquals(Maths.Fact(0), 1.0);
        } catch (MathsExceptions mathsExceptions) {
            fail();
        }

        try {
            assertEquals(Maths.Fact(1), 1.0);
        } catch (MathsExceptions mathsExceptions) {
            fail();
        }

        try {
            assertEquals(Maths.Fact(2), 2.0);
        } catch (MathsExceptions mathsExceptions) {
            fail();
        }
    }

    @Test(groups = { "combinatorial" })
    public void testPermutation()
    {
        try {
            Maths.Permutation(-1, -2);
            fail("Permutation should throw exception when n < 0 .\nTEST CASE :\nn=-1, r=-2");
        } catch (MathsExceptions mathsExceptions) {
            assertTrue(true);
        }

        try {
            Maths.Permutation(-1, -1);
            fail("Permutation should throw exception when n < 0 .\nTEST CASE :\nn=-1, r=-1");
        } catch (MathsExceptions mathsExceptions) {
            assertTrue(true);
        }

        try {
            Maths.Permutation(-1, 0);
            fail("Permutation should throw exception when n < 0 .\nTEST CASE :\nn=-1, r=0");
        } catch (MathsExceptions mathsExceptions) {
            assertTrue(true);
        }

        try {
            Maths.Permutation(0, -1);
            fail("Permutation should throw exception when r < 0 .\nTEST CASE :\nn=0, r=-1");
        } catch (MathsExceptions mathsExceptions) {
            assertTrue(true);
        }

        try {
            assertEquals(Maths.Permutation(0, 0), 1.0);
        } catch (MathsExceptions mathsExceptions) {
            fail();
        }

        try {
            assertEquals(Maths.Permutation(0, 1), 0.0);
        } catch (MathsExceptions mathsExceptions) {
            fail();
        }

        try {
            assertEquals(Maths.Permutation(1, 0), 1.0);
        } catch (MathsExceptions mathsExceptions) {
            fail();
        }

        try {
            assertEquals(Maths.Permutation(1, 1), 1.0);
        } catch (MathsExceptions mathsExceptions) {
            fail();
        }

        try {
            assertEquals(Maths.Permutation(1, 2), 0.0);
        } catch (MathsExceptions mathsExceptions) {
            fail();
        }
    }

    @Test(groups = { "combinatorial" })
    public void testCombination() {
        try {
            Maths.Combination(-1, -2);
            fail("Combination should throw exception when n < 0 .\nTEST CASE :\nn=-1, r=-2");
        } catch (MathsExceptions mathsExceptions) {
            assertTrue(true);
        }

        try {
            Maths.Combination(-1, -1);
            fail("Combination should throw exception when n < 0 .\nTEST CASE :\nn=-1, r=-1");
        } catch (MathsExceptions mathsExceptions) {
            assertTrue(true);
        }

        try {
            Maths.Combination(-1, 0);
            fail("Combination should throw exception when n < 0 .\nTEST CASE :\nn=-1, r=0");
        } catch (MathsExceptions mathsExceptions) {
            assertTrue(true);
        }

        try {
            Maths.Combination(0, -1);
            fail("Combination should throw exception when r < 0 .\nTEST CASE :\nn=0, r=-1");
        } catch (MathsExceptions mathsExceptions) {
            assertTrue(true);
        }

        try {
            assertEquals(Maths.Combination(0, 0), 1.0);
        } catch (MathsExceptions mathsExceptions) {
            fail();
        }

        try {
            assertEquals(Maths.Combination(0, 1), 0.0);
        } catch (MathsExceptions mathsExceptions) {
            fail();
        }

        try {
            assertEquals(Maths.Combination(1, 0), 1.0);
        } catch (MathsExceptions mathsExceptions) {
            fail();
        }

        try {
            assertEquals(Maths.Combination(1, 1), 1.0);
        } catch (MathsExceptions mathsExceptions) {
            fail();
        }

        try {
            assertEquals(Maths.Combination(1, 2), 0.0);
        } catch (MathsExceptions mathsExceptions) {
            fail();
        }
    }
}