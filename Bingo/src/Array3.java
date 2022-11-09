import javax.swing.*;

public class Array3 {
    public static void main(String[] args) {

        // 9 numeros, 3x3 // El usuario tiene que introducir 9 numeros.
        //Los numeros tienen que estar ordenados.

        int M1[] =new int[3]; //posiciones hasta el 3.
        int num;
        int contador= 0;
        boolean flag= false;



        do {
            String respuesta= JOptionPane.showInputDialog(" Ingrese un número del 1 al 9");

            try { //intento (validar numero)
                num=Integer.parseInt(respuesta); //convierto el String en variable tipo entero y lo guardo en respuesta. Lo guardo en Try
                if (num>=1 && num<=9){
                    JOptionPane.showMessageDialog(null,"El número " + num +  " es válido");
                    M1[contador]= num;      // guardamos el numero en num, en nuestro array de guardado. Usamos de indice nuestro contador.
                    contador++;
                    if (contador==3) { //Cuando contador valga 9 deja de contar y se acaba el bucle.
                        flag = true;
                    }
                }else{
                    JOptionPane.showMessageDialog(null," Número demasiado alto");
                }
            }catch (NumberFormatException ime){
                JOptionPane.showMessageDialog(null,"No es válido");
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null,"Error desconocido");
            }


        }while (flag == false ); //

        //ordenamos numeros.
      int mayor=0;
      int menor=0;
      int mediano=0;

      if (M1[0]>M1[1] && M1[0]>M1[2] ){
          mayor= M1[0];
      }else{
          if ( M1[0]<M1[1] && M1[0]<M1[2]){
              menor = M1[0];
          }else {
              mediano=M1[0];
          }
      }
        if (M1[1]>M1[0] && M1[1]>M1[2] ){
            mayor= M1[1];
        }else{
            if ( M1[1]<M1[0] && M1[1]<M1[2]){
                menor = M1[1];
            }else {
                mediano=M1[1];
            }
        }
        if (M1[2]>M1[1] && M1[2]>M1[0] ){
            mayor= M1[2];
        }else{
            if ( M1[2]<M1[1] && M1[2]<M1[0]){
                menor = M1[2];
            }else {
                mediano=M1[2];
            }
        }
        System.out.println(menor + " " + mediano + " " + mayor + "  " );


    }
}
