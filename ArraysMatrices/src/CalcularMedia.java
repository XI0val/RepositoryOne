package ArraysMatrices.src;

import java.util.Scanner;

public class CalcularMedia {
    public static void main(String[] args) { // 5 notas
        Scanner sc=new Scanner(System.in);
       double notas[]=new double[5]; //5 es el numero de huecos.
        double suma=0;
        double media;
        for (int i=0; i<5; i++){// desde 0 al 5
            System.out.println("Escribe nota");
            notas[i]=sc.nextInt();
            suma+= notas[i];//suma iterativa  suma = suma+ notas[i]
        }
           media=suma/5;
        System.out.println("La media total es: " + media);

    }
}
