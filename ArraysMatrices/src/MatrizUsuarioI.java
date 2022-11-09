package ArraysMatrices.src;

import javax.swing.*;
import java.util.Scanner;

public class MatrizUsuarioI {
    public static void main(String[] args) {
        //dos dimensiones [] [] solo rellenar.4 filas y 3 columnas. (12 veces) Datos por consola
        Scanner sc = new Scanner(System.in);

        int matriz[][], nfilas, ncolu;   //Ponemos entre llaves el numero de filas: 4 llaves. Dentro el numero de columnas: 3 numeros.
        nfilas = Integer.parseInt(JOptionPane.showInputDialog("Escriba numero de filas")); //Pedimos datos al usuario con ventana.
        ncolu = Integer.parseInt(JOptionPane.showInputDialog("Escriba numero de columnas"));

        matriz = new int[nfilas][ncolu]; //definimos nuestra matriz. (tendra x filas y x columnas despues de escribir los datos el usuario.

        for (int i = 0; i < nfilas; i++) { //for va desde indice 0 hasta x
            for (int j = 0; j < ncolu; j++) { //for anidado que va desde la columna 0 hasta la columna y.
                //Como vamos a pedirle al usuario que intruduzca numeros, hay que guardarlos dentro de la matriz con Scanner.
                System.out.print("matriz [" + i + "][" + j + "]: "); //Pedimos al usuario que vaya digitando la matriz el iterador de las filas y el de las columnas.
                matriz[i][j] = sc.nextInt(); //guardamos datos en matriz con los iteradores,usando sc nextInt
                System.out.print(""); //salto para separar entre numeros.
            }
        }
        System.out.println("La matriz es: ");
        for (int i = 0; i < nfilas; i++) { //for va desde indice 0 hasta 3 (incluido)
            for (int j = 0; j < ncolu; j++) { //for anidado que va desde la columna 0 hasta la columna 3
                System.out.print(matriz[i][j]); //indicamos que nos imprima los numeros del iterador i (filas) y del j(columnas)
                System.out.print(","); //salto para separar entre numeros.
            }
            System.out.println("");
        }
    }
}


