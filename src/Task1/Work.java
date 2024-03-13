package Task1;

public class Work {
    private String name;
    private int cost;

    public Work(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return name + " - " + cost;
    }
}