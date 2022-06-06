import java.util.Scanner;

public class util {
    
    private static Scanner scanner = new Scanner(System.in);

    public static int[] criarVet(){        

        System.out.println("Numero de dados: ");
        int tam = scanner.nextInt();

        int vet[] = new int[tam];

        for(int i = 0; i<tam;i++){
            System.out.print("Informe o "+(i+1)+"° num:");
            vet[i] = scanner.nextInt();
        }

        return vet;
    }

    public static void exibirVetor(int[] vet){
        System.out.print("[ ");
        for(int i = 0; i<vet.length; i++){
            System.out.print(vet[i]+" ");
        }
        System.out.println("]\n");
    }
}
