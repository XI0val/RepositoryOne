public class piramideastII {
    public static void main(String[] args) {
        for (int hueco= 1; hueco<=2; hueco++){ //Primero hacemos el bucle que dibuja los huecos
            System.out.print(" ");// dibujar hueco
        }
        System.out.print("*"); //dibujar asterisco
        System.out.println(""); //salto de linea a la siguiente fila
        System.out.print(" "); //dibujar hueco

        for (int ast=1; ast<=3; ast++){// El segundo bucle es para que vaya de un asterisco al 3.
            System.out.print("*"); //dibujar asteriscos
        }
        System.out.println("");  // salto de linea a la siguiente fila
        for (int a=1; a<=5; a++){ // bucle para que vaya de los asteriscos del 1 al 5.
            System.out.print("*"); //dibujar asteriscos
        }

        System.out.println("");
        System.out.println("Piramide II");
        //hay que pedir los numeros.
        int al = 3; // saco la altura teniendo el dato de la base. La mitad de la base mas 1
        for (int f = 1; f<=al; f++){ //La altura es igual al número de filas.
            for (int hueco = 1; hueco<=(al-f); hueco++){ // Teniendo la altura, si le resto la fila en la que estoy, se cuantos huecos necesito
                System.out.print(" "); //DIBUJO LOS HUECOS

            }
            for (int ast = 1; ast<=(f*2)-1; ast++){ //Progresion
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
