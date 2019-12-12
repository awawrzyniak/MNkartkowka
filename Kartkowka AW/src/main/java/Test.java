public class Test
{
    public static void main(String[] args)
    {
           Zadanie1 zadanie1 = new Zadanie1();
           Bisekcji B1 = new Bisekcji(0,2,1,zadanie1);
           Regula_falsi RF1 = new Regula_falsi(0,2,100,1,zadanie1);
           Punktu_stalego PS1 = new Punktu_stalego(0.5,100,1,zadanie1);
//           Stycznych stycznych = new Stycznych(1,100,2,zadanie1);
           Siecznych siecznych = new Siecznych(1,0.8,100,1,zadanie1);
           System.out.println("Bisekcja");
           System.out.println( B1.bisection());
           System.out.println("Falsi");
           System.out.println( RF1.regula_falsi());
           System.out.println("Fixed point");
           System.out.println(PS1.fixed_point());
//           System.out.println("Stycznych");
//           System.out.println(stycznych.styczne());
           System.out.println("Siecznych");
           System.out.println(siecznych.sieczne());


           // Zadanie 2

           double k=0.026;
           double xMax=12*Math.pow(10,9);
           FirstOrderODESolver solver1 = new FirstOrderODESolver(new RK3SingleStep());
           solver1.addStepHandler(new ConsoleStepHandler());
           System.out.println("Zadanie 2");
           double xE = solver1.integrate((t,x)-> k*(1-(x/xMax))*x,0,2.555*Math.pow(10,9),50,10);


    }
}
