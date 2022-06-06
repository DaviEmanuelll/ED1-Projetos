import java.util.Scanner;

public class Q35{
    
    private static Scanner scanner = new Scanner(System.in);

    public static void question(){
        System.out.println("calcular o fatorial de um número utilizando recursividade\nNúmero: ");
        int resultado = fatorial(scanner.nextInt());
        System.out.print(resultado);
    }

    public static int fatorial(int num){
        int resultadoFatorial=num;
        if(num>1){
            resultadoFatorial = num*fatorial(num-1);
        }
        return resultadoFatorial;
    }
}