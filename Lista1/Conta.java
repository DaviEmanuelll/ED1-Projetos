import java.util.Scanner;

public class Conta {
    
    private static Scanner scanner = new Scanner(System.in); 

    String nome;
    float saldo;
    
    public Conta(String nome, float saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public void transferirPara(Conta c2){

        System.out.println("Quanto deseja transferir para '"+c2.nome+"?");
        float valorTransferir = scanner.nextFloat();

        if(this.transferirSaldo(valorTransferir)){
            c2.receberSaldo(valorTransferir);
        }else System.out.println("SALDO INSUFIIENTE PARA REALIZAR TRANSFERENCIA.");

        
    }

    public float getSaldo() {
        return saldo;
    }

    public void receberSaldo(float saldo) {
        this.saldo = this.saldo + saldo;
    }
    public boolean transferirSaldo(float valorTransferir) {
        boolean deuCerto;
        if(valorTransferir<=getSaldo()){
            this.saldo=this.saldo-valorTransferir;
            deuCerto = true;
        } else {
            System.out.println("SALDO INSUFIIENTE PARA REALIZAR TRANSFERENCIA."); 
            deuCerto=false;
        }
        return deuCerto;
    }

    @Override
    public String toString() {
        return "Conta [nome=" + nome + ", saldo=" + saldo + "]";
    }
    
}
