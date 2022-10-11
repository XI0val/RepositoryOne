import java.util.Scanner;

public class Ej46 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Escriba primer número");
        int x = sc.nextInt();
        System.out.println("Escriba segundo número");
        int b =sc.nextInt();
        if(x>b){
            int c=x;   //variable auxiliar es c.
            x=b;
            b=c;
            //intercambiamos numero por otro.
        }
        //Calculo la diferencia de X-A
        int diferencia= b-x;
        int incremento=0;
        if (diferencia%2 ==0){
            incremento=-2;
        }else {
            incremento=-1;
        }
        for (int i=b; i>=x; i+=incremento){ // i es 70,
            System.out.println( i + ", " );
        }
        //Si la diferencia es Par, bucle hacia abajo de 2 en dos.
        //Si la diferencia es Impar bucle hacia abajo de 1 en 1

    }
}
