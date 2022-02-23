

import java.util.Scanner;

public class Q23 {
    
    private static Scanner scanner = new Scanner( System.in );
  
    public static void question() {    

        int op;
        do {
            System.out.println("\nEscolha qual operação deseja realizar");
            System.out.println("[1] - Potenciação\n[2] - Raiz\n[3] - Fatorial\n[0] - Sair");

            op = scanner.nextInt();

            int x;
            int y;

            if (op == 0) System.out.println("cabo");
            else{
                System.out.print("\nInfome o valor: ");

                switch(op){
                    case 1:
                    x = scanner.nextInt();
                    System.out.print("Elevado a: ");
                    y = scanner.nextInt();
                    
                    System.out.print(x+"^"+y+"="+Math.pow(x,y));
                    break;
                    case 2:
                    System.out.print("\nraiz de ");
                    x = scanner.nextInt();
                    
                    System.out.print("A raiz de "+x+" = "+Math.sqrt(x));
                    break;
                    case 3:
                    x = scanner.nextInt();
                    y=1;
                    int result = 1;
                    while(y<=x){
                        result=result*y;
                        y++;
                    }
                    System.out.print(x+"! = "+result);
                    break;
                }
            }
        }while(op!=0);
    }
}

