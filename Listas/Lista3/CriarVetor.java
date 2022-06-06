public class CriarVetor {
    public static int[] CriarVetor(int tam){
        int[] vetor = new int[tam];
        for(int i=0;i<tam;i++){
            vetor[i]=(int)(Math.random()*10);
        }
        
        Escrever(vetor);

        return vetor;
    }

    public static void Escrever(int[] vetor){
        System.out.println();
        for(int i=0;i<vetor.length;i++){
            System.out.print(vetor[i]+" ");
        }
    }

}
