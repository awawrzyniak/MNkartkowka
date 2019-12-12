public class ConsoleStepHandler implements StepHandler {

    @Override
    public void handle(double t, double x) {
        System.out.println(t+":"+x);
    }
}
