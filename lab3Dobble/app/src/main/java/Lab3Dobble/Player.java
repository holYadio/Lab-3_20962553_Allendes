/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab3Dobble;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author jdall
 */
public class Player {
    private String nombre;
    private int id;
    private List<Card> mazoPlayer;
    
    public Player(String nombre, int id){
        this.nombre = nombre;
        this.id = id;
        this.mazoPlayer = new ArrayList<>();
    }
    
    
    // GETTERS //
    
    /**
     * obtiene el nombre del jugador
     * @return nombre del Jugador
     */
    public String getNombre() {
        return nombre;
    }
    
    
    /**
     * Obtiene la id del jugador
     * @return id del jugador
     */
    public int getId(){
        return id;
    }
    
    
    /**
     * Obtiene el mazo del jugador
     * @return Mazo de cartas del jugador
     */
    public List<Card> getMazoPlayer() {
        return mazoPlayer;
    }
    
    @Override
    public String toString() {
    return "Player ={" + "nombre = " + nombre + ", ID = " + id + ", Mazo ="
            + mazoPlayer + '}';
    }
}
