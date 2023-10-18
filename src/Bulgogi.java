public class Bulgogi extends PizzaDecorator {
    protected String toppingName = "불고기";
    protected int toppingPrice = ToppingsPrice.BULGOGI;

    public Bulgogi(Pizza pizza) {
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
