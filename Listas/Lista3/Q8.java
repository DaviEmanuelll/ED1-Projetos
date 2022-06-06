public class Q8 {
    public static void main(String[] args){
        int[] vetor = CriarVetor.CriarVetor(10);

        for(int i=0;i<vetor.length;i++){
            int menor=i;
            for(int j = i+1;j<vetor.length;j++){
                if(vetor[j]<vetor[menor]){
                    menor=j;
                }
            }
            int auxiliar=vetor[i];
            vetor[i]=vetor[menor];
            vetor[menor]=auxiliar;
        }

        CriarVetor.Escrever(vetor);
    }
    
}
