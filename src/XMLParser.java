import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

/**
 * Created by ferenc on 2017.03.01..
 */
public class XMLParser {

    private static final String filePath = "src/Cards.xml";
    Dealer dealer = new Dealer();

    public void XmlParser() {
        try {
            File inputFile = new File(filePath);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            NodeList nList = doc.getElementsByTagName("Card");
            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node node = nList.item(temp);
                Element element = (Element) node;

                String name = element.getAttribute("name");
                int size = Integer.valueOf(element.getElementsByTagName("breastSize").item(0).getTextContent());
                int holes = Integer.valueOf(element.getElementsByTagName("usableHoles").item(0).getTextContent());
                int partner = Integer.valueOf(element.getElementsByTagName("partnerCapacity").item(0).getTextContent());
                int price = Integer.valueOf(element.getElementsByTagName("price").item(0).getTextContent());
                String type = element.getElementsByTagName("type").item(0).getTextContent();

                Card c = new Card(name, size, holes, partner, price, type);
                dealer.addCard(c);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}