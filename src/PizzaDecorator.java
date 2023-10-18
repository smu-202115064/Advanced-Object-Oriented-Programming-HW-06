public abstract class PizzaDecorator extends Pizza {
    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        super(pizza.getSize());
        this.pizza = pizza;
    }

    abstract public int getSize();
    abstract public String getName();
    abstract public int getPrice();
}
