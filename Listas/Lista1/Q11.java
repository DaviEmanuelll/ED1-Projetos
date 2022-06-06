import java.util.Scanner;

public class Q11 {

    public static void question(){
        Conta conta1 = new Conta("Davi",100);
        Conta conta2 = new Conta("Ríad",100);

        conta1.transferirPara(conta2);

        System.out.println(conta1);
        System.out.println(conta2);
    }
}
