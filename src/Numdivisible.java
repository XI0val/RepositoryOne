public class Numdivisible {
    public static void main(String[] args) {
        int cien = 100;
        //bucle anidado.
        System.out.println("Divisible 2: ");
        for (int x = 1; x<=cien; x++){ //Bucle para que vaya del 0 al 100.
            if (x % 2 == 0){ // Si x es divisible por dos?)
                System.out.print(x + "  "); // Escribo sin "ln" con las comillas espaciadas
            }
        }
        System.out.println(""); //Salto de linea
        System.out.println("Divisible 3: ");
        for (int y = 1; y<=cien; y++){ //Bucle para que vaya del 0 al 100.
            if (y % 3 == 0){ // Si x es divisible por dos?)
                System.out.print(y + "  ");
            }
        }

    }
}
