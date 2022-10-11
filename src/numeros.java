public class numeros {
    public static void main(String[] args) {

        for (int x=1; x<=10; x++){
            System.out.println(x); //la variable x se mostrará en el terminal
        }
        System.out.println("");
        System.out.println("Numeros pares");
        for (int y= 2; y<=10; y++){
            if (y % 2== 0){
                System.out.print(y);
                if (y!=10){// condición para no poner coma tras el 10.
                    System.out.print(",");
                }
            }
        }

        System.out.println("");
        System.out.println("Numeros impares");
        for (int i=1; i<=10; i++){
            if (i % 2 !=0){
                System.out.println(i);
            }
        }
    }
}
