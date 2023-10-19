public class BulgogiDecorator extends Decorator {
    public BulgogiDecorator(AbstractPizza pizza) {
        super(pizza);
    }

    public String getDecoratorName() {
        return "불고기";
    }

    public int getDecoratorPrice() {
        return ToppingsPrice.BULGOGI;
    }
}
