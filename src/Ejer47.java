import java.util.Scanner;

public class Ejer47 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Escriba números");
        int cifra= 0;
        int numero=sc.nextInt();
        //hay que dividir este numero entre 10, hasta que me de 0
        while (numero>0){
            numero= numero /10;
            cifra++;
        }
        System.out.println("El numero tiene " + cifra);
    }
}
