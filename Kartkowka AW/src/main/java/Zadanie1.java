import static java.lang.Math.*;

public class Zadanie1 implements Function
{


    @Override
    public double calculateValue(double x)
    {
        return ((4./3.)-Math.pow(x,2)*((3-x)/3)-(4./3.)*0.2);
    }

    @Override
    public double calculateDerivative(double x) { return ((x-2)*x); }


}
