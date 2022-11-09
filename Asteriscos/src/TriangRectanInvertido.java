import java.util.Scanner;

public class TriangRectanInvertido {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Escribe un número");
        int ba=sc.nextInt();
        for (int f=0;f<ba; f++){
            for (int h=0;h<f; h++){
                System.out.print(" ");
            }
            for (int j=0; j<ba-f;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
