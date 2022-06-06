import java.util.Scanner;

public class Q25 {

    private static Scanner scanner = new Scanner(System.in);

    public static void question(){
        System.out.println("Numero de linhas: ");
        int lin = scanner.nextInt();
        System.out.println("Numero de colunas: ");
        int col = scanner.nextInt();

        int mat[][] = new int[lin][col];

        for(int i = 0; i<lin;i++){
            System.out.println();
            for(int j = 0; j<col; j++){
                System.out.print("Informe o valor da linha ["+(i+1)+"] coluna ["+(j+1)+"]: ");
                mat[i][j] = scanner.nextInt();
            }
            
        }

        System.out.println("\nMat =");
        for(int i = 0; i<lin; i++){
            for(int j=0;j<col;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}