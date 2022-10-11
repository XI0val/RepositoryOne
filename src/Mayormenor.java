import javax.swing.*;

public class Mayormenor {
    public static void main(String[] args) {
        String num = JOptionPane.showInputDialog("Escribe número uno"); //dos strings 1 y 2 pasarlos a enteros.
        int x =Integer.parseInt(num);
        String num2 = JOptionPane.showInputDialog("Escribe número dos");
        int y= Integer.parseInt(num2); //Parseint me convierte la respuesta en numero entero.
        if(x>y){
            //JOptionPane.showMessageDialog(null,"El número uno es mayor");
            JOptionPane.showMessageDialog(null,"El " + x + " es mayor");//convierte el valor de la x en un texto
        }else if (x<y){
            JOptionPane.showMessageDialog(null,"El número dos es mayor");

        }else{
            JOptionPane.showMessageDialog(null,"Los dos números son iguales");
        }
    }

}
