import javax.swing.*;

public class Notas {
    public static void main(String[] args) {
       String nota= JOptionPane.showInputDialog("Escriba la Nota");
        int n =Integer.parseInt(nota);
        if (n < 3){
            System.out.println(nota + " = Muy deficiente");
        }
        if (n >= 3 && n < 5){
            System.out.println(nota + " = Deficiente");
        }
        if (n >= 5 &&  n < 7){
            System.out.println(nota + " = Bien");
        }
        if (n >= 7 && n < 9){
            System.out.println(nota + " = Notable");
        }
        if (n >= 9 && n <= 10){
            System.out.println(nota + " = Sobresaliente");
        }
        if (n > 10) {
            System.out.println(nota + " = Matricula de honor");
        }
    }
}
