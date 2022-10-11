import java.util.Scanner;

public class Ejer46modifi {
    public static void main(String[] args) {
        //Le pedimos 3 numeros al usuario. Como el numero menor va a ser el incremento. Va a ser C
        Scanner sc= new Scanner(System.in);
        System.out.println("Escriba Primer numero");
        int a= sc.nextInt();
        System.out.println("Escriba Segundo número");
        int b=sc.nextInt();
        System.out.println("Escriba Tercer número");
        int c= sc.nextInt();
        //ordenamos de menor a mayor usando a mayor, b menor y c es incremento.
        if (a>b){
            int aux = a; a=b; b=aux;   //comparo
        }
        if (b<c){
            int aux=b; b=c; c=aux;
        }
        for (int i=b; i<=c; i+=a){  //podrian ser varios for distintos
            System.out.println( i + ",");
        }

    }
}
