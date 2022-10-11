public class piraminverII {
    public static void main(String[] args) {
        int filas = 3; // saco la altura teniendo el dato de la base. La mitad de la base mas 1
        for (int y = filas; y>0; y--){ //La altura es igual al número de filas.
            for (int hueco = 1; hueco<=(filas-y); hueco++){ // Teniendo la altura, si le resto la fila en la que estoy, se cuantos huecos necesito
                System.out.print(" "); //DIBUJO LOS HUECOS
            }
            for (int ast = 1; ast<=(y*2)-1; ast++){ //Progresion
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
