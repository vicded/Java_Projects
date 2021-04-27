package computer;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case thecase, Monitor monitor, Motherboard motherboard){
        this.theCase = thecase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        /* Fancy logo */
        monitor.drawPixelAt(230, 140, "Green");
    }
}
