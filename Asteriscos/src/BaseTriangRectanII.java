import java.util.Scanner;

public class BaseTriangRectanII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe numero para base");//Preguntamos al sistema
        int ba = sc.nextInt();
        for (int i=0; i<ba; i++){
            for (int j=1; j<=ba; j++){ //for ira desde hueco 1 hasta el hueco que pidamos
                System.out.print("-");
            }
            for (int j=0; j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
