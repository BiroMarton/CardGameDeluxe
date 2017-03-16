import java.util.Collections;

public class Dealer extends Deck{
	
	public void shuffle(){
		Collections.shuffle(deckList);

	}
	public void addCardsToPlayers(Player p1, Player p2){
		for(int i = 0; i < deckList.size(); i+=2){
			p1.getCardsInHands().add(deckList.get(i));
			p2.getCardsInHands().add(deckList.get(i+1));
		}
		
	}
	
	public void addCardsToPlayers(Player p1, Player p2, Player p3){
		for(int i = 0; i < deckList.size(); i+=3){
			p1.getCardsInHands().add(deckList.get(i));
			p2.getCardsInHands().add(deckList.get(i+1));
			p3.getCardsInHands().add(deckList.get(i+2));
		}
		
	}
	
	public void addCardsToPlayers(Player p1, Player p2, Player p3, Player p4){
		for(int i = 0; i < deckList.size(); i+=4){
			p1.getCardsInHands().add(deckList.get(i));
			p2.getCardsInHands().add(deckList.get(i+1));
			p3.getCardsInHands().add(deckList.get(i+2));
			p4.getCardsInHands().add(deckList.get(i+3));
		}
		
	}


}