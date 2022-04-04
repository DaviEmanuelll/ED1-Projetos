import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Q30.Pessoa;
import Q30.sexo;

// 30.	Constiua um programa que registre objetos da classe Pessoa, com os seguintes atributos: cpf, nome, idade, sexo, peso, altura, 
// imc. Permita que o usuário defina a quantidade de pessoas em tempo de execução. Ao cadastrar uma pessoa, calcule o IMC 
// (Índice de Massa Corporal). Ao final, exiba a lista de pessoas (com seus respectivos atributos). Utilize enum. Crie uma função 
// para identificar se o CPF é válido.

public class Q30 {

    private static Scanner scanner = new Scanner(System.in);
    
    public static void question(){
        List<Pessoa> variasPessoas = new ArrayList<>();

        System.out.println("---- Cadastre Pessoas ----");
        variasPessoas = criar();
        listar(variasPessoas);

        boolean continuar=true;
        while(continuar){
            System.out.println("[0] Recriar\n[1] Salvar arquivo\n[2] Mostrar arquivo\n[3] Cancelar");
            int choice = scanner.nextInt();

            String path = "Lista1/Arquivos/CadastroPessoas.bin";
            switch(choice){
                case 0:
                    variasPessoas = criar();
                    listar(variasPessoas);
                    break;
                case 1:
                    try {
                        escritor(path, variasPessoas);
                    } catch (Exception e) {
                        System.out.println("Erro na escrita");
                    }
                    break;
                case 2:
                    try {
                        List<Pessoa> ler = leitor(path);
                        listar(ler);
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

    public static List<Pessoa> criar(){
        List<Pessoa> pessoas = new ArrayList<>();
        System.out.print("Quantas pessoas deseja adicionar? ");
        int numPessoas =scanner.nextInt();

        for(int i=0;i<numPessoas;i++){
            System.out.println("----------------");
            scanner.nextLine();
            System.out.print("CPF: ");
            String novoCpf = scanner.nextLine();
            System.out.print("NOME: ");
            String novoNome = scanner.nextLine();
            System.out.print("IDADE: ");
            int novoIdade = scanner.nextInt();
            System.out.print("[0]Macho [1]Femea [2]NoBinare\nGENERO: ");
            sexo novoGenero = sexo.values()[scanner.nextInt()];
            System.out.print("PESO: ");
            float novoPeso = scanner.nextFloat();
            System.out.print("ALTURA: ");
            float novoAltura = scanner.nextFloat();

            Pessoa pessoa = new Pessoa(novoCpf, novoNome, novoIdade, novoGenero, novoPeso, novoAltura);
            pessoas.add(pessoa);
        }
        return pessoas;
    }

    public static void listar(List<Pessoa> pessoas){
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
    }

    public static void escritor(String path, List<Pessoa> variasPessoas) throws Exception{
        File file = new File(path);
        file.delete();
        file.createNewFile();

        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(file));

        output.writeObject(variasPessoas);
        output.close();        
    }
    @SuppressWarnings("unchecked")
    public static List<Pessoa> leitor(String path) throws Exception{
       
    List<Pessoa> variasPessoas = new ArrayList<>();
    File file = new File(path);

    if(file.exists()){
        ObjectInputStream input = new ObjectInputStream(new FileInputStream(file));
        variasPessoas = (List<Pessoa>) input.readObject();
        input.close();
    }
        
        return variasPessoas;
    }
    
}
