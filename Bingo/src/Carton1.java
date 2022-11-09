import javax.swing.*;

public class Carton1 {
    public static void main(String[] args) {
        int M1[] =new int[3]; //posiciones hasta el 3.
        int num;
        int contador= 0;
        boolean flag= false;

        do {
            String respuesta= JOptionPane.showInputDialog(" Ingrese un número del 1 al 9");

            try { //intento (validar numero)
                num=Integer.parseInt(respuesta); //convierto el String en variable tipo entero y lo guardo en respuesta. Lo guardo en Try
                if (num>=1 && num<=9){
                    JOptionPane.showMessageDialog(null,"El número " + num +  " es válido");
                    M1[contador]= num;      // guardamos el numero en num, en nuestro array de guardado. Usamos de indice nuestro contador.
                    contador++;
                    if (contador==3) { //Cuando contador valga 9 deja de contar y se acaba el bucle.
                        flag = true;
                    }
                }else{
                    JOptionPane.showMessageDialog(null," Número demasiado alto");
                }
            }catch (NumberFormatException ime){
                JOptionPane.showMessageDialog(null,"No es válido");
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null,"Error desconocido");
            }


        }while (flag == false ); //

        int aux; // creo variable de numero auxiliar.
        for (int i=0; i<2;i++){ // Creo un bucle principal para recorrer los numeros.
            for (int j =0; j<2;j++){
                if (M1[j]>M1[j+1]){
                    aux=M1[j];
                    M1[j]=M1[j+1];
                    M1[j+1]=aux;

                }
            }
        }

        //Huecos Aleatorios.
         //for (int x=0; x<10; x++){ //hago un bucle para comprobar si el programa funciona bien.
            // Creamos variable random, para generar huecos aleatorios. Necesitamos 3.
             double random=Math.random()*3;  // el math.random me da un numero de entre 0 y 1 decimal. Lo multiplicamos por 3 para que nos de un numero entre 0 y 3.
             System.out.println(random); // Comprobamos si funciona imprimiendo el decimal aleatorio.

        if (random>=0 && random<=1){ // según el numero que salga, hará un hueco en un lado o en otro lado. El numero que nos da math.random indica la posicion.
                 for (int j=0; j<3; j++){ //j son las posiciones( van del 1 al 3 = 0 al 2)
                     if (j==0){ //Si J es igual a 0 se imprimira un hueco.
                         System.out.print("  ");
                     }else { //cuando no valga 0 imprime el numero correspondiente a la posicion 1.
                         System.out.print(M1[j] + " "); // imprime numero más hueco.
                     }
                 }
             }
             if (random>=1 && random<=2){ //Condición para la 2da posición.
                 for (int j=0; j<3; j++){
                     if (j!=1){ // si j es diferente a 1, imprime numero y hueco
                         System.out.print(M1[j] + " ");
                     }else{ //Si no es diferente, imprime doble hueco. (tapando un numero)
                         System.out.print("  ");
                     }
                 }
             }
             if (random>=2 && random<=3){ // Condicion para la 3ra posición.
                 for (int j=0; j<3; j++){
                     if (j==2){ //si j es igual a 2, imprime un hueco.
                         System.out.print(" ");
                     }else { //si no, imprime numero y hueco.
                         System.out.print(M1[j] + " ");
                     }
                 }
             }
            // System.out.println("");
        // }

    }
}
