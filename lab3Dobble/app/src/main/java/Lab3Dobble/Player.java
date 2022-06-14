/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab3Dobble;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author jdall
 */
public class Player {
    private String nombre;
    private int id;
    private List<Card> mazoPlayer;
    private int puntos;

    public Player(String nombre, int id){
        this.nombre = nombre;
        this.id = id;
        this.mazoPlayer = new ArrayList<>();
        this.puntos = 0;
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

    public int getPuntos() {
        return puntos;
    }
    
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        String texto = "Jugador " + id + ": " + nombre + "\n";
        texto += "El mazo del jugador es: \n";
        for (int i = 0; i < (mazoPlayer.size()); i++) {
            texto += mazoPlayer.get(i).toString() + "\n";
        }
        texto += "El jugador tiene un puntaje de " + puntos + "\n";
        return texto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return getId() == player.getId() && getNombre().equals(player.getNombre()) && Objects.equals(getMazoPlayer(), player.getMazoPlayer());
    }

}
