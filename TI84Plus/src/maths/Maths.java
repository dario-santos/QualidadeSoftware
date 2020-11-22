package maths;


public class Maths
{
    private Maths(){};

    public static final double PI = Math.PI;
    public static final double e  = Math.E;

    /***
     * Returns the sum of x and y
     * @param x
     * @param y
     * @return sum of x and y
     */
    public static double Sum(double x, double y)
    {
        return x + y;
    }

    public static double Sub(double x, double y)
    {
        return x - y;
    }

    public static double Mul(double x, double y)
    {
        return x * y;
    }

    public static double Div(double x, double y)
    {
        return x / y;
    }

    public static double Mod(double x, double y)
    {
        return x % y;
    }

    public static double Ln(double v) throws MathsExceptions
    {
        if (v <= 0)
            throw new MathsExceptions("NATURAL LOGARITHM EXCEPTION:\nParameter cannot be lesser or equal than 0.\n");

        return Math.log(v);
    }

    public static double Log10(double v) throws MathsExceptions
    {
        if (v <= 0)
            throw new MathsExceptions("LOGARITHM BASE 10 EXCEPTION:\nParameter cannot be lesser or equal than 0.\n");

        return Math.log10(v);
    }

    public static double Log(double base, double v) throws MathsExceptions
    {
        if (base <= 1)
            throw new MathsExceptions("LOGARITHM BASE x EXCEPTION:\nFirst Parameter cannot be lesser than 0.\n");
        if (v <= 0)
            throw new MathsExceptions("LOGARITHM BASE x EXCEPTION:\nSecond Parameter cannot be lesser or equal than 0.\n");

        return (Math.log(v) / Math.log(base));
    }

    public static double Cos(double teta)
    {
        return Math.cos(teta);
    }

    public static double Sin(double teta)
    {
        return Math.sin(teta);
    }

    public static double Tan(double teta)
    {
        return Math.tan(teta);
    }

    public static double ArcCos(double teta)
    {
        return Math.acos(teta);
    }

    public static double ArcSin(double teta)
    {
        return Math.asin(teta);
    }

    public static double ArcTan(double teta)
    {
        return Math.atan(teta);
    }

    public static double Cosh(double teta)
    {
        return Math.cosh(teta);
    }

    public static double Sinh(double teta)
    {
        return Math.sinh(teta);
    }

    public static double Tanh(double teta)
    {
        return Math.tanh(teta);
    }

    public static double Root(double base, double expoent)
    {
        return Math.pow(expoent, 1/base);
    }

    public static double SquareRoot(double expoent)
    {
        return Math.sqrt(expoent);
    }

    public static double Pow(double base, double expoent)
    {
        return Math.pow(base, expoent);
    }

    public static long Fact(long v)
    {
        int f = 1;

        for(int i = 1 ; i <= v; i++)
            f *= i;

        return f;
    }

    public static long Permutation(long n, long r)
    {
        return Fact(n) / Fact(n-r);
    }

    public static long Combination(long n, long r) throws MathsExceptions
    {
        if (n<0 || r<0)
            throw new MathsExceptions("COMBINATION EXCEPTION:\nParameters have to be positive.\n");
        if (r > n)
            throw new MathsExceptions("COMBINATION EXCEPTION:\nSecond parameter cannot be greater than the first parameter.\n");

        return Fact(n) / (Fact(r) * Fact(n-r));
    }
}
