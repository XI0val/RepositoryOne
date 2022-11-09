package ArraysMatrices;

import java.util.Scanner;

public class ORDENACION {
    public static void main(String[] args) {
        //Ordenacion por metodo de la burbuja, los valores menores Suben a las primeras posiciones.
          int aux;
        System.out.println("Ingrese 3 números ");
          Scanner sc =new Scanner(System.in);
            //Matriz
          int valores[]=new int[3];   //Matriz entera de 3 valores
         for (int i=0; i<3; i++){
             valores[i]=sc.nextInt();
         }

         //Ordenación

        for (int i=0; i<2;i++){
            for (int j =0; j<2;j++){
                if (valores[j]>valores[j+1]){
                    aux=valores[j];
                    valores[j]=valores[j+1];

                            valores[j+1]=aux;

                }
            }
        }
        // Imprimimos los valores:
        for (int n=0;n<3;n++){
            System.out.println(valores[n] + " ");
        }
    }
}
