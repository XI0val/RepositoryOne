import javax.swing.*;
import java.util.Scanner;

public class Contraseña {
    public static void main(String[] args) {
        String contraseña = "C0n7r66",intento="";
        int contador = 0;
        Scanner teclado = new Scanner(System.in); // Creo objeto Scanner y lo instancio para que se mantenga en la memoria.

        do {
            System.out.println("Escriba la contraseña");//imprimo texto, para que salga en consola.
            intento = teclado.nextLine(); //escaneo ese input (envio) ,se registra en intento. (La respuesta se queda registrada)
            if (contraseña.equals(intento)){   //La condicion que debe cumplirse.
                System.out.println("Contraseña correcta");
                System.out.println("Bienvenido");
                contador = 3;
            }else { //si no se cumple.
                System.out.println("Contraseña incorrecta");
                contador++;
                if (contador ==3){
                    System.out.println("Acceso denegado");
                    System.out.println("Se ha bloqueado el acceso");
                }
            }
        }while (contador <3);
    }

}
