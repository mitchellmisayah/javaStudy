public class Product {

    private String name;
    private String location;
    private int weight;

    // 1st constructor
    public Product(String name) {
        this.name = name;
        this.weight = 1;
        this.location = "shelf";

    }

    public Product(String name, String location) {
        this.name = name;
        this.weight = 1;
        this.location = location;
    }

    public Product(String name, int weight) {
        this.name = name;
        this.weight = weight;
        this.location = "shelf";
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.weight + " kg) can be found from the " + this.location;
    }

}
