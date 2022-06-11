public class Q6 {
    public static void main(String[] args){
        int[] vetor = CriarVetor(10);
        for(int i=0;i<vetor.length;i++){
            System.out.print(vetor[i]+" ");
        }

        for(int i=0;i<vetor.length;i++){
            for(int j=i+1;j<vetor.length;j++){
                if(vetor[i]>vetor[j]){
                    int auxiliar = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = auxiliar;
                }
            }
        }
        System.out.println();

    }

    private static int[] CriarVetor(int tam) {
        int[] vetor = new int[tam];
        for(int i=0;i<tam;i++){
            vetor[i]=(int)(Math.random()*10);
        }

        return vetor;    }
}
