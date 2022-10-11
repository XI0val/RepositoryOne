public class ProductonumerosPrimos {
    public static void main(String[] args) {
        //int contador= 5;
        int producto = 1;
        for (int contador = 2; contador <= 12; contador++) { //for se irá moviendo por los numeros.
            if (contador == 2) { //contador siempre será un numero primo.
                System.out.println("2");//Los numeros primos se pueden dividir entre si mismo y 1 Los numeros primos de mas de una cifra no se pueden dividir entre 2,3,5 y 7.
                producto = producto * contador; //Con esto saldra el producto (1 x2=2) y el resultado pasa al siguente if.

            }
            if (contador == 3) {
                System.out.println("3");
                producto = producto * contador;

            }
            if (contador == 5) {
                System.out.println(" 5");
                producto = producto * contador;

            }
            if (contador == 7) {
                System.out.println("7");
                producto = producto * contador;
            }
            if (contador % 2==0||contador% 3==0||contador % 5==0||contador % 7==0){ //si no es divisible...

            }else{
                System.out.println(contador); //Necesitamos nuestros numeros primos.
                producto = producto * contador; //Hacemos la formula.
                System.out.println(producto); //Resultado
            }
        }

    }
}