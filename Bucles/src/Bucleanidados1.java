import java.util.Scanner;

public class Bucleanidados1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe *");
        String asterisco = sc.nextLine();
        int num = 4;
        for (int x = 1; x<=num; x++){
            System.out.print(asterisco + " ");
        }
        System.out.println("");
        System.out.println("Escribe *");
        String a2 = sc.nextLine();
        int n = 4;
        for (int x = 1; x<=n; x++){
            System.out.println(a2 + " ");
        }


    }
}
