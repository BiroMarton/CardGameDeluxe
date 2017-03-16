/**
 * Created by vajni on 2017.03.01..
 */
public interface Comparator {

    int compareByBoobSize(Card c1, Card c2);
    int compareByAvailableHoles(Card c1, Card c2);
    int compareByCapacity(Card c1, Card c2);
    int compareByPrice(Card c1, Card c2);
}
