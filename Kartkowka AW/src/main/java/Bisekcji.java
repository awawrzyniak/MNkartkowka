public class Bisekcji
{
    private double a;
    private double b;
    private double true_value;
    private Function function;

    public Bisekcji(double a, double b, double true_value, Function function) {
        this.a = a;
        this.b = b;
        this.true_value = true_value;
        this.function = function;
    }

    public double bisection()
    {
        double ea = 0;
        double et = 0;
        double xrOld = 0;
        double xrNew = 0;
        double xl = Math.min(a, b);
        double xu = Math.max(a, b);
        boolean stop = true;
        int i = 0;

        while (stop)
        {
            i++;
            xrOld = xrNew;
            xrNew = (xl+xu)/2;
            et = Math.abs(((true_value - xrNew)/true_value)*100);
            ea = Math.abs(((xrNew-xrOld)/xrNew)*100);

            System.out.println("Iteracja nr " + i + "\t xl = " + xl + "\t xu = " + xu + "\t xr = " + xrNew + "\t et = " + et + "\t ea = " + ea + "%");

            if((function.calculateValue(xrNew)==0))
                xrNew=xrNew;

            else if ((function.calculateValue(xl)==0))
                xrNew=xl;

            else if ((function.calculateValue(xu)==0))
                xrNew=xu;

            else
            {
                if (function.calculateValue(xl)*function.calculateValue(xrNew) < 0)
                    xu=xrNew;
                else if (function.calculateValue(xrNew)*function.calculateValue(xu) < 0)
                    xl=xrNew;
            }
            if (ea==0)
                stop=false;

        }
        return xrNew;


    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getTrue_value() {
        return true_value;
    }

    public void setTrue_value(double true_value) {
        this.true_value = true_value;
    }

    public Function getFunction() {
        return function;
    }

    public void setFunction(Function function) {
        this.function = function;
    }



}
