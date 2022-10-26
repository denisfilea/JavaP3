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

}
