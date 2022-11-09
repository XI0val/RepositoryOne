import javax.swing.*;

public class ExamenTest {
    public static void main(String[] args) {
        String respuesta = "";
        String a = "a";
        String b = "b";
        String c = "c";
        String d = "d";
        int nota = 0;
         JOptionPane.showMessageDialog(null,"Examen de Entornos de Desarrollo");
        do {
            JOptionPane.showMessageDialog(null, " 1.Referente al lenguaje de alto nivel, señale la incorrecta");
            JOptionPane.showMessageDialog(null, "a= Permite una máxima flexibilidad al programador.\n b=Es totalmente dependiente de la máquina. \n c=Suelen estar orientados a objetos. \n d=Se genera un código más sencillo y comprensible.");
            respuesta = JOptionPane.showInputDialog("");
            if (respuesta.equals(b)) {
                nota++;
            }
        } while (!respuesta.equals(a) && !respuesta.equals(b) && !respuesta.equals(c) && !respuesta.equals(d)); //la condicion se cumple y vuelve al bucle

        do {
            JOptionPane.showMessageDialog(null, "2-Elige cúal no es un modelo de ciclo de vida.");
            JOptionPane.showMessageDialog(null, "a= Modelo en cascada.\n b=Modelo en espiral \n c=Modelo tipado. \n d=Modelo prototipado.");
            respuesta = JOptionPane.showInputDialog("");
            if (respuesta.equals(c)) {
                nota++;
            }
        } while (!respuesta.equals(a) && !respuesta.equals(b) && !respuesta.equals(c) && !respuesta.equals(d));

        do {
            JOptionPane.showMessageDialog(null, "3-¿Qué es un lenguaje UML?.");
            JOptionPane.showMessageDialog(null, "a= Lenguaje que ordena a la máquina las operaciones fundamentales.\n b=Lenguaje con la finalidad de resolver problemas de una naturaleza muy determinada. \n c=Lenguaje gráfico para visualizar, especificar, construir y documentar un sistema. \n d=Ninguna es correcta.");
            respuesta = JOptionPane.showInputDialog("");
            if (respuesta.equals(c)) {
                nota++;
            }
        } while (!respuesta.equals(a) && !respuesta.equals(b) && !respuesta.equals(c) && !respuesta.equals(d)); //si es diferente de a, de b,

        do {
            JOptionPane.showMessageDialog(null, "4-¿Cúal es un tipo de software de sistema?");
            JOptionPane.showMessageDialog(null, "a=Sistemas operativos.\n b=Controladores de dispositivo. \n c=Bios. \n d=Todas son correctas.");
            respuesta = JOptionPane.showInputDialog("");
            if (respuesta.equals(d)) {
                nota++;
            }
        } while (!respuesta.equals(a) && !respuesta.equals(b) && !respuesta.equals(c) && !respuesta.equals(d));

        do {
            JOptionPane.showMessageDialog(null, "5-¿Qué clases principales de diagramas uml hay?");
            JOptionPane.showMessageDialog(null, "a= De espiral y cascada.\n b=Estructurales y de comportamiento. \n c=De objetos y comportamiento. \n d=De comportamiento y de estados.");
            respuesta = JOptionPane.showInputDialog("");
            if (respuesta.equals(b)) {
                nota++;
            }
        } while (!respuesta.equals(a) && !respuesta.equals(b) && !respuesta.equals(c) && !respuesta.equals(d));

        do {
            JOptionPane.showMessageDialog(null, "6-¿Cuál de estas opciones no pertenece a un diagrama de comportamiento?");
            JOptionPane.showMessageDialog(null, "a= De secuencia.\n b=De despliegue. \n c=De estados. \n d=De casos de uso.");
            respuesta = JOptionPane.showInputDialog("");
            if (respuesta.equals(b)) {
                nota++;
            }
        } while (!respuesta.equals(a) && !respuesta.equals(b) && !respuesta.equals(c) && !respuesta.equals(d));

        do {
            JOptionPane.showMessageDialog(null, "7-¿Cúal de estos elementos pertenece a un diagrama de casos de uso?");
            JOptionPane.showMessageDialog(null, "a= Metodo y agregación.\n b=Atributo y casos de uso. \n c= Relaciones y actores. \n d=Relaciones y atributos.");
            respuesta = JOptionPane.showInputDialog("");
            if (respuesta.equals(c)) {
                nota++;
            }
        } while (!respuesta.equals(a) && !respuesta.equals(b) && !respuesta.equals(c) && !respuesta.equals(d));


        do {
            JOptionPane.showMessageDialog(null, "8-Según la definición.¿De qué tipo de relación hablamos? (Representa una relación jerárquica entre un objeto y las partes que lo componen.Los elementos que forman parte no tienen sentido de existencia cuando el primero no existe.");
            JOptionPane.showMessageDialog(null, "a= Dependencia.\n b=Asociación. \n c= Composición. \n d=Agregación.");
            respuesta = JOptionPane.showInputDialog("");
            if (respuesta.equals(c)) {
                nota++;
            }
        } while (!respuesta.equals(a) && !respuesta.equals(b) && !respuesta.equals(c) && !respuesta.equals(d));

        do {
            JOptionPane.showMessageDialog(null, "9-Dentro de un diagrama de clases, encontramos:");
            JOptionPane.showMessageDialog(null, "a= Clases y actores.\n b= Relaciones y elementos de agrupación. \n c= Funciones y estados. \n d=Funciones y agrupaciones relacionales.");
            respuesta = JOptionPane.showInputDialog("");
            if (respuesta.equals(b)) {
                nota++;
            }
        } while (!respuesta.equals(a) && !respuesta.equals(b) && !respuesta.equals(c) && !respuesta.equals(d));

        do {
            JOptionPane.showMessageDialog(null, "10-¿Qué tipos de actores existen dentro de un diagrama de casos de uso?");
            JOptionPane.showMessageDialog(null, "a= Usuarios y sistemas .\n b= Clases y elementos . \n c= Entidades y sistemas . \n d= Ninguna es correcta .");
            respuesta = JOptionPane.showInputDialog("");
            if (respuesta.equals(a)) {
                nota++;
            }
        } while (!respuesta.equals(a) && !respuesta.equals(b) && !respuesta.equals(c) && !respuesta.equals(d));
        JOptionPane.showMessageDialog(null," Tu nota es: " +nota);
    }
}
