import java.util.Scanner;

public class Q3 {    
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int[] vetor = new int[10];
        for(int i=0;i<vetor.length;i++){
            vetor[i]=i*2;
            System.out.print(vetor[i]+" ");
        }

        System.out.println("\nPesquisa: ");
        int busca = scanner.nextInt();

        boolean achou = false;
        int inicio = 0, fim = vetor.length, meio;

        while (inicio<=fim) {
            meio = (int)(inicio+fim)/2;
            if(vetor[meio]==busca){
                achou=true;
                break;
            }else if(vetor[meio]>busca){
                fim=meio-1;
            }else{
                inicio=meio+1;
            }
        }

        System.out.println(achou?"Achou":"Não Achou");

    }
}
