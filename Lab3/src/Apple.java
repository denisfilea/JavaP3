public class Apple extends Fruit implements SeedRemovable {
    public Apple(Integer weight, Integer sugar, Integer water, Color color) {
        super(weight, sugar, water, color);
    }

    public boolean seeds = true;

    public boolean hasSeeds() {
        return seeds;
    }

    public void removeSeeds() {
        System.out.println("Apple seeds have been removed.");
        seeds = false;
    }


}
