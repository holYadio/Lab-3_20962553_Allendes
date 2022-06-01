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

public class Dobble {
    private ArrayList<Card> cardsSet;
    private List<String> listaElementos;
    
    /**
     * Constructor del Dobble cuando no se entrega un maximo de cartas
     * @param numElementos
     * @param cantCartas
     * @param elementos
     * 
     */
    public Dobble (int numElementos, int cantCartas, List<String> elementos){
        ArrayList<Card> cartas = new ArrayList<>();
        List<String> elementosCarta = new ArrayList<>();
        
        for(int i = 0; i < numElementos;i++){
            elementosCarta.add(elementos.get(i));
        }
        Card firstCard = new Card(1,elementosCarta);
        cartas.add(firstCard);
        elementosCarta.clear();
        for (int j = 1; j < (numElementos - 1); j++) {
            elementosCarta.clear();
            elementosCarta.add(elementos.get(0));
            for (int k = 1; k < (numElementos - 1); k++) {
                elementosCarta.add(elementos.get((numElementos - 1)* j + (k+1)));
            }
            Card carta = new Card(cartas.size(),elementosCarta);
            cartas.add(carta);
        }
        for (int i= 1; i<numElementos; i++) {
            for (int j = 1; j < (numElementos - 1); j++){
                elementosCarta.clear();
                elementosCarta.add(elementos.get(i+1));
                for (int k = 1; k < (numElementos - 1); k++){
                    elementosCarta.add(elementos.get((numElementos - 1)+2+(k-1)*
                            (numElementos - 1)+(((i-1)*(k-1)+j-1)%
                                    (numElementos - 1))));
                }
                Card carta = new Card(cartas.size(),elementosCarta);
                cartas.add(carta);
            }
        }
        /*
        for(int i = cartas.size()-1;i>0;i--){
            int randomInt = (int)Math.floor(Math.random() * (i + 1));
            Card carta = cartas.get(i);
            cartas.set(i,cartas.get(randomInt));
            cartas.set(randomInt,carta);
        }
        */
        if(cantCartas != ((numElementos-1)+(numElementos-1)*(numElementos-1) + 1)
                && cantCartas > 0){
            for(int i = 0; i < cantCartas;i++){
                int length = cartas.size();
                cartas.remove(length - 1);
            }
        }
        this.cardsSet = cartas;
        this.listaElementos = elementos;        
    }
}
