import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Client{


    public static void main(String args[]) {
    	Table t = new Table(2);
    	t.parser.XmlParser();
    	List<Card> cards = t.parser.dealer.deckList;
    	Printer printer = new Printer();
    	String name;
    	IOclass io = new IOclass();
    	int count = 1;
    	int end = 45;

    	Scanner sc = new Scanner(System.in);
    	printer.printNudeTwo();
    	printer.print("Player one enters his/her name...\n");

        try {
            // Create a socket
            Socket soc = new Socket(InetAddress.getLocalHost(), 8020);
    		OutputStream o = soc.getOutputStream();
    		ObjectOutput s = new ObjectOutputStream(o);
    		
			InputStream ou = soc.getInputStream();
			ObjectInput su = new ObjectInputStream(ou);
    		
            printer.print(io.read(soc));
            io.write(soc, sc.next());
            printer.print(io.read(soc));
            printer.print(io.read(soc));
            while(true){
            	count = su.readInt();
            	printer.print("Your current card is: \n");
            	name = (String) su.readObject();
            	for(Card card: cards){
            		if(card.getName().equals(name)){
            			printer.printObject(card);
            		}
            	}
            	if(count == 1){
            		 printer.print(io.read(soc));
            		
            	}
            	else{
            		int choice = t.chooseAttribute();
            		s.writeObject(choice);
            	}
            	end = su.readInt();
            	System.out.println(end);
            	if(end < 1 || end == 12){
            		break;
            	}

            }
        	if( end < 1){
        		printer.print("You lost the game.");
        	}else if(end == 12){
        		printer.print("You won");
        		printer.printNudeFour();
        	}
  
			
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Error during serialization");
            System.exit(1);
        }
    }

    
}