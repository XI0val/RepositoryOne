import javax.swing.*;

public class Contra1 {
    public static void main(String[] args) {
        String contrreal ="R1hola666";//declaro variable txt
        int contador = 0;
        while (contador <3){
            String contr = JOptionPane.showInputDialog("Escriba la contraseña");//creo cuadro de dialogo y registro la respuesta en contr
            if (contr.equals(contrreal)){//Hago una condición.Da igual el orden.
                JOptionPane.showMessageDialog(null,"Contraseña correcta");
                contador = 3; // modifico el valor de contador para que no se cumpla la condición de while y así no da otra vuelta.
            }else{   //si no
                JOptionPane.showMessageDialog(null,"Contraseña incorrecta");
                contador++; //contador lo pongo antes del if para que de 3 vueltas y no 4 si lo pongo despues del if.
                if (contador == 3){
                    JOptionPane.showMessageDialog(null,"Acceso denegado");
                }
            }
        }
    }
}
