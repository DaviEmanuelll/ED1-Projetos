

import java.util.Scanner;

public class Q1eQ2 {
    
    private static Scanner scanner = new Scanner(System.in);

    public static void question() {
        //Q1
    int idade = 19;
    float altura = 1.75f;
    char letra = 'D';
    String Nome = "Davi Emanuel";
    
    System.out.println("Dados");
    System.out.println("Nome: "+ Nome);
    System.out.println("Letra: "+ letra);
    System.out.println("Idade: "+ idade);
    System.out.println("Altura: "+ altura);
    
    //Q2 
    System.out.println("\nIdade: ");
    idade = scanner.nextInt();
    System.out.println("Altura: ");
    altura = scanner.nextFloat();
    System.out.println("Letra: ");
    letra = scanner.next().charAt(0);
    System.out.println("Nome: ");
    scanner.nextLine();
    Nome = scanner.nextLine();

    System.out.println("Dados");
    System.out.println("Nome: "+ Nome);
    System.out.println("Letra: "+ letra);
    System.out.println("Idade: "+ idade);
    System.out.println("Altura: "+ altura);
    }
    
}


