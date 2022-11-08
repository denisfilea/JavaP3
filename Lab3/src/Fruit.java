public abstract class Fruit implements Comparable<Fruit> {
    Integer weight;
    Integer sugar;
    Integer water;
    Color color;

    public int compareTo(Fruit fruit){
        if(this.weight == fruit.weight){
            if(this.sugar == fruit.sugar){
                return 0;
            } else if (this.sugar > fruit.sugar) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.weight > fruit.weight) {
            return -1;
        } else {
            return 1;
        }
    }

    public Fruit(Integer weight, Integer sugar, Integer water, Color color) {
        this.weight = weight;
        this.sugar = sugar;
        this.water = water;
        this.color = color;
    }
}
