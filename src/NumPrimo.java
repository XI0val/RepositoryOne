import java.util.Scanner;

public class NumPrimo {
    public static void main(String[] args) {
        int cien = 100;
        for (int x = 2; x<=cien; x++){
            for (int i = 2; i<x; i++){
                if (x % i == 0){ //
                  break;//este break hace que nunca se sume el i++
                }else {
                    System.out.println(x + " Es primo");
                    break;
                }
            }
        }
    }
}
