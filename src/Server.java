import java.io.*;
import java.net.*;
import java.util.List;
import java.util.Scanner;





public class Server{


    public static void main(String args[]) throws IOException {
        Printer printer = new Printer();
    	IOclass io = new IOclass();
        ServerSocket ser = null;
        Socket soc = null;
        int result;
		int count = 1;

		Scanner sc = new Scanner(System.in);


			try {
		        printer.printNudeOne();
		        Table t = new Table(2);
		        t.parser.XmlParser();
				int allCards = t.parser.dealer.deckList.size();
				printer.print("Waiting for player 2\n");
				

				
				ser = new ServerSocket(8020);
				soc = ser.accept();
				
				InputStream ou = soc.getInputStream();
				ObjectInput su = new ObjectInputStream(ou);
				
				OutputStream o = soc.getOutputStream();
				ObjectOutput s = new ObjectOutputStream(o);
				
				System.out.println("Player 2 connected\n");
	        	printer.print("Player 1 enter your name:");
	            Player p = new Player(sc.next());
	            t.table.add(p);
	            printer.print("Player two enters his/her name...\n");
	            io.write(soc, "Player 2 enter your name: ");
	            Player p2 = new Player(io.read(soc));
	            t.table.add(p2);
	            printer.print("Players are :" + t.table.get(0).getName() + " and " + t.table.get(1).getName());
	            io.write(soc, "Players are :" + t.table.get(0).getName() + " and " + t.table.get(1).getName());
	            t.handOutCards();
	            printer.print("\nCards have been handed out! \nLet the game begin!\n");
	            io.write(soc, "\nCards have been handed out! \nLet the game begin!\n");
	            
	            
	    		Player player1 = t.table.get(0);
	    		Player player2 = t.table.get(1);
	    		List<Card> player1Hand = player1.getCardsInHands();
	    		List<Card> player2Hand = player2.getCardsInHands();

	    		
	            while(true){
	            	
					t.currentCards.add(player1.getCardsInHands().get(0));
					player1.getCardsInHands().remove(0);
					
					t.currentCards.add(player2.getCardsInHands().get(0));
					player2.getCardsInHands().remove(0);

	            	printer.print("Your card is: ");
	            	printer.printObject(t.currentCards.get(0));
	            	
	            	s.writeInt(count);
	            	s.writeObject(t.currentCards.get(1).getName());
	            	
	            	if(count == 1){
	            		io.write(soc, "Your opponent is choosing an attribute to compare.");
	            		result = t.comparer(t.chooseAttribute());
	            		
	            	}
	            	else{
	            		printer.print("Your opponent is choosing an attribute to compare.");
	            		int choice = (Integer) su.readObject();
	            		result = t.comparer(choice);
	            		
	            	}
	            	
	    			if (result == 1) {
	    				player1Hand.add(t.currentCards.get(0));
	    				player1Hand.add(t.currentCards.get(1));
	    				count = 1;

	    			} else if (result == -1) {
	    				player2Hand.add(t.currentCards.get(0));
	    				player2Hand.add(t.currentCards.get(1));
	    				count = 2;
	    			} else {
	    				do{
	    				printer.print("It is a tie! Choose another attribute to compare.\n");
	    				
	    				
		            	if(count == 1){
		            		result = t.comparer(t.chooseAttribute());
		            		io.write(soc, "Your opponent is choosing an attribute to compare.");
		            		
		            	}
		            	else{
		            		printer.print("Your opponent is choosing an attribute to compare.");
		            		int choice = (Integer) su.readObject();
		            		t.comparer(choice);
		            		
		            	}
	    				
	    				
	    				if (result == 1) {
	    					player1Hand.add(t.currentCards.get(0));
	    					player1Hand.add(t.currentCards.get(1));
	    					count = 1;

	    				} else if (result == -1){
	    					player2Hand.add(t.currentCards.get(0));
	    					player2Hand.add(t.currentCards.get(1));
	    					count = 2;
	    					}else{
	    						
	    					}
	    				}while(result == 0);
	    			}


	    			t.currentCards.clear();
	    			s.writeInt(player2Hand.size());
	    			
	    			if(player1Hand.size() == 12 || player2Hand.size() == 12){
	    				break;
	    			}

	    }
    			if(player1Hand.size() == 0){
    				printer.print("You lost the game.");
    			}else{
    				printer.print("Winner!");
    				printer.printNudeThree();
    			}

			}catch (Exception e) {
		System.out.println(e.getMessage());
		System.out.println("Error during serialization");
		System.exit(1);
	    }
			}
}
    
