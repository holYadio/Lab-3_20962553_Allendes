/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab3Dobble;

import Lab3Dobble.Player;
import Lab3Dobble.Dobble;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jdall
 */
public class DobbleGame {
    private int cantPlayers;
    private List<Player> players;
    private Dobble dobble;
    private String mode;
    private int turnoPlayer;
    private List<Card> CardsMesa;
    public DobbleGame(int cantJugadores, int cantCartas, String modo) {
        Scanner entrada = new Scanner(System.in);
        List<Player> jugadores = new ArrayList<>();
        List<String> elementos = new ArrayList<>();
        elementos.add("a");
        elementos.add("b");
        elementos.add("c");
        elementos.add("d");
        elementos.add("e");
        elementos.add("f");
        elementos.add("g");
        elementos.add("h");
        elementos.add("i");
        elementos.add("j");
        elementos.add("k");
        elementos.add("l");
        elementos.add("m");
        /*
        boolean continuacion = true;
        while(continuacion){
            System.out.println("Ingrese una opcion:\n "
                + "1. Ingresar una lista de elementos\n "
                + "2. Ocupar una lista de numeros (ingresar el maximo num)\n "
                + "3. Ocupar lista de letras con 13 elementos (Maximo 4 elementos por carta)");
            //int numOpcion = entrada.nextInt();
            int numOpcion = 3;
            if (numOpcion == 1){
                System.out.println("Cual es la cantidad de elementos que desea ingresar: ");
                numElementos = entrada.nextInt();
                for(int i = 0; i < numElementos; i++){
                    System.out.println("Ingrese el elemente "+ (i+1) +':');
                    Scanner elemento = new Scanner(System.in);
                    String element = elemento.nextLine();
                    elementos.add(element);
                }
                continuacion = false;
            } else if(numOpcion == 2){
                System.out.println("Ingresar el maximo de la lista: ");
                numElementos = entrada.nextInt();
                for(int i = 1; i <= numElementos; i++){
                    String strI = i + "";
                    elementos.add(strI);
                }
                
                continuacion = false;    
            } else if(numOpcion == 3){
                numElementos = 13;
                elementos.add("a");
                elementos.add("b");
                elementos.add("c");
                elementos.add("d");
                elementos.add("e");
                elementos.add("f");
                elementos.add("g");
                elementos.add("h");
                elementos.add("i");
                elementos.add("j");
                elementos.add("k");
                elementos.add("l");
                elementos.add("m");
                continuacion = false; 
            } else{
                System.out.println("Ingrese una opcion valida");
            }
        }*/
        System.out.println("Ingrese la cantidad de elementos por carta");
        int numElementos = entrada.nextInt();
        this.cantPlayers = cantJugadores;
        this.players = jugadores;
        this.dobble = new Dobble(numElementos, cantCartas, elementos);
        this.mode = modo.toLowerCase();
        this.turnoPlayer = 1;
        this.CardsMesa = new ArrayList<>();
    }
    
    //          GETTERS          //
    public List<Player> getPlayers() {
        return players;
    }

    public Dobble getDobble() {
        return dobble;
    }

    public String getMode() {
        return mode;
    }

    public int getTurnoPlayer() {
        return turnoPlayer;
    }

    public int getCantPlayers() {
        return cantPlayers;
    }


    public List<Card> getCardsMesa() {
        return CardsMesa;
    }
    
    //          SETTERS         //
    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public void setDobble(Dobble dobble) {
        this.dobble = dobble;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }
    
    public void setTurnoPlayer(int turnoPlayer) {
        this.turnoPlayer = turnoPlayer;
    }
    
    public void setCantPlayers(int cantPlayers) {
        this.cantPlayers = cantPlayers;
    }

    public void setCardsMesa(List<Card> CardsMesa) {
        this.CardsMesa = CardsMesa;
    }
    
    //              Metodos Auxiliares              //
    /**
     * 
     * @param namePlayer 
     */
    public void register(String namePlayer){
        int existe = 0;
        if(players.isEmpty()){
            Player player = new Player(namePlayer,1);
            players.add(player);
        } else{
            if(players.size()< cantPlayers){
                for(int i = 0; i < players.size();i++){
                    if(namePlayer == players.get(i).getNombre()){
                        existe ++;
                        System.out.println(namePlayer);
                        System.out.println(players.get(i).getNombre());
                    }
                }
                if(existe == 1){
                    System.out.println("ERROR: El usuario ya esta registrado");
                }else{
                    Player player = new Player(namePlayer,players.size()+1);
                    players.add(player);
                } 
            } else{
                System.out.println("ERROR: Ya se encuentra el maximo de jugadores para este juego");
            }
                
        }
    }
    
    public String whoseTurnIsIt(){
        return "El turno es del jugador " + turnoPlayer + ": " +
                players.get(turnoPlayer).getNombre();
    }

    /**
     * 
     * @param i 
     */
    public void play(int i){
        if("stackmode".equals(mode)){
            if(CardsMesa.isEmpty()){
                int x = dobble.numCards();
                System.out.println("Cartas en mesa");
                System.out.println(dobble.nthCard(x-1));
                System.out.println(dobble.nthCard(x-2));
                CardsMesa.add(dobble.nthCard(x-1));
                CardsMesa.add(dobble.nthCard(x-2));
                dobble.deleteCard(x);
                dobble.deleteCard(x-1);
            }else{
                System.out.println(CardsMesa.get(0));
                System.out.println(CardsMesa.get(1));
            }
            switch (i) {
                case 1:
                    Scanner entrada = new Scanner(System.in);
                    String element = entrada.nextLine();
                    if ((CardsMesa.get(0).existeElemento(element)) &&
                            (CardsMesa.get(1).existeElemento(element))){
                        players.get(turnoPlayer - 1).getMazoPlayer().add(CardsMesa.get(0));
                        players.get(turnoPlayer - 1).getMazoPlayer().add(CardsMesa.get(1));
                        CardsMesa.remove(1);
                        CardsMesa.remove(0);
                        int puntos = players.get(turnoPlayer - 1).getPuntos() + 2;
                        players.get(turnoPlayer - 1).setPuntos(puntos);
                        System.out.println("El elemento en comun es correcto\n");
                    }else{
                        System.out.println("El elemento no esta en las dos cart"
                                + "as");
                    }
                    if(players.size() == turnoPlayer){
                        turnoPlayer = 1;
                    }else{
                        turnoPlayer += 1;
                    }
                    break;
                //Pass
                case 2:
                    if(players.size() == turnoPlayer){
                        turnoPlayer = 1;
                    }else{
                        turnoPlayer += 1;
                    }
                    System.out.println("Ha pasado el turno");
                    break;
                //Finish  
                case 3:
                    Player temp;
                    for(int k = 1;k < (players.size());k++){
                        for (int j = 0 ; j < (players.size() - 1); j++){
                            if(players.get(j).getPuntos() > players.get(j+1).getPuntos()){
                                temp = players.get(j);
                                players.set(j, players.get(j+1)) ;
                                players.set(j + 1, temp);
                            }
                        }
                    }
                    break;
                default:
                    System.out.println("Ingrese una opcion Correcta");
                    break;
            }
        }else if("cpumode".equals(mode)){
            System.out.println("esta jugando el CPUMode");
        }else{
            System.out.println("Modo de juego invalido");        }
    }
    
    
}
