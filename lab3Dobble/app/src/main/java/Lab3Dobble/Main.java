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
        List<String> elementos1= new ArrayList<>();
        List<String> elementos2= new ArrayList<>();
        elementos1.add("1");
        elementos1.add("2");
        elementos1.add("3");
        elementos1.add("4");
        elementos1.add("5");
        elementos1.add("6");
        elementos1.add("7");
        elementos1.add("8");
        elementos1.add("9");
        elementos1.add("10");
        elementos1.add("11");
        elementos1.add("12");
        elementos1.add("13");
        elementos2.add("b");
        elementos2.add("a");
        elementos2.add("e");
        elementos2.add("c");
        elementos2.add("g");
        elementos2.add("f");
        elementos2.add("d");

        DobbleGame game1 = new DobbleGame(2,0,"stackMode");
        System.out.println(game1.getPlayers());
        game1.register("Pedro");
        game1.register("Alicia");
        System.out.println(game1.getDobble().toString());
        System.out.println(game1.getCardsMesa().toString());
        game1.play(1);
        System.out.println(game1.getDobble().toString());
        System.out.println(game1.getCardsMesa().toString());
        game1.play(2);
        System.out.println(game1.getDobble().toString());
        System.out.println(game1.getCardsMesa().toString());
        game1.play(1);
        System.out.println(game1.getDobble().toString());
        System.out.println(game1.getCardsMesa().toString());
        game1.play(3);
        
        System.out.println(game1.getPlayers());
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
