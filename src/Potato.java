public class Potato extends PizzaDecorator {
    protected String toppingName = "포테이토";
    protected int toppingPrice = ToppingsPrice.POTATO;

    public Potato(Pizza pizza) {
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
