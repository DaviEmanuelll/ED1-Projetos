import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Q33 {

    private static Scanner scanner = new Scanner(System.in);

    static class PalavraFrase{
        String palavra;
        int cont;
        public PalavraFrase(String palavra, int cont) {
            this.palavra = palavra;
            this.cont = cont;
        }
        @Override
        public String toString() {
            return "["+palavra+" = "+cont+"];";
        }
    }

    public static void question(){
        String texto = criar();
        String path = "Lista1/Arquivos/CadastroPessoas.csv";

        boolean continuar = true;

        while(continuar){
            System.out.println("[1] Salvar arquivo\n[2] Mostrar arquivo\n[3] Cancelar");
            int escolha = scanner.nextInt();

            switch(escolha){
                case 1:
                try {
                    escritor(path, texto);
                } catch (Exception e) {
                    System.out.println("Erro na escrita");
                } 
                case 2:
                    try {
                        String textoSaida = leitor(path);
                        System.out.println(textoSaida);
                    } catch (Exception e) {
                        System.out.println("Erro na leitura");
                    }
                    break;
                case 3:
                    continuar=false;
                    break;  
            }
        }


    }

    public static String criar(){

        System.out.println("Frase: ");
        String frase = scanner.nextLine();

        String[] vetorFrase = frase.split(" ");
        int numPalavras = vetorFrase.length;

        PalavraFrase contador[] = new PalavraFrase[numPalavras];
        
        int novaPalavra = 0;
        contador[novaPalavra]= new PalavraFrase(vetorFrase[0], 0);
        novaPalavra++;

        for(int palavraVetorFrase=0;palavraVetorFrase<numPalavras;palavraVetorFrase++){

            String palavraDaVez = vetorFrase[palavraVetorFrase];

            int posicaoContador;
            boolean palavraIgual = false;

            for(posicaoContador = 0; posicaoContador<novaPalavra; posicaoContador++){
                if(contador[posicaoContador].palavra.equals(palavraDaVez)){
                    palavraIgual = true;
                    break;
                }
            }
            if(palavraIgual){
                contador[posicaoContador].cont++;
            }else{
                contador[novaPalavra] = new PalavraFrase(palavraDaVez, 1);
                novaPalavra++;
            }
        }

        for (int j = 0; j<novaPalavra; j++) {
            System.out.println(contador[j]);
        }

        

        return converterVetorToString(contador, novaPalavra);
    }

    public static String converterVetorToString(PalavraFrase[] contador, int posicoes){
        String frase = "";
        for(int i=0;i<posicoes;i++){
            frase+=contador[i].toString();
        }
        return frase;
    }

    public static void escritor(String path,String texto) throws Exception{
        BufferedWriter escrever = new BufferedWriter(new FileWriter(path));
        
        escrever.append(texto);
        escrever.close();        
    }

    public static String leitor(String path) throws Exception{
        BufferedReader ler = new BufferedReader(new FileReader(path));
        StringBuffer sbResult = new StringBuffer();
		String linha = "";
		
		while (linha != null) 
		{
			sbResult.append(linha + "\n");
			linha = ler.readLine();
			
			if(linha != null) {
				String[] parts = linha.split(";");
				for (int i = 0; i < parts.length; i++) {
					System.out.print("["+parts[i]+"] ");
				}
			}

		}
		ler.close();
		
		return sbResult.toString();
    }
}
