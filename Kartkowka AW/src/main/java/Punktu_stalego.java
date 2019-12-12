public class Punktu_stalego
{
    private double x0;
    private int max_iteracji;
    private double true_value;
    private Function function;

    public Punktu_stalego(double x0, int max_iteracji, double true_value, Function function) {
        this.x0 = x0;
        this.max_iteracji = max_iteracji;
        this.true_value = true_value;
        this.function = function;
    }

    public double fixed_point ()
    {
        double ea = 0;
        double et = 0;
        double xn = 0;
        double xn1 = 0;
        boolean stop = true;
        int i = 0;

        while (stop)
        {
            i++;
            xn = xn1;
            xn1 = function.calculateValue(xn)+xn;
            et = Math.abs(((true_value - xn1)/true_value)*100);
            ea = Math.abs(((xn1-xn)/xn1)*100);

            System.out.println("Iteracja nr " + i + "\t xn = " + xn + "\t f(xn) = " + function.calculateValue(xn) + "\t xn+1 = " + xn1 + "\t f(xn+1) = "+ function.calculateValue(xn1) +"\t et = " + et + "\t ea = " + ea + "%");

            if((function.calculateValue(xn1)==0))
                xn1=xn1;

            if (ea==0)
                stop=false;

            if (i == max_iteracji)
                stop = false;

        }
        return xn1;

    }
    public double getX0() {
        return x0;
    }

    public void setX0(double x0) {
        this.x0 = x0;
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
