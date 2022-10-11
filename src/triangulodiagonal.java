public class triangulodiagonal {
    public static void main(String[] args) {
      for (int filas=0; filas<4; filas++){ //bucle que va desde la fila 0 a la 4.
          for (int huecos=0; huecos<filas;huecos++) { //bucle que hará e imprimirá los huecos por fila.
              System.out.print(" ");//imprime hueco cuando se cumpla condición de este for anidado,
          }
          System.out.print("*"); //Si se cumple condicion del primer for,se imprime asterisco.
          System.out.println(" ");// imprime salto de linea.
      }
     for (int f=4; f>=0; f--){ //Va en decrimento hay que restar filas. Como no puede haber numeros neg el f debe ser > Y va al contrario, de 4 a 0.
         for (int huecos=0; huecos<f;huecos++){// Los huecos no cambian.
             System.out.print(" ");
         }
         System.out.print("*");
         System.out.println(" ");
     }


    }

}
