abstract class Decorator extends AbstractPizza {
    private AbstractPizza pizza;

    public Decorator(AbstractPizza pizza) {
        super(pizza.getSize(), pizza.getName(), pizza.getPrice());
        this.pizza = pizza;
    }

    public AbstractPizza getPizza() {
        return pizza;
    }

    public int getSize() {
        return pizza.getSize();
    }

    public String getName() {
        return getDecoratorName() + " " + pizza.getName();
    }

    public int getPrice() {
        return getDecoratorPrice() + pizza.getPrice();
    }

    public abstract String getDecoratorName();
    public abstract int getDecoratorPrice();
}