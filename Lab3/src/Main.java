public class Main {
    public static void main(String[] args) {

        InputDevice input = new InputDevice();
        OutputDevice output = new OutputDevice();
        Application app = new Application(input, output);

        Fruit[] fruits;
        fruits = input.readFruit();

        System.out.println(app.computeWeight(fruits));
        System.out.println(app.computeSugarContent(fruits));

        Banana banana = new Banana(12,123,142);
        System.out.println(banana.hasPeel());
        banana.peelOff();
        System.out.println(banana.hasPeel());

        Apple apple = new Apple(145, 123, 55, Color.GREEN);
        System.out.println(apple.hasSeeds());
        apple.removeSeeds();
        System.out.println(apple.hasSeeds());
    }
}