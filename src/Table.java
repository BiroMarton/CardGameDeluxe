import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/*
 * *
 * Created by vajni on 2017.03.01..
 */
public class Table implements Comparator {

    XMLParser parser = new XMLParser();
    List<Player> table = new ArrayList<>();
    List<Card> currentCards = new ArrayList<Card>();
    Printer printer = new Printer();
    int numberOfPlayers;

    public Table(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public void addPlayersToTable(){
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<numberOfPlayers; i++) {
        	printer.print("Player "+ (i+1) + " enter your name:");
            Player p = new Player(sc.next());
            table.add(p);
        }
    }

    public int compareByBoobSize(Card c1, Card c2) {
        if (c1.getBreastSize() > c2.getBreastSize()){
            return 1;
        }
        else if (c1.getBreastSize() == c2.getBreastSize()){
            return 0;
        }
        else{
            return -1;
        }
    }

    public int compareByAvailableHoles(Card c1, Card c2){
        if (c1.getUsableHoles() > c2.getUsableHoles()){
            return 1;
        }
        else if (c1.getUsableHoles() == c2.getUsableHoles()){
            return 0;
        }
        else{
            return -1;
        }
    }

    public int compareByCapacity(Card c1, Card c2) {
        if (c1.getPartnerCapacity() > c2.getPartnerCapacity()){
            return 1;
        }
        else if (c1.getPartnerCapacity() == c2.getPartnerCapacity()){
            return 0;
        }
        else{
            return -1;
        }
    }

    public int compareByPrice(Card c1, Card c2) {
        if (c1.getPrice() < c2.getPrice()){
            return 1;
        }
        else if (c1.getPrice() == c2.getPrice()){
            return 0;
        }
        else{
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Table{"
				+ "player="
				+ table
				+ '}';
    }
    public void handOutCards(){
    	if (numberOfPlayers == 2){
    		parser.dealer.addCardsToPlayers(table.get(0), table.get(1));
    	}else if( numberOfPlayers == 3){
    		parser.dealer.addCardsToPlayers(table.get(0), table.get(1), table.get(2));
    	}
    	else if( numberOfPlayers == 4){
    		parser.dealer.addCardsToPlayers(table.get(0), table.get(1), table.get(2), table.get(3));
    	}
    }
    
    
    public int chooseAttribute(){
    	boolean continueInput = true;
    	Scanner sc = new Scanner(System.in);
    	
    	do {
    		try {
				printer.print("Pick your option(number between 1 and 4)\n1. Breast size\n2. Usable holes\n3. Partner capacity\n4. Price");
    			int number = sc.nextInt();
    			if(number > 0 && number < 5){
    				continueInput = false;
    				return number;
    			}
    			
    		} catch (InputMismatchException ex){
    			printer.print("Try again. (" +
    					"Incorrect input: an integer is required between 1 and 4.");
    			sc.nextLine();
    		}
    	} while (continueInput);
		return 0;
    }
    
    
	public boolean handChecker(int check){
		for(Player p : table){
			if(p.getCardsInHands().size() == check){
				return true;
			}
		}
		return false;
	}
	
	public void decider(int t, Player p1, Player p2){
		if (t == 1) {
			printer.print("It's " + p1.getName() + "'s turn!\n");
			printer.printObject(currentCards.get(0));
		} else {
			printer.print("It's " + p2.getName() + "'s turn!\n");
			printer.printObject(currentCards.get(1));
		}
	}
	
	
	
	public int comparer(int attribute){
		if(attribute == 1){
			return compareByBoobSize(currentCards.get(0), currentCards.get(1));
		} else if(attribute == 2){
			return compareByAvailableHoles(currentCards.get(0), currentCards.get(1));
		} else if(attribute == 3){
			return compareByCapacity(currentCards.get(0), currentCards.get(1));
		} else {
			return compareByPrice(currentCards.get(0), currentCards.get(1));
		}
	}
    
	
    public void game() {
		int allCards = parser.dealer.deckList.size();
		boolean quit = handChecker(allCards);
		int turn = 1;
		Player player1 = table.get(0);
		Player player2 = table.get(1);
		List<Card> player1Hand = player1.getCardsInHands();
		List<Card> player2Hand = player2.getCardsInHands();

		while (quit == false) {
			for (Player p : table) {
				currentCards.add(p.getCardsInHands().get(0));
				p.getCardsInHands().remove(0);
			}
			decider(turn,player1,player2);

			int result = comparer(chooseAttribute());

			if (result == 1) {
				player1Hand.add(currentCards.get(0));
				player1Hand.add(currentCards.get(1));
				turn = 1;

			} else if (result == -1) {
				player2Hand.add(currentCards.get(0));
				player2Hand.add(currentCards.get(1));
				turn = 2;

			} else {
				do{
				printer.print("It is a tie! Choose another attribute to compare.\n");
				
				decider(turn,player1,player2);
				
				result = comparer(chooseAttribute());
				
				
				if (result == 1) {
					player1Hand.add(currentCards.get(0));
					player1Hand.add(currentCards.get(1));
					turn = 1;

				} else if (result == -1){
					player2Hand.add(currentCards.get(0));
					player2Hand.add(currentCards.get(1));
					turn = 2;
					}else{
						
					}
				}while(result == 0);

	}
			currentCards.clear();
			quit = handChecker(allCards);
		}

		if(allCards == player1Hand.size()) {
			printer.print("The winner is: " + player1.getName());

		} else {
			printer.print("The winner is: " + player2.getName());
		}

		printer.print("\nYour reward is:\n");
		printer.printWin();
	}
}
