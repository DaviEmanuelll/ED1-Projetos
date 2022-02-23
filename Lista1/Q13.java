import java.util.Scanner;

public class Q13 {
    
    private static Scanner scanner = new Scanner(System.in);

    public static void question(){

        System.out.print("N1 = ");
        float n1 = scanner.nextFloat();
        System.out.print("N2 = ");
        float n2 = scanner.nextFloat();
        System.out.print("N3 = ");
        float n3 = scanner.nextFloat();

        float med = ((n1)+(n2*2)+(n3*3))/6;

        String status;
        if (med >= 7) status = "APROVADO";
        else if (med<7 && med>=4){            
            float rec = 14-med;

            status = "RECUPERAÇÃO\nNota para ser aprovado: "+rec;
        }
        else status = "REPROVADO";

        System.out.println("Media: "+med+"\nStatus: "+status);
        
    }
}
