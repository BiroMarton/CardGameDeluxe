import java.io.Serializable;

/**
 * Created by vajni on 2017.03.01..
 */
public class Card implements Serializable{
    private String type;
    private String name;
    private int breastSize;
    private int usableHoles;
    private int partnerCapacity;
    private int price;

    public Card(String name, int breastSize, int usableHoles, int partnerCapacity, int price, String type) {
        this.name = name;
        this.breastSize = breastSize;
        this.usableHoles = usableHoles;
        this.partnerCapacity = partnerCapacity;
        this.price = price;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getBreastSize() {
        return breastSize;
    }

    public int getUsableHoles() {
        return usableHoles;
    }

    public int getPartnerCapacity() {
        return partnerCapacity;
    }

    public int getPrice() {
        return price;
    }

    public int hashCode() {
        return this.type.hashCode();
    }

    @Override
    public String toString() {
        String result =
                "Name = " + name +"\n"+
                "Breast size = " + breastSize + " ccm\n"+
                "Usable holes = " + usableHoles +"\n"+
                "Partner capacity = " + partnerCapacity +"\n"+
                "Price = " + price + " PLN\n";
        return result;
    }
}



