public class Q26 {

    public static void question(){
        int vet[] = { 1,2,3,4}; 
        
        System.out.print("Vet = ");
        exibirVetor(vet);

        reverso(vet);       

    }

    private static void reverso(int[] vet){
        int tam = vet.length;
        int rev[] = new int[tam];

        for (int i = 0;i<tam;i++){
            int j=tam-1-i;
            rev[i]=vet[j];
        }

        System.out.print("Rev = ");
        exibirVetor(rev);

    }

    public static void exibirVetor(int[] vet){
        System.out.print("[ ");
        for(int i = 0; i<vet.length; i++){
            System.out.print(vet[i]+" ");
        }
        System.out.println("]\n");
    }
    
}
