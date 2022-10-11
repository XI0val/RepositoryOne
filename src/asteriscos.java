import java.util.Scanner;

public class asteriscos {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("A1");
        int n = 4;//Asignar variable. Si solo esta int y valor es declarar.
        for (int x = 1; x<=n; x++){
            System.out.print("*");
        }

        System.out.println("");
        System.out.println("A2");
        int a2 = 4;
        for (int y = 1; y<=a2; y++){
            System.out.println("*");
        }
        System.out.println("");
        System.out.println("A3");
        int a3 = 4;
        int b3=4;
        for (int a = 1; a<=a3; a++){ //eje y = a se mueve desde la primera altura hasta la 4
            for (int  b= 1; b<=b3; b++){ //eje X de iz a derecha.
                System.out.print("*");
            }
            System.out.println("");// Salto de linea.
        }
        System.out.println("");
        System.out.println("A4");
        int a4 = 3;
        int b4=5;

        for (int z = 1; z<=a4; z++){ //eje Y se mueve desde la primera altura hasta la 4
            for (int  e= 1; e<=b4; e++){ //eje X de iz a derecha.
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("A5");
        int a5 = 5;
        int d5 = 5;
        int e5 = 3;
        for (int t = 1; t<=a5; t++){
            for (int w = 1; w<d5; w++){

                System.out.print("*");
            }
            System.out.println("");
            for (int u = 1; u<=e5; u++){
                for (int v = 1; v<=e5; v++){

                    System.out.print("*");
                }
            }

        }
    }
}
