import java.util.Scanner;

public class Q28 {

    private static Scanner scanner = new Scanner(System.in);

    public static void question(){
        int vet[] = util.criarVet();

        util.exibirVetor(vet);

        boolean repetir = true;
        int tam = vet.length-1;

        do{
            int cache=vet[0];
            for(int i=0;i<=tam;i++){

                if(i==0)cache=vet[i];                 
                else {
                    vet[i-1]=vet[i];            
                    if(i==tam) vet[i]=cache;
                }
            }

            util.exibirVetor(vet);
            System.out.println("Repetir? (1 - sim/(qualquer outra coisa) - não)");
            int resp = scanner.nextInt();
            repetir = (resp == 1)? true:false;

        }while(repetir);

    }
    
}
