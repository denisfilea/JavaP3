public class Application {

    InputDevice input;
    OutputDevice output;

    public Application(InputDevice input, OutputDevice output){
        this.input = input;
        this.output = output;
    }

    public int computeWeight(Fruit[] fruits){
        int weight = 0;

        for (Fruit fruit : fruits) {
            weight += fruit.weight;
        }

        return weight;
    }

    public int computeSugarContent(Fruit[] fruits){
        int sugar = 0;

        for (Fruit fruit : fruits) {
            sugar += fruit.sugar;
        }

        return sugar;
    }

    public void prepareFruit(Fruit[] fruits){
        for(Fruit fruit : fruits){
            if(fruit instanceof SeedRemovable){
                ((SeedRemovable) fruit).removeSeeds();
            }
            if(fruit instanceof Peelable){
                ((Peelable) fruit).peelOff();
            }
        }
        System.out.println("Fruit salad prepared!");
    }

}
