import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        InputDevice input = new InputDevice();
        OutputDevice output = new OutputDevice();
        Application app = new Application(input, output);

        Map<String, Integer> fruitMap = new HashMap<>();

        ArrayList<Fruit> fruits;
        fruits = input.readFruit();

        //app.prepareFruit(fruits);
        fruitMap = app.countFruit(fruits);
        //System.out.println(fruitMap);


    }
}