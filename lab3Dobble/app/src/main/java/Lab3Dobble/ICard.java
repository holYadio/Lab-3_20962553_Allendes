package Lab3Dobble;

import java.util.List;

public interface ICard {
    boolean verificarCarta(List<String> cardComp);

    boolean existeElemento(String elemento);

    int size();
}
