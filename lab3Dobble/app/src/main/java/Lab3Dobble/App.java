/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Lab3Dobble;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class App {
    public String menu() {
        return "Escoja su opcion:\n" +
               "1. Crear un juego\n" +
               "2. Registrar jugador\n" +
               "3. Jugar\n" +
               "4. Visualizar estado completo del juego";
    }

    public static void main(String[] args){
        System.out.println(new App().menu());
        Scanner opcion = new Scanner(System.in);
        int eleccion = opcion.nextInt();
        System.out.println("La opcion fue: " + eleccion);
    }
    
}
