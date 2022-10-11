import java.util.Scanner;

public class Xio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // sc = Escanear la entrada de texto. "dentro del sistema"
        //Poner nombre, registrar texto.
        System.out.println("Escribe tu nombre");// Se muestra el mensaje en el terminal. Out para mostrar el mensaje.
        String  nombre = sc.nextLine(); // Variable para guardar el nombre que nos den.
        //variables: tipo nombre valor:
        int num = 20; // esto es un índice, i
        for (int x = 0; x<num; x++){//x++ es x+1
            System.out.println(nombre + " " + x);
        }
    }
}
