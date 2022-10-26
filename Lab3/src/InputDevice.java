public class InputDevice {
    public Fruit[] readFruit(){

        Fruit[] fruitarr = new Fruit[6];

        fruitarr[0] = new Apple(10,20,50,Color.RED);
        fruitarr[1] = new Apple(5,200,100,Color.GREEN);
        fruitarr[2] = new Apple(16,22,235,Color.YELLOW);
        fruitarr[3] = new Banana(20, 11,10);
        fruitarr[4] = new Apple(124,22,55,Color.RED);
        fruitarr[5] = new Apple(111,25,100,Color.RED);

        return fruitarr;
    }
}
