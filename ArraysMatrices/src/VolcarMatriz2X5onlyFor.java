package ArraysMatrices.src;

import javax.swing.*;

public class VolcarMatriz2X5onlyFor {
    public static void main(String[] args) {
        int m1[] = new int[5];
        int m2[] = new int[5];
        //int filas = 1, columnas = 5; //DECLARAMOS EL TAMAÑO QUE TENDRÁ NUESTRA PRIMERA FILA
        //Scanner entrada = new Scanner(System.in);

        //String numeros [][] = new String [filas][columnas]; //ojo: al ser matriz de 1x5 tendrá filas y columnas.

        //FOR PARA PEDIR DATOS (solo monstrará el mensaje y almacenará por teclado)
        for (int i = 0; i < m1.length; i++) {  //este bucle validará las filas
            //System.out.println("VALORES DE LA FILA #" + (m1+1));    //este mensaje va a diferenciar la fila cuando terminemos de llenar cada fila
            String array1 = JOptionPane.showInputDialog(null, "Introduzca los valores para la primera fila");
            //for(int i = 0; i < columnas; i++){ //este bucle validará las columnas
            m1[i] = Integer.parseInt(array1);
            //System.out.println("ingrese valor de fila #1 columna #" + (i+1));  //
            // numeros[j][i] = entrada.nextLine(); //ALMACENO UN STRING
        }
        //System.out.print("Tu primera fila tiene datos: ");
        //FOR PARA MOSTRAR LA PRIMERA FILA (aquí muestra los datos leidos por el for anterior)
        for (int i = 0; i < m2.length; i++) {   //estos dos bucles es exactamente el mismo que los anteriores, lo único que cambia es el contenido que mostrara los valores que ingresamos.
            //for(int i = 0; i < columnas; i++){
            String array2 = JOptionPane.showInputDialog(null, "Introduzca los valores para la primera fila");
            m2[i] = Integer.parseInt((array2));  //llamamos los valores que almacenamos en los primeros bucles
        }
        int matriz[][] = new int[2][5]; //ojo: al ser matriz de 2x5 tendrá filas y columnas

        for (int i = 0; i < matriz.length; i++) {   //estos dos bucles es exactamente el mismo que los anteriores, lo único que cambia es el contenido que mostrara los valores que ingresamos.
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = m1[j];  //llamamos los valores que almacenamos en los primeros bucles
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }

    }
}












