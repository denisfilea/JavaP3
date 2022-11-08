import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Application {

    InputDevice input;
    OutputDevice output;

    public Application(InputDevice input, OutputDevice output) {
        this.input = input;
        this.output = output;
    }

    public int computeWeight(ArrayList<Fruit> fruits) {
        int weight = 0;

        for (Fruit fruit : fruits) {
            weight += fruit.weight;
        }

        return weight;
    }

    public int computeSugarContent(ArrayList<Fruit> fruits) {
        int sugar = 0;

        for (Fruit fruit : fruits) {
            sugar += fruit.sugar;
        }

        return sugar;
    }

    public void prepareFruit(ArrayList<Fruit> fruits) {
        for (Fruit fruit : fruits) {
            if (fruit instanceof SeedRemovable) {
                ((SeedRemovable) fruit).removeSeeds();
            }
            if (fruit instanceof Peelable) {
                ((Peelable) fruit).peelOff();
            }
        }
        System.out.println("Fruits have been prepared!");
    }

    public HashMap<String, Integer> countFruit(ArrayList<Fruit> fruits) {

        HashMap<String, Integer> fruitMap = new HashMap<>();

        for (Fruit fruit : fruits) {

            String fruitName = fruit.getClass().getCanonicalName();

            if (fruitMap.containsKey(fruitName)) {
                fruitMap.put(fruitName, fruitMap.get(fruitName) + 1);
            } else {
                fruitMap.put(fruitName, 1);
            }
        }
        return fruitMap;
    }

    public void testFruitComparison(ArrayList<Fruit> fruits){
        Collections.sort(fruits);
        System.out.println(fruits);
        System.out.println(Collections.max(fruits));
        System.out.println(Collections.min(fruits));
    }

}
