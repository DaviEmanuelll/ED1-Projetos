

import java.util.Scanner;

public class Conta {

    private static Scanner scanner = new Scanner(System.in); 
    
    String nome;
    float saldo;
    
    public Conta(String nome, float saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public void transferir(Conta c2){

        System.out.println("Quanto deseja transferir para '"+c2.nome+"?");
        float valorTransferir = scanner.nextFloat();

        if(valorTransferir<=this.saldo){

            this.saldo=this.saldo-valorTransferir;
            c2.saldo+=valorTransferir;
            System.out.println("Transferencia de R$"+valorTransferir+" feita com SUCESSO!");

        } else System.out.println("SALDO INSUFIIENTE PARA REALIZAR TRANSFERENCIA.");   
        
    }
    
}
