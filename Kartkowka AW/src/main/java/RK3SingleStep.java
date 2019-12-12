public class RK3SingleStep implements  ODESingleStep{
    @Override
    public double singleStep(FirstOrderODE ode, double t, double x, double h) {
        double k1=ode.f(t,x);
        double k2=ode.f((t+h/2),(x+(k1*h/2)));
        double k3=ode.f((t+h),(x-(k1*h)+(2*h*k2)));
        return x+(1./6.)*(k1+4*k2+k3)*h;
    }
}
