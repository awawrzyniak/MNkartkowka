import java.util.ArrayList;
import java.util.List;

public class SaveAllStepHandler implements StepHandler {

    private List<Double> tList=new ArrayList<>();
    private List<Double> xList=new ArrayList<>();

    @Override
    public void handle(double t, double x) {
        tList.add(t);
        xList.add(x);
    }

    public void clear()
    {
        tList.clear();
        xList.clear();
    }

    public List<Double> getT()
    {
       // return tList; // shallow copy - not a good idea
        List<Double> export = new ArrayList<>();
        for (Double d : tList) export.add(d);
        return export; // deep copy
    }

    public List<Double> getX()
    {
        // return xList; // shallow copy - not a good idea
        List<Double> export = new ArrayList<>();
        for (Double d : xList) export.add(d);
        return export; // deep copy
    }


}
