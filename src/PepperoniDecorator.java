public class PepperoniDecorator extends Decorator {
    public PepperoniDecorator(AbstractPizza pizza) {
        super(pizza);
    }

    public String getName() {
        return "페퍼로니 " + getPizza().getName();
    }

    public int getPrice() {
        return ToppingsPrice.PEPPERONI + getPizza().getPrice();
    }
}
