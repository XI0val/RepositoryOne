package ArraysMatrices.src;

import java.util.Scanner;

public class GuardarCincoNum {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);//pedimos al usuario los 5 numeros con Scanner.
        float numeros[]= new float[5];   //Creamos variable float y le guardamos 5 numeros
        System.out.println("Guardando datos");
        //usamos bucle for. El iterador empieza en 0 hasta el numero menor a nuestro numero de elementos,en este caso menor a 5
        for (int i=0; i<5; i++){
            System.out.print((i+1 )+". Escriba un número"); //para que se sepa por cual numero va, ponemos un contador. El usuario suele empezar por el 1.Quitamos ln, para que salgan seguidos
            numeros[i]= entrada.nextFloat();    //vamos a guardar los elementos.
        }
        System.out.println("\nImprimir los elementos del arreglo");
        for (float i:numeros){
            System.out.println(i);// se imprimen todos los elemntos de nuestro arreglo.
        }
    } //mostrar los datos en orden inverso.
}
