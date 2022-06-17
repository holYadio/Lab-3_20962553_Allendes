package Lab3Dobble;

import java.util.List;

public interface IPlayer {
    String getNombre();

    int getId();

    List<Card> getMazoPlayer();

    int getPuntos();

    void setPuntos(int puntos);
}
