package Asteriscos.src;

public class CuadradoPiramides {
    public static void main(String[] args) {
        int alt = 3; //determinamos la altura de la piramide de arriba y abajo
        for (int f = 1; f <= 3; f++) {//hacemos un bucle que nos haga las 3 primeras lineas
            for (int huecos = 0; huecos < (alt * 2) - f; huecos++) {//pintamos los huecos que necesitamos antes de poner los asteriscos
                System.out.print(" ");
            }
            for (int relleno = 0; relleno < (f * 2) - 1; relleno++) {//pintamos los asteriscos necesarios de 1 a 5
                System.out.print("*");
            }
            for (int huecos = 0; huecos < (alt * 2) - f; huecos++) {//volvemos a pintar los mismos espacios que antes de los asteriscos
                System.out.print(" ");
            }
            System.out.println();//hacemos salto de linea para separar las filas
        }
        for (int f = 1; f <=3; f++) {//hacemos un bucle para las siguientes 3 filas
            for (int huecos = 0; huecos < (alt - f); huecos++) {//pintamos los huecos que van a la izaquierda de los asteriscos
                System.out.print(" ");
            }
            for (int relleno = 0; relleno < f; relleno++) {//pintamos los asteriscos que necesitamos en cada fila
                System.out.print("*");
            }
            for (int huecos = 0; huecos < 5; huecos++) {//pinmtamos 5 huecos para separar y formar asi el cuadrado del centro
                System.out.print(" ");
            }
            for (int relleno = 0; relleno < f; relleno++) {//pintamos el mismo numero de asteriscos que al principio de la fila para hacer esa sensacion de espejo
                System.out.print("*");
            }
            for (int huecos = 0; huecos < (alt - f); huecos++) {//pintamos el mismo numero de huecos despues de los asteriscos
                System.out.print(" ");
            }
            System.out.println();//hacemos un salto de linea para separar las filas
        }
        for (int f = 2; f >=1; f--) {//invertimos el bucle anterior para hacer la misma figura que antes alreves de la fila 2 a la 1
            for (int huecos = 0; huecos < (alt - f); huecos++) {
                System.out.print(" ");
            }
            for (int relleno = 0; relleno < f; relleno++) {
                System.out.print("*");
            }
            for (int huecos = 0; huecos < 5; huecos++) {
                System.out.print(" ");
            }
            for (int relleno = 0; relleno < f; relleno++) {
                System.out.print("*");
            }
            for (int huecos = 0; huecos < (alt - f); huecos++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int f = 3; f >= 1; f--) {//invertimos la piramide inicial para hacer lo mismo pero desde la fla 3 hasta la 1
            for (int huecos = 0; huecos < (alt * 2) - f; huecos++) {
                System.out.print(" ");
            }
            for (int relleno = 0; relleno < (f * 2) - 1; relleno++) {
                System.out.print("*");
            }
            for (int huecos = 0; huecos < (alt * 2) - f; huecos++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}
