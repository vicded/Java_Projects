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

    public double itemizeHamburger() {
        double hamburgerPrice = this.price;

        System.out.println(this.name + " hamburger on a " + this.breadRollType + " roll with " + this.meat + " meat for a price of: $" + String.format("%.2f", this.price) );
        
        if(this.additional1Name != null) {
            hamburgerPrice += this.additional1Price;
            System.out.println("Added " + this.additional1Name + " for $ " + this.additional1Price);
        }
        if(this.additional2Name != null) {
            hamburgerPrice += this.additional2Price;
            System.out.println("Added " + this.additional2Name + " for $ " + this.additional2Price);
        }
        if(this.additional3Name != null) {
            hamburgerPrice += this.additional3Price;
            System.out.println("Added " + this.additional3Name + " for $ " + this.additional3Price);
        }
        if(this.additional4Name != null) {
            hamburgerPrice += this.additional4Price;
            System.out.println("Added " + this.additional4Name + " for $ " + this.additional4Price);
        }
        
        return hamburgerPrice;
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

class DeluxBurger extends Hamburger {

    public DeluxBurger() {
        super("Deluxe", "Angus Beef", 19.10, "White");
        super.addHamburgerAddition1("Chips", 0);
        super.addHamburgerAddition2("Soda", 0);
    }

    @Override
    public void addHamburgerAddition1(String additional1Name, double additional1Price) {
        System.out.println("Cannot add items to Deluxe Burger");
    }
    @Override
    public void addHamburgerAddition2(String additional2Name, double additional2Price) {
        System.out.println("Cannot add items to Deluxe Burger");
    }
    @Override
    public void addHamburgerAddition3(String additional3Name, double additional3Price) {
        System.out.println("Cannot add items to Deluxe Burger");
    }
    @Override
    public void addHamburgerAddition4(String additional4Name, double additional4Price) {
        System.out.println("Cannot add items to Deluxe Burger");
    }
}

class HealthyHamburger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;
    
    HealthyHamburger(String meat, double price) {
        super("Healthy Burger", meat, price, "Brown");
    }

    public void addHealthyAddition1(String healthyExtra1Name, double healthyExtra1Price) {
        this.healthyExtra1Name = healthyExtra1Name;
        this.healthyExtra1Price = healthyExtra1Price;
    }

    public void addHealthyAddition2(String healthyExtra2Name, double healthyExtra2Price) {
        this.healthyExtra2Name = healthyExtra2Name;
        this.healthyExtra2Price = healthyExtra2Price;
    }

    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();

        if(this.healthyExtra1Name != null) {
            hamburgerPrice += this.healthyExtra1Price;
            System.out.println("Added " + this.healthyExtra1Name + " for $ " + this.healthyExtra1Price);
        }
        if(this.healthyExtra2Name != null) {
            hamburgerPrice += this.healthyExtra2Price;
            System.out.println("Added " + this.healthyExtra2Name + " for $ " + this.healthyExtra2Price);
        }

        return hamburgerPrice;
    }
}


public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "beef", 2.99, "white");
        DeluxBurger deluxe = new DeluxBurger();
        HealthyHamburger healthy = new HealthyHamburger("chicken", 4.00);

        hamburger.addHamburgerAddition1("Bacon", 0.68);
        hamburger.addHamburgerAddition2("BBQ", 0.50);
        hamburger.addHamburgerAddition3("Avocado", 0.30);

        healthy.addHamburgerAddition1("Cucumber", 0.50);
        healthy.addHamburgerAddition2("Tomato", 0.20);
        healthy.addHamburgerAddition3("bell pepper", 0.30);
        healthy.addHamburgerAddition4("Extra lettuce", 0.20);
        healthy.addHealthyAddition1("Egg", 1.25);
        healthy.addHealthyAddition2("Ranch", 0.20);

        
        System.out.println("Total of $" + String.format("%.2f", hamburger.itemizeHamburger())+ "\n" );

        System.out.println("Total of $" + String.format("%.2f", deluxe.itemizeHamburger()) + "\n" ); 

        System.out.println("Total of $" + String.format("%.2f", healthy.itemizeHamburger())); 
    }
}

