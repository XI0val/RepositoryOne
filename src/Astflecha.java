import java.util.Scanner;

public class Astflecha {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un numero"); //tres variables altura,espacio y asteriscos.
        int alt=sc.nextInt();
        for (int i=0;i<=alt;i++){
            for (int j=0; j<=i; j++){
                System.out.print(" ");
            }
            for (int j=0; j<alt;j++){
                System.out.print("*");
            }
            for (int j=0;j<(alt*2-(i+1)*2);j++) {
                System.out.print(" ");
            }
        }
    }
}
