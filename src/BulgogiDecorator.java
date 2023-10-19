public class BulgogiDecorator extends Decorator {
    public BulgogiDecorator(AbstractPizza pizza) {
        super(pizza);
    }

    public String getName() {
        return "불고기 " + getPizza().getName();
    }

    public int getPrice() {
        return ToppingsPrice.BULGOGI + getPizza().getPrice();
    }
}
