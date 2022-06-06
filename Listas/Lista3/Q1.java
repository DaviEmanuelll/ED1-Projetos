

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args){
        int[] vetor = new int[10];
        for(int i=0;i<vetor.length;i++){
            vetor[i] = (int)(Math.random()*10);
            System.out.print(vetor[i]+" ");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPesquisa: ");
        int num = scanner.nextInt();
        
        boolean achou = false;
        for(int i = 0; i<vetor.length;i++){
            if(num == vetor[i])achou=true;
        }
        
        System.out.println(achou?"Achou":"Não Achou");


    }
}
