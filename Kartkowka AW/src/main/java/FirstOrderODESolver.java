public class FirstOrderODESolver {

    private ODESingleStep odeSingleStep;
    private StepHandler stepHandler;

    public FirstOrderODESolver(ODESingleStep odeSingleStep) {
        this.odeSingleStep = odeSingleStep;
    }

    public void addStepHandler(StepHandler stepHandler)
    {
        this.stepHandler=stepHandler;
    }


    public double integrate (FirstOrderODE ode, double tStart, double xStart, double tStop, double n){ // n - ilosc krokow
        double h=(tStop-tStart)/n;
        double x=xStart;
        double t=tStart;


        for (int i=0; i<n; i++)
        {
            if (stepHandler !=null) stepHandler.handle(t,x);
            x=odeSingleStep.singleStep(ode,t,x,h);
            t+=h;
        }
        if (stepHandler !=null) stepHandler.handle(t,x);
        return x;
    }

}
