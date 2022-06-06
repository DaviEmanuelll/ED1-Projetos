import java.util.Scanner;

public class Q36 {
    
    public static Scanner scanner = new Scanner(System.in);

    public static void question(){
        System.out.print("Defina um intervado\nde x = ");
        int x = scanner.nextInt();
        System.out.print("ate y = ");
        int y = scanner.nextInt();

        System.out.println("Somatoria Repetição = "+somaRepeticao(x, y));
        System.out.println("Somatoria Repetição = "+somaRecursividade(x, y));


    }

    public static int somaRepeticao(int x, int y){
        int somatoria = 0;
        for(int i=x;i<=y;i++){
            somatoria += i;
        }
        return somatoria;        
    }
    public static int somaRecursividade(int x, int y){
        int somatoria = 0;
        if(x<=y){
            somatoria+=x+somaRecursividade(x+1, y);
        }
        return somatoria;
    }
}
