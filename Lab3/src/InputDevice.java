import java.util.ArrayList;

public class InputDevice {
    public ArrayList<Fruit> readFruit() {

        ArrayList<Fruit> fruitarray = new ArrayList<>();

        fruitarray.add(new Apple(10, 20, 50, Color.RED));
        fruitarray.add(new Mango(5, 200, 100));
        fruitarray.add(new Apple(16, 22, 235, Color.YELLOW));
        fruitarray.add(new Banana(20, 11, 10));
        fruitarray.add(new Mango(124, 22, 55));
        fruitarray.add(new Apple(111, 25, 100, Color.RED));
        fruitarray.add(new Banana(10, 20, 50));

        return fruitarray;
    }
}
