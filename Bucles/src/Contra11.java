import javax.swing.*;
import java.util.Scanner;

public class Contra11 {
    public static void main(String[] args) {
        String contraseña = "C0n7r66";  //declaro una variable de texto y pongo la contraseña válida.
        String intento = ""; // Creo una variable de texto.
        int contador = 0; //declaro variable de tipo entero y la inicio en 0 (tipo,nombre, valor)

        do {
             intento =JOptionPane.showInputDialog("Escriba la contraseña"); //Guardo en intento la contraseña que escribo
            if (contraseña.equals(intento)){
                JOptionPane.showMessageDialog(null,"Contraseña correcta");
                JOptionPane.showMessageDialog(null,"Bienvenido");
                contador = 3;
            }else {
                JOptionPane.showMessageDialog(null,"Contraseña incorrecta");

                contador++;
                if (contador ==3){
                    JOptionPane.showMessageDialog(null,"Acceso denegado");
                }
            }
        }while (contador  <3);
    }

}



