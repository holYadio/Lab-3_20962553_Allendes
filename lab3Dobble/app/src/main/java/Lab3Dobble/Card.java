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
 * 
 */


public class Card {
    private List<String> card;
    private int id;
    
    
    /**
     * Constructor de la carta
     * @param id
     * @param listElementos 
     */
    public Card(int id, List<String> listElementos){
        this.id = id;
        this.card = listElementos;
    }

    /**
     * Metodo para obtener la id de la carta
     * @return Id
     */
    public int getId(){
        return id;
    }
    
    /**
     * Metodo para obtener la lista de elementos que compone la carta
     * @return 
     */
    public List<String> getCard() {
        return card;
    }
    
    public void setCard(List<String> card) {
        this.card = card;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * 
     * @return 
     */
    
    public int size(){
        return card.size();
    }
    
    @Override
    public String toString() {
        String texto = "Carta " + id + " : ";
        for(int i = 0; i < (card.size() - 1); i++){
           texto += card.get(i) + ", ";
        }
        texto += card.get((card.size()-1)) + '.';
        return texto;
    }
    
}