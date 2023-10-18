public class Cheese extends PizzaDecorator {
    protected String toppingName = "치즈";
    protected int toppingPrice = ToppingsPrice.CHEESE;

    public Cheese(Pizza pizza) {
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
