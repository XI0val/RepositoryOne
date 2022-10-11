import java.util.Scanner;

public class Meses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Creo objeto Scanner para que la consola lo lea. Me permitira llamar a los métodos de la clase scanner.
        //String mes;      //Creo variable texto
        int m;           //Declaro una variable numero entero.
        System.out.print("Escribe el mes");
        //mes = sc.nextLine();  //leer dato capturando el System anterior y registra el siguiente String (variable texto)
        m = sc.nextInt(); // Asigna a la variable m el siguiente entero que se escriba por consola. Para eso uso em método nextInt
        System.out.println("Escribe un año");
        int a;
        a = sc.nextInt();
        boolean bisiesto = true;

        if ((a % 4 == 0 && a % 100 != 0) || (a % 100 == 0 && a % 400 == 0)) {
            System.out.println("Es bisiesto");
        } else {
            System.out.println("No es bisiesto");
            bisiesto = false;
        }
        switch (m){
            case 1:

            case 3:

            case 5:

            case 7:

            case 8:

            case 10:

            case 12:
                System.out.println("31");
                break;

            case 2:
                if (bisiesto == true) {
                    System.out.println("29");
                    break;
                } else { //no se pone nada
                    System.out.println("28");
                    break;
                }
            case 4:

            case 6:

            case 9:

            case 11:
                System.out.println("30");
                break;
            default:
                System.out.println("Indefinido");

        }



    }
}
