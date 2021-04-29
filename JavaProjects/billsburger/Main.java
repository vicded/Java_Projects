package billsburger;

class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String additional1Name;
    private double additional1Price;
    private String additional2Name;
    private double additional2Price;
    private String additional3Name;
    private double additional3Price;
    private String additional4Name;
    private double additional4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String additional1Name, double additional1Price) {
        this.additional1Name = additional1Name; 
        this.additional1Price = additional1Price;
    }
    public void addHamburgerAddition2(String additional2Name, double additional2Price) {
        this.additional2Name = additional2Name;
        this.additional2Price = additional2Price;
    }
    public void addHamburgerAddition3(String additional3Name, double additional3Price) {
        this.additional3Name = additional3Name;
        this.additional3Price = additional3Price;
    }
    public void addHamburgerAddition4(String additional4Name, double additional4Price) {
        this.additional4Name = additional4Name;
        this.additional4Price = additional4Price;
    }

    public double itemizeHamburger(){
        System.out.println(this.name + " hamburger on a " + this.breadRollType + " roll with " + this.meat + " meat for a price of: $" + this.price);
        System.out.println("Added " + this.additional1Name + " for $ " + this.additional1Price);
        System.out.println("Added " + this.additional2Name + " for $ " + this.additional2Price);
        System.out.println("Added " + this.additional3Name + " for $ " + this.additional3Price);
        System.out.println("Added " + this.additional4Name + " for $ " + this.additional4Price);
       
        return this.price + additional1Price + additional2Price + additional3Price + additional4Price;
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }
    
    public double getPrice() {
        return price;
    }
    
    public String getBreadRollType() {
        return breadRollType;
    }
}

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "beef", 2.99, "white");
        hamburger.addHamburgerAddition1("Bacon", 0.68);
        hamburger.addHamburgerAddition2("BBQ", 0.50);
        hamburger.addHamburgerAddition3("Avocado", 0.30);

        System.out.println("Total of $" + String.format("%.2f", hamburger.itemizeHamburger()));
    }
}

