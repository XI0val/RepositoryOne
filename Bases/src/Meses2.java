import java.util.Scanner;

public class Meses2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m;
        System.out.println("Escribe el mes");

        m = sc.nextInt();
        System.out.println("Escriba año");
        int a = sc.nextInt();



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
                // Si es divisible entre 4 y no es divisible entre 100 o es divisible entre 100 y 400.
            if ((a % 4 == 0 && a % 100 != 0) || (a % 100 == 0 && a % 400 == 0)) {
                System.out.println("Es bisiesto");
                System.out.println("29");
                break;
            } else {
                System.out.println("No es bisiesto");
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

