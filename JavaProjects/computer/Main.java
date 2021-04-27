package computer;

public class Main {
    public static void main(String[] args) {
        
        Case theCase = new Case("220B", "Dell", "240", new Dimensions(20, 20, 5));
        Monitor theMonitor = new Monitor("27in Beast", "Acer", 27, new Resolution(2540, 1440));
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePc = new PC(theCase, theMonitor, theMotherboard);
        thePc.powerUp();

    }
}
