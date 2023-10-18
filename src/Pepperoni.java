public class Pepperoni extends PizzaDecorator {
    protected String toppingName = "페퍼로니";
    protected int toppingPrice = ToppingsPrice.PEPPERONI;

    public Pepperoni(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int getSize() {
        return pizza.getSize();
    }

    @Override
    public String getName() {
        return toppingName + " " + pizza.getName();
    }

    @Override
    public int getPrice() {
        return toppingPrice + pizza.getPrice();
    }
}
