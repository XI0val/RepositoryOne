import javax.swing.*;

public class A8PIRAMIDE{
    public static void main(String[] args) {
       String texto = JOptionPane.showInputDialog("Indica la base de la pirámide"); //La respuesta se guarda en texto
        int base = Integer.parseInt(texto); //La respuesta la convierto en numero entero y la guardo en base.
        //int base; //por que no vale solo con int?
        if ((base > 3 && base < 27 && base % 2 == 0) || base < 3 || base > 27){
             JOptionPane.showInputDialog("Solo numeros impares del 3 al 27");
             main(args);
             System.exit(0); //vuelve al main y lo deja en 0, volverá a preguntar.
        }
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
    }
}
