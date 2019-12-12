public class Regula_falsi
{
    private double a;
    private double b;
    private int max_iteracji;
    private double true_value;
    private Function function;

    public Regula_falsi(double a, double b, int max_iteracji, double true_value, Function function) {
        this.a = a;
        this.b = b;
        this.max_iteracji = max_iteracji;
        this.true_value = true_value;
        this.function = function;
    }

    public double regula_falsi()
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
            xrNew = xu-((function.calculateValue(xu)*(xl-xu))/(function.calculateValue(xl)-function.calculateValue(xu)));
            et = Math.abs(((true_value - xrNew)/true_value)*100);
            ea = Math.abs(((xrNew-xrOld)/xrNew)*100);

            System.out.println("Iteracja nr " + i + "\t xl = " + xl + "\t xu = " + xu + "\t xr = " + xrNew + "\t et = " + et + "\t ea = " + ea + "%");

            if((function.calculateValue(xrNew)==0))
                xrNew=xrNew;

            else
                xl=xrNew;

            if (ea==0)
                stop=false;

            if (i == max_iteracji)
                stop = false;

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

    public int getMax_iteracji() {
        return max_iteracji;
    }

    public void setMax_iteracji(int max_iteracji) {
        this.max_iteracji = max_iteracji;
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
