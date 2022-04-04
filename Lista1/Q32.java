import java.util.Scanner;
//32.	Construa um programa que conte a quantidades de letras de uma palavra. Exemplo: “casa”	Resultado: c=1 a =2  s =1
public class Q32 {
    
    private static Scanner scanner = new Scanner(System.in);

    static class Letras{
        char letra;
        int cont = 0;
        public Letras(char letra, int cont) {
            this.letra = letra;
            this.cont = cont;
        }

        @Override
        public String toString() {
            return letra+" = "+cont+" ";
        }        
    }

    public static void question(){
        
        String palavra;
        System.out.println("Informe uma palavras: ");
        palavra = scanner.nextLine();

        int tamanhoPalavra = palavra.length();
        Letras letras[] = new Letras[tamanhoPalavra];

        
        int novaLetra = 0;

        letras[novaLetra] = new Letras(palavra.charAt(0),0);
        novaLetra++;

        for(int posicaoLetra = 0;posicaoLetra<tamanhoPalavra;posicaoLetra++){
            
            int letraEncontrada = 0;
            boolean letraIgual = false;

            for(letraEncontrada = 0;letraEncontrada<novaLetra;letraEncontrada++){
                if(letras[letraEncontrada].letra==palavra.charAt(posicaoLetra)){
                    letraIgual = true;
                    break;
                }
                   
            }           
            if(letraIgual){
                letras[letraEncontrada].cont++;
            }else{
                letras[novaLetra] = new Letras(palavra.charAt(posicaoLetra),1);
                novaLetra++;
            }          
        }

        for(int j=0;j<novaLetra;j++){
            System.out.print(letras[j]);
        }


    }
}
