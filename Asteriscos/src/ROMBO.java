package Asteriscos.src;

import java.util.Scanner;

public class ROMBO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe numero base");
        int base = sc.nextInt(); //scanner cogerá los datos que escribo.
        if (base % 2 == 0) {
            System.out.println("Solo numeros impares");
            main(args);  //para volver al main.
            System.exit(0);// para salir.
        }
        int alt = base - (base / 2); //formula para saber la altura.
        for (int f = 1; f <= alt; f++) {
            for (int hueco = 0; hueco < (alt - f); hueco++) {
                System.out.print(" ");
            }
            for (int as=1; as<=(f*2-1); as++){
                System.out.print("*");
            }
            for (int hueco = 0; hueco < (alt - f); hueco++) {
                System.out.print(" ");
            }
            System.out.println("");
        }
        for (int f = alt-1; f >=1; f--) { //queremos dibujar de manera invertida.La fila en la que estoy me dibuja los huecos y asteriscos
            for (int hueco = 0; hueco < (alt - f); hueco++) { //Le restamos uno a la altura, porque la siguiente fila tiene que ser decreciente.
                System.out.print(" ");
            }
            for (int as=1; as<=(f*2-1); as++){
                System.out.print("*");
            }
            for (int hueco = 0; hueco < (alt - f); hueco++) {
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
