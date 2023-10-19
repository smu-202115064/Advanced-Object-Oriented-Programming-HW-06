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
}