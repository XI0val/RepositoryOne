import java.util.Scanner;

public class asteyLineas {
    public static void main(String[] args) {
        for (int text=1; text<=5; text++ ){
            System.out.println("****\n-----");
        }

        System.out.println(" Lineas 2");
        for (int grupo=1; grupo<=5; grupo++){//
            for (int asteriscos =1; asteriscos<=5; asteriscos++){
                System.out.print("*");
            }
            System.out.println(" ");
            for (int linea =1; linea<=5; linea++){
                System.out.print("-");
            }
            System.out.println(" ");

        }
    }
}
