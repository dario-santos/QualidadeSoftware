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
        if (v <= 0.0)
            throw new MathsExceptions("NATURAL LOGARITHM EXCEPTION:\nParameter cannot be lesser or equal than 0.\n");

        return Math.log(v);
    }

    public static double Log10(double v) throws MathsExceptions
    {
        if (v <= 0.0)
            throw new MathsExceptions("LOGARITHM BASE 10 EXCEPTION:\nParameter cannot be lesser or equal than 0.\n");

        return Math.log10(v);
    }

    public static double Log(double base, double v) throws MathsExceptions
    {
        if (base <= 1.0)
            throw new MathsExceptions("LOGARITHM BASE x EXCEPTION:\nFirst Parameter cannot be lesser than 0.\n");
        if (v <= 0.0)
            throw new MathsExceptions("LOGARITHM BASE x EXCEPTION:\nSecond Parameter cannot be lesser or equal than 0.\n");

        return (Math.log(v) / Math.log(base));
    }

    public static double Cos(double angle)
    {
        return Math.cos(angle);
    }

    public static double Sin(double angle)
    {
        return Math.sin(angle);
    }

    public static double Tan(double angle) throws MathsExceptions
    {
        if (((Math.abs(angle) % (Maths.PI/2)) == 0.0) && (Math.abs(angle) % Maths.PI != 0.0))
            throw new MathsExceptions("TAN DOMAIN EXCEPTION:\nParameter cannot be divisible by π/2.\n");

        return Math.tan(angle);
    }

    public static double ArcCos(double v) throws MathsExceptions
    {
        if (v < -1 || v > 1)
            throw new MathsExceptions("ARCCOS DOMAIN EXCEPTION:\nParameter cannot be outside domain [-1, 1].\n");

        return Math.acos(v);
    }

    public static double ArcSin(double v) throws MathsExceptions
    {
        if (v < -1 || v > 1)
            throw new MathsExceptions("ARCSIN DOMAIN EXCEPTION:\nParameter cannot be outside domain [-1, 1].\n");

        return Math.asin(v);
    }

    public static double ArcTan(double v)
    {
        return Math.atan(v);
    }

    public static double Cosh(double angle)
    {
        return Math.cosh(angle);
    }

    public static double Sinh(double angle)
    {
        return Math.sinh(angle);
    }

    public static double Tanh(double angle)
    {
        return Math.tanh(angle);
    }

    public static double Root(double base, double expoent) throws MathsExceptions
    {
        if ((expoent == 0.0) || (base == 0.0 && expoent <= 0.0))
            throw new MathsExceptions("ROOT EXCEPTION :\nOutside of domain exception.\n");

        if (base < 0.0 && (Math.abs(expoent) % 2) == 0.0)
            throw new MathsExceptions("ROOT EXCEPTION :\nNon real answer.\n");

        return Math.pow(base, 1/expoent);
    }

    public static double SquareRoot(double v) throws MathsExceptions
    {
        if (v == 0.0)
            throw new MathsExceptions("ROOT EXCEPTION :\nOutside of domain exception.\n");
        if (v < 0.0)
            throw new MathsExceptions("ROOT EXCEPTION :\nNon real answer.\n");

        return Math.sqrt(v);
    }

    public static double Pow(double base, double expoent) throws MathsExceptions
    {
        if (base == 0.0 && expoent == 0.0)
            throw new MathsExceptions("EXPONENTIAL EXCEPTION:\nFirst parameter and second paramter cannot be 0 simultaneously.\n");

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
