package maths;


public class Maths
{
    private Maths(){};

    public static final double PI = 3.1415;
    public static final double e  = 2.71828;

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

    public static double Ln(double v)
    {
        return Math.log(v);
    }


    public static double Log10(double v)
    {
        return Math.log10(v);
    }

    public static double Log(double base, double v)
    {
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

    public static double Fact(double v)
    {
        int f = 1;

        for(int i = 1 ; i <= v; i++)
            f *= i;

        return f;
    }

    public static double Permutation(double n, double r)
    {
        return Fact(n) / Fact(n-r);
    }

    public static double Combination(double n, double r)
    {
        return Fact(n) / (Fact(r) * Fact(n-r));
    }

}
