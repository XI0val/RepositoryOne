import javax.swing.*;
import java.util.Scanner;

public class AsterisA4 {
    public static void main(String[] args) {
        String text = JOptionPane.showInputDialog("Escribe número de filas");
        int a4 = Integer.parseInt(text);//Asigna valor por teclado
        String texto =JOptionPane.showInputDialog("Escriba número de columnas");
        int b4 = Integer.parseInt(texto);//asigna valor por teclado

        for (int x = 0; x< a4; x++) {
            System.out.println("");//Salto de linea
            for (int y = 0; y<b4; y++){
                System.out.print("*");//Escribe columnas
            }
        }
    }
}
