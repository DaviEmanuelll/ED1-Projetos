

import java.util.Scanner;

public class Q20 {
    
    private static Scanner scanner = new Scanner(System.in);

    public static void question(){
        System.out.print("Informe um valor: ");
        int num = scanner.nextInt();

        boolean primo =(num>1)? true:false;

        if(primo) {
            for(int i=2;i<=num/2;i++){
                if(num==1 || num!=i && num%i==0)primo=false;
            }
        }
        
        if(primo)System.out.println(num+" é um numero primo");
        else System.out.println(num+" não é um primo");

    }
    
}
