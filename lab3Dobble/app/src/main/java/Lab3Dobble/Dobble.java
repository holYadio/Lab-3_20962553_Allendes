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
public class Dobble {

    private List<Card> cardsSet;
    private List<String> listaElementos;

    /**
     * Constructor del Dobble cuando no se entrega un maximo de cartas
     *
     * @param numElementos
     * @param cantCartas
     * @param elementos
     *
     */
    public Dobble(int numElementos, int cantCartas, List<String> elementos) {
        ArrayList<Card> cartas = new ArrayList<>();
        List<String> elementosCarta = new ArrayList<>();
        int id = 1;

        for (int i = 0; i < numElementos; i++) {
            String element = elementos.get(i);
            elementosCarta.add(element);
        }
        Card firstCard = new Card(id, elementosCarta);
        cartas.add(firstCard);
        id++;
        for (int j = 1; j <= (numElementos - 1); j++) {
            elementosCarta = new ArrayList<>();
            elementosCarta.add(elementos.get(0));
            for (int k = 1; k <= (numElementos - 1); k++) {
                elementosCarta.add(elementos.get(((numElementos - 1) * j + (k + 1)) - 1));
            }
            Card carta;
            carta = new Card(id, elementosCarta);
            cartas.add(carta);
            id++;
        }

        for (int i = 1; i <= (numElementos - 1); i++) {
            for (int j = 1; j <= (numElementos - 1); j++) {
                elementosCarta = new ArrayList<>();
                elementosCarta.add(elementos.get(i + 1));
                for (int k = 1; k <= (numElementos - 1); k++) {
                    elementosCarta.add(elementos.get(((numElementos - 1) + 2 + (k - 1)
                            * (numElementos - 1) + (((i - 1) * (k - 1) + j - 1)
                            % (numElementos - 1))) - 1));
                }
                Card carta;
                carta = new Card(id, elementosCarta);
                cartas.add(carta);
                id++;
            }
        }

        for (int i = cartas.size() - 1; i > 0; i--) {
            int randomInt = (int) Math.floor(Math.random() * (i + 1));
            Card carta = cartas.get(i);
            cartas.set(i, cartas.get(randomInt));
            cartas.set(randomInt, carta);
        }

        if (cantCartas < ((numElementos - 1) + ((numElementos - 1) * (numElementos - 1)) + 1)
                && cantCartas > 0) {
            ArrayList<Card> cards = new ArrayList<>();

            for (int i = 0; i < cantCartas; i++) {
                Card card = cartas.get(i);
                card.setId(i + 1);
                cards.add(card);
            }
            cartas = cards;
        }
        this.cardsSet = cartas;
        this.listaElementos = elementos;
    }

    /**
     * Obtiene la carta en la posicion n-1 entregada
     * @param n posicion de la carta que se desea encontrar
     * @return carta en la posicion señalada
     */
    public Card nthCard(int n) {
        return cardsSet.get(n);
    }

    /**
     * Calcula la cantidad de cartas que se pueden crear a partir de una carta
     * de muestra
     * @param cartaMuestra carta de muestra
     * @return cantidad de cartas que es posible crear
     */
    public int FindTotalCards(Card cartaMuestra) {
        int i = cartaMuestra.size();
        return (((i - 1) * (i - 1) + (i - 1) + 1));
    }

    /**
     * Cantidad de cartas
     * @return cantidad de cartas
     */
    public int numCards() {
        return cardsSet.size();
    }
    
    /**
     * Calcula la cantidad de elementos necesarios para generar un set de cartas
     * valido
     * @param cartaMuestra carta de muestra
     * @return cantidad de elementos necesarios para generar el conjunto valido
     */
    public int requiredElements(Card cartaMuestra) {
        int i = cartaMuestra.size();
        return (((i - 1) * (i - 1) + (i - 1) + 1));
    }
    
    /**
     * Elimina la n carta
     * @param n Numero de la carta que se desea eliminar
     */
    public void deleteCard(int n){
        cardsSet.remove(n-1);
    }
    
    /**
     * Crea una representacion de la carta como String
     * @return retorna la representacion como string del mazo
     */
    @Override
    public String toString() {
        String texto = "El cardsSet tiene las cartas" + " :\n";
        for (int i = 0; i < (cardsSet.size()); i++) {
            texto += cardsSet.get(i).toString() + "\n";
        }
        return texto;
    }

    /**
     * comprueba si dos dobble son iguales
     * @param o
     * @return 
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Dobble dobble = (Dobble) o;
        return Objects.equals(cardsSet, dobble.cardsSet) && Objects.equals(listaElementos, dobble.listaElementos);
    }
}
