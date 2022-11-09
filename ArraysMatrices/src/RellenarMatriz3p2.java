package ArraysMatrices.src;

import java.util.Scanner;

public class RellenarMatriz3p2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[][] matriz= new int [3][2];
        for (int i=0; i <matriz.length; i++){
            for (int y=0; y <matriz[i].length; y++){ //en el segundo for tiene que ir mi variable y el [] de las filas, .lenght es la longitud que tendrá mi matriz, que no esta determinada.
                System.out.println("Escriba número [" + i + "," + y + "]");
                matriz[i][y]=sc.nextInt();
            }
        }
        for (int i=0; i<matriz.length;i++){
            for (int y=0; y< matriz[i].length; y++){
                System.out.println("[" + i + "," + y +"]=" + matriz[i][y]); //imprimo el valor de mi variable, que me mostrará el contenido de cada indice.
            }
        }
    }
}
