/**
 * Created by ferenc on 2017.03.01..
 */
public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        
        printer.printNudeOne();
        Table t = new Table(2);
        t.parser.XmlParser();
        t.addPlayersToTable();
        t.handOutCards();
        t.game();
    }
}

