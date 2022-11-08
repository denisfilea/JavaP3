public class Banana extends Fruit implements Peelable {

    public Banana(Integer weight, Integer sugar, Integer water) {
        super(weight, sugar, water, Color.YELLOW);
    }

    public boolean peel = true;

    public boolean hasPeel() {
        return peel;
    }

    public void peelOff() {
        System.out.println("Peeled the banana.");
        peel = false;
    }

}
