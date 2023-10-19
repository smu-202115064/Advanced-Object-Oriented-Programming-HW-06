import java.util.List;

class MainUsingSelectToppingPizza {
    public static void main(String[] args) {
        List<String> list;
        LoadToppings loadToppings = new LoadToppings("toppings.txt");
        list = loadToppings.load();
    
        AbstractPizza pizza = new Pizza(15);
        for (String topping : list) {
            if (topping.equals("Bulgogi")) {
                pizza = new BulgogiDecorator(pizza);
            }
            else if (topping.equals("Pepperoni")) {
                pizza = new PepperoniDecorator(pizza);
            }
        }
        System.out.printf("피자: %s, 크기: %d, 가격: %d\n", pizza.getName(), pizza.getSize(), pizza.getPrice());
    }
}