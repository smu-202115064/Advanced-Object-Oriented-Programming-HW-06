public class PepperoniDecorator extends Decorator {
    public PepperoniDecorator(AbstractPizza pizza) {
        super(pizza);
    }

    public String getDecoratorName() {
        return "페퍼로니";
    }

    public int getDecoratorPrice() {
        return ToppingsPrice.PEPPERONI;
    }
}
