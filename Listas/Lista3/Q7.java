public class Q7 {
    public static void main(String[] args){
        int[] vetor = CriarVetor.CriarVetor(10);

        for(int i=1;i<vetor.length;i++){
            int j = i-1;
            int auxiliar = vetor[i];
            while(j>=0 && vetor[j]>auxiliar){
                vetor[j+1] = vetor[j];

                --j;
            }
            vetor[j+1] = auxiliar;
        }

        CriarVetor.Escrever(vetor);
    }
}
