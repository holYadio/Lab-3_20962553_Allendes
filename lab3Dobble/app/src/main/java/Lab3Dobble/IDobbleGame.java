package Lab3Dobble;

public interface IDobbleGame {
    void register(String namePlayer);

    String whoseTurnIsIt();

    void play(int i);
}
