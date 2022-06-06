import java.lang.Math;
import java.util.Scanner;

public class Q14 {
    
    private static Scanner scanner = new Scanner(System.in); 
    
    public static void question(){
        System.out.print("a = ");
        float a = scanner.nextFloat();
        System.out.print("b = ");
        float b = scanner.nextFloat();
        System.out.print("c = ");
        float c = scanner.nextFloat();

        float d = delta(a,b,c);
        System.out.println("delta: "+d);

        if (d<0) System.out.println("Não existe raizes");
        else raiz(a,b,d);

    }
    //b2-4ac
    public static float delta(float a, float b, float c){
        float delta = (b*b)-(4*a*c);
        return delta;
    }
    //-b +- R delta / 2a
    public static void raiz(float a, float b, float d){
        double raiz = Math.sqrt(d);
        System.out.println("raiz: "+raiz);

        double x1 = -b*(-1)+raiz;
        x1 = x1/(2*a);
        System.out.print("x1 = " +x1);

        if (d!=0){
        double x2 = -b*(-1)-raiz;
        x2 = x2/(2*a);
        System.out.print(" e "+x2);
        }

    }
}
