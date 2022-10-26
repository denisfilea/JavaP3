public class Main {
    public static void main(String[] args) {

        InputDevice input = new InputDevice();
        OutputDevice output = new OutputDevice();
        Application app = new Application(input, output);

        Fruit[] fruits;
        fruits = input.readFruit();

        app.prepareFruit(fruits);

    }
}