public class Q9 {
    public static void main(String[] args){
        int[] vetor = CriarVetor.CriarVetor(10);

        int h = 1;
        while(h < vetor.length){
            h = h * 3 + 1;
        }

        h = (int)Math.floor(h/3);

        int elemento, j;
        while(h>0){
            for(int i=h;i<vetor.length;i++){
                elemento=vetor[i];
                j=i;
                while(j>=h && vetor[j-h] > elemento){
                    vetor[j]=vetor[j-h];
                    j=j-h;
                }

                vetor[j]=elemento;
            }
            h=h/2;
        }

        CriarVetor.Escrever(vetor);
    }
}
