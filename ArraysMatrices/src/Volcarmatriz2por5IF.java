package ArraysMatrices.src;

import javax.swing.*;

public class Volcarmatriz2por5IF {
    public static void main(String[] args) {
        //Crear dos array de 5, pedirle los datos al usuario y volcar el relleno en una matriz de 2x5.

        int M1[] = new int [5]; //va del  0  al 6, pero el 6 es null. El ultimo valor debe ser null.
        int M2[] = new int [5];

        for (int i= 0; i<M1.length; i++){
            String array1= JOptionPane.showInputDialog(null,"Introduzca numeros para el primer array"); //
            M1[i]=Integer.parseInt(array1); //guardar la respuesta, la convierto con parse, porque es de tipo entero. No puedo guardar una variable string que es de tipo entero.

        }


        for (int i=0; i<M2.length;i++){
            String array2= JOptionPane.showInputDialog(null,"Introduzca los numeros para el segundo array");
            M2[i] =Integer.parseInt(array2);

        }
        /* Imprimimos Los array.
        for ( int i=0; i<M1.length; i++){
           System.out.print( M1[i] +" ");
        }
        System.out.println(" ");
        for (int i=0; i<M2.length; i++){
            System.out.print( M2[i] + " ");
        }*/

        int [][] matriz= new int [2][5]; //creo mi variable matriz y la defino.
        for (int i=0; i<matriz.length; i++){ //se moverá desde el indice 0 de las filas hasta la ultima posición
           if (i==0 ){ // Necesito una condicion para que no me repita la fila de M1.
               for (int j=0; j<matriz[i].length; j++){ //se movera desde el cajon 0 hasta la ultima posición .
                   matriz[i][j]=M1[j]; //Guardo mi array M1 en la variable matriz. Para guardar los valores de mi array en cada posicion de la matriz
                   System.out.print(matriz[i][j] + " ");
               }
           }
            if (i==1 ){
                for (int j=0; j<matriz[i].length; j++){ //se movera desde el cajon 0 hasta la ultima posicion .
                    matriz[i][j]=M2[j]; //Guardo mi array M1 en la variable matriz.
                    System.out.print( matriz[i][j] + " ");
                }
            }
            System.out.println("");

        }
    }
}
