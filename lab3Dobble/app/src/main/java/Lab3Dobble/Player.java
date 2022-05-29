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
    
    /**
     * Getters
     */
    public String getNombre() {
        return nombre;
    }
    public int getId(){
        return id;
    }
    public List<Card> getMazoPlayer() {
        return mazoPlayer;
    }
}