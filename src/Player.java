import java.util.ArrayList;
import java.util.List;

/**
 * Created by ferenc on 2017.03.01..
 */
public class Player {

    private List<Card> cardsInHands;
    private String name;

    public Player(String name) {
        this.cardsInHands = new ArrayList();
        this.name = name;
    }

    public List<Card> getCardsInHands() {
        return cardsInHands;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
