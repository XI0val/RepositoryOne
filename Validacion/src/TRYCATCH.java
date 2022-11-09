import javax.swing.*;

public class TRYCATCH {
    public static void main(String[] args) {
        //Validar numeros comprendidos del 1 al 10.
        int num;
        boolean flag= false;

        do {
         String respuesta=JOptionPane.showInputDialog(" Ingrese un número del 1 al 10");

        try { //intento (validar numero)
            num=Integer.parseInt(respuesta); //convierto el String en variable tipo entero y lo guardo en respuesta. Lo guardo en Try
            if (num>=1 && num<=10){
                JOptionPane.showMessageDialog(null,"El número " + num +  " es válido");
                flag = true;
            }else{
                JOptionPane.showInputDialog(" Número demasiado alto");
            }
        }catch (NumberFormatException ime){
            JOptionPane.showMessageDialog(null,"No es válido");
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error desconocido");
        }


     }while (flag == false ); //


    }
}
