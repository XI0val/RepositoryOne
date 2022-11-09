package ArraysMatrices.src;

public class BidimensionalRelleno {
    public static void main(String[] args) {
        //dos dimensiones [] [] solo rellenar.4 filas y 3 columnas. (12 veces)
        int matriz [][]={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};   //Ponemos entre llaves el numero de filas: 4 llaves. Dentro el numero de columnas: 3 numeros.
        //usamos dos for anidados: 1 For para el numero de filas y el otro anidado para columnas.
        for (int i=0; i<4;i++){ //for va desde indice 0 hasta 3 (incluido)
            for (int j=0; j<3; j++){ //for anidado que va desde la columna 0 hasta la columna 3
                System.out.print(matriz[i][j]); //indicamos que nos imprima los numeros del iterador i (filas) y del j(columnas)
                System.out.print(","); //salto para separar entre numeros.
            }
            System.out.println(" ");
        }
    }


}
