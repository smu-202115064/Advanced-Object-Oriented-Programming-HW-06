abstract class AbstractPizza {
    private int size;
    private String name;
    private int price;

    public AbstractPizza() {
    }

    public AbstractPizza(int size, String name, int price) {
        this.size = size;
        this.name = name;
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}