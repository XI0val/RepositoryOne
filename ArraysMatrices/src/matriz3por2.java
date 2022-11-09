package ArraysMatrices.src;

import javax.swing.*;
import java.util.Scanner;

public class matriz3por2 {
    public static void main(String[] args) {
        //3 filas 2 columnas
        Scanner sc=new Scanner(System.in);
        int matriz [][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};   // Poner entre llaves las filas y las columnas.
     for (int i=0; i<3; i++){ //for recorrerá desde 0 hasta fila 3.
         for (int j=0;j<2;j++){ //for irá desde columna 0 hasta 2.
             System.out.print( matriz[i][j] +" " ); //muestro el contenido de mi variable de la posicion i y la posicion j.

         }
         System.out.println("");
     }

    }
}
