/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab3Dobble;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main {
    public String menu() {
        return "Escoja su opcion:\n" +
               "1. Crear un juego\n" +
               "2. Registrar jugador\n" +
               "3. Jugar\n" +
               "4. Visualizar estado completo del juego" +
               "5. Salir\n";
    }
    public String inicio(){
        return "Primer menu \n" +
               "1. \n" +
               "2. \n" +
               "3. \n";
    }

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        DobbleGame game1 = new DobbleGame(2,0,"demomode");
        game1.register("Pedro");
        game1.register("Alicia");
        game1.play(1);
        game1.play(1);
        game1.play(3);
        

        /*
        for(int i = 0; i < numElementos; i++){
            System.out.println("El elemento " + (i+1) + "es : " + elementos.get(i));
        }
        */
        /*
        System.out.println("Ingrese la cantidad de elementos por carta");
        
        int numElemento = entrada.nextInt();
        System.out.println("Ingrese la cantidad de cartas del mazo"
                + "(ingrese un numero menor a 0 si quiere el maximo de "
                + "cartas que se pueden crear)");
        int cantCartas = entrada.nextInt();
        Dobble dobble = new Dobble(numElemento, cantCartas, elementos);
        */
        /*
        
        System.out.println(player1.getId());
        Card carta1 = new Card(1, elementos);
        Scanner opcion = new Scanner(System.in);
        int eleccion = opcion.nextInt();
        System.out.println(new App().menu());
        System.out.println("La opcion fue: " + eleccion);
        */
    }
}
