import java.util.Scanner;

public class Q29 {
    
    private static Scanner scanner = new Scanner(System.in);

    public static void question(){
        String frase;
        System.out.println("Escreva uma frase:");
        frase = scanner.nextLine();

        String reverso="";

        for(int i = frase.length()-1;i>=0;i--){
            reverso += frase.charAt(i);
        }
        System.out.print(reverso);
    }
}
