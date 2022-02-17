package Lista1;

import java.util.Scanner;

public class Q18 {
    
    private static Scanner scanner = new Scanner(System.in); 

    public static void question(){
        String senha = "senha123";
        String senhaDigitada = " ";

        System.out.println("Digite a senha: ");
        senhaDigitada = scanner.nextLine();
        
        boolean senhaIncorreta = true;

        while (senhaIncorreta) {
            
            if (senha.equals(senhaDigitada)) {
                senhaIncorreta = false;                
            } else{
                System.out.println("senha invalida");
                System.out.println("Digite a senha: ");
                senhaDigitada = scanner.nextLine();
            }
        }

        System.out.println("senha correta");        

    }
}
