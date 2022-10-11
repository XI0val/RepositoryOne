import java.util.Scanner;

public class Notas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Se crea objeto Scanner
        String nota;
        Double n;
        System.out.print("Introduzca la nota: ");
        nota = sc.nextLine();
        //n = sc.nextFloat();  //leer un dato recogido por consola (lo que pide que escriba)
        n = Double.parseDouble(nota); //convierto el string nota en un numero de tipo double.

        if (n < 3) {
            System.out.println("Muy deficiente");
        }
        if (n >= 3 && n < 5) {
            System.out.println("Deficiente");
        }
        if (n >= 5 && n < 7) {
            System.out.println("Bien");
        }
        if (n >= 7 && n < 9) {
            System.out.println("Notable");
        }
        if (n >= 9 && n <= 10) {
            System.out.println("Sobresaliente");
        }
        if (n > 10) {
            System.out.println("Matricula de Honor");
        }
    }
}
