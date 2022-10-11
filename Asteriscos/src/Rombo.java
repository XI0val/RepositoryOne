import javax.swing.*;
import java.util.Scanner;

public class Rombo {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Indica la base de la pirámide"); //La respuesta se guarda en texto
        int base = Integer.parseInt(texto); //La respuesta la convierto en numero entero y la guardo en base.

        int al = base/2 + 1; // saco la altura teniendo el dato de la base. La mitad de la base mas 1
        for (int f = 1; f<=al; f++){ //La altura es igual al número de filas.
            for (int hueco = 1; hueco<=(al-f); hueco++){ // Teniendo la altura, si le resto  n.-la fila en la que estoy, se cuantos huecos necesito
                System.out.print(" "); //DIBUJO LOS HUECOS

            }
            for (int ast = 1; ast<=(f*2)-1; ast++){ //Progresion
                System.out.print("*");
            }
            System.out.println("");
        }
        String txt = JOptionPane.showInputDialog("Indica la base de la pirámide"); //La respuesta se guarda en texto
        int bas = Integer.parseInt(txt); //La respuesta la convierto en numero entero y la guardo en base.

        int alt = bas/2 + 1; // saco la altura teniendo el dato de la base. La mitad de la base mas 1
        for (int f = alt; f<=alt; f++){ //La altura es igual al número de filas.
            for (int hueco = 0; hueco>(al-f); hueco++){ // Teniendo la altura, si le resto  n.-la fila en la que estoy, se cuantos huecos necesito
                System.out.print(" "); //DIBUJO LOS HUECOS

            }
            for (int ast = 1; ast<=(f*2)-1; ast++){ //Progresion
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
