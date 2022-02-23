import java.util.Scanner;

public class Q27 {
    
    private static Scanner scanner = new Scanner(System.in);

    public static void question(){

        System.out.println("Numero de dados: ");
        int tam = scanner.nextInt();

        int vet[] = new int[tam];

        for(int i = 0; i<tam;i++){
            System.out.print("Informe o "+(i+1)+"° num:");
            vet[i] = scanner.nextInt();
        }

        int maior = vet[0];
        int menor = vet[0];
        int testeMaior, testeMenor;

        System.out.print("Vet = [ ");
        for(int i = 0; i<tam;i++){
            System.out.print(vet[i]+" ");
            testeMaior = vet[i];
            if (maior < testeMaior) maior=testeMaior;

            testeMenor = vet[i];
            if (menor > testeMenor) menor=testeMenor;

        }

        System.out.println("]\nMaior = "+maior+"\nMenor = "+menor);

    }
}
