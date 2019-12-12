public class Stycznych
{
    private double xi;
    private int max_iteracji;
    private double true_value;
    private Function function;

    public Stycznych(double xi, int max_iteracji, double true_value, Function function)
    {
        this.xi = xi;
        this.max_iteracji = max_iteracji;
        this.true_value = true_value;
        this.function = function;
    }

    public double styczne()
    {
        double ea = 0;
        double et = 0;
        double xi1 = 0;
        boolean stop = true;
        int i = 0;

        while (stop)
        {
            i++;
            xi = xi1;
            xi1 = xi-((function.calculateValue(xi))/(function.calculateDerivative(xi)));
            et = Math.abs(((true_value - xi1)/true_value)*100);
            ea = Math.abs(((xi1-xi)/xi1)*100);

            System.out.println("Iteracja nr " + i + "\t xi = " + xi + "\t xi+1 = " + xi1 +"\t et = " + et + "\t ea = " + ea + "%");

            if((function.calculateValue(xi1)==0))
                xi1=xi1;

            if (ea==0)
                stop=false;

            if (i == max_iteracji)
                stop = false;

        }
        return xi1;

    }

    public double getXi() {
        return xi;
    }

    public void setXi(double xi) {
        this.xi = xi;
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
