public class A45 {
    public static void main(String[] args) {
        for (int f = 1; f<=1; f++){ //for se moverá desde 1 hasta 5.
            for (int col = 1; col<=1; col++){//for se movera para hacer las columnas
                System.out.print("*"); // ln hace saltos de linea, por tanto lo quitamos
            }
            System.out.println("");
            for (int col = 1; col<=2; col++){
                System.out.print("*");
            }
            System.out.println("");
            for (int col = 1; col<=3; col++){
                System.out.print("*");
            }
            System.out.println("");
            for (int col = 1; col<=4; col++){
                System.out.print("*");
            }
            System.out.println("");
            for (int col = 1; col<=4; col++){
                System.out.print("*");
            }
            System.out.println("");

        }
        System.out.println("A5 II");
        int maxcol= 1; // variable para modificar la condicion de for.
        for (int f = 1; f<=5; f++) { //for se mueve de una fila hasta la 5.
            for (int col = 1; col <= maxcol; col++) {
                System.out.print("*");
            }
            if (maxcol<4){ // condicion que me suma al maximo de columnas hasta que llegue a 4
                maxcol++;
            }
            System.out.println(""); // salto de linea para separar las filas.
        }
    }
}
