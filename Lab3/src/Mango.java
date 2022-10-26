public class Mango  extends Fruit implements SeedRemovable,Peelable{
    public Mango(Integer weight, Integer sugar, Integer water){
        super(weight, sugar, water, Color.YELLOW);
    }

    public boolean peel = true, seeds = true;

    public boolean hasSeeds(){
        return seeds;
    }

    public boolean hasPeel(){
        return peel;
    }

    public void removeSeeds(){
        System.out.println("Mango seeds have been removed.");
        seeds = false;
    }

    public void peelOff(){
        System.out.println("Peeled the Mango.");
        peel = false;
    }

}
