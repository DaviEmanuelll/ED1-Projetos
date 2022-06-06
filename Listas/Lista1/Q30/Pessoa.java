package Q30;
import java.io.Serializable;
import java.lang.Math;

// 30.	Constiua um programa que registre objetos da classe Pessoa, com os seguintes atributos: cpf, nome, idade, sexo, peso, altura, 
// imc. Permita que o usuário defina a quantidade de pessoas em tempo de execução. Ao cadastrar uma pessoa, calcule o IMC 
// (Índice de Massa Corporal). Ao final, exiba a lista de pessoas (com seus respectivos atributos). Utilize enum. Crie uma função 
// para identificar se o CPF é válido.
public class Pessoa implements Serializable {
    String cpf;
    String nome;
    int idade;
    sexo genero;
    float peso;
    float altura;
    double imc;

    public Pessoa(String cpf, String nome, int idade, sexo genero, float peso, float altura) {
        try{
            if(idade < 0) throw new ArithmeticException("Idade não pode ser negativa");
            if(peso <= 0)  throw new ArithmeticException("Peso não pode ser nulo ou negativo");
            if(altura <=0)  throw new ArithmeticException("Altura não pode ser negativa");
            this.cpf = verificarCpf(cpf);
            this.nome = nome;
            this.idade = idade;
            this.genero = genero;
            this.peso = peso;
            this.altura = altura;
            imc = peso/ Math.pow(2,altura);   
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static String verificarCpf(String cpf) throws Exception{
        String somenteNumerosCpf = cpf.replaceAll("\\D+","");

        if(somenteNumerosCpf.length() != 11){
            throw new Exception("CPF invalido! numero de digitos");
        }

        char primeiro = somenteNumerosCpf.charAt(0);
        boolean igual = true;
        for(int i = 1; i<11;i++){
            if(primeiro != somenteNumerosCpf.charAt(i)){
                igual = false;
                break;
            }
        }
        if(igual) throw new Exception("CPF invalido! todos os digitos iguais");

        return somenteNumerosCpf;
    }

    @Override
    public String toString() {
        return "Pessoa [ cpf=" + cpf + 
        ", nome=" + nome + 
        ", genero=" + genero + 
        ", idade=" + idade + 
        ", altura=" + altura + 
        ", peso=" + peso +
        ", imc=" + imc +         
        "]";
    }
        

    
}
