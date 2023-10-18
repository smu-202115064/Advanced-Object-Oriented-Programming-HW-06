import java.lang.reflect.Constructor;
import java.util.List;

class MainUsingSelectToppingPizza {
    public static void main(String[] args)  {
        List<String> list;
        LoadToppings loadToppings = new LoadToppings("toppings.txt");
        list = loadToppings.load();
    
        Pizza pizza = new Pizza(15);
        for (String topping : list) {
            try {
                Class<?> decoratorClass = Class.forName(topping);
                Constructor<PizzaDecorator> constructor = (Constructor<PizzaDecorator>) decoratorClass.getConstructor(Pizza.class);
                pizza = constructor.newInstance(pizza);
            }
            catch (Exception e) {
                System.out.println(topping + " 토핑은 존재하지 않습니다.");
                return;
            }
        }
        System.out.printf("피자: %s, 크기: %d, 가격: %d\n", pizza.getName(), pizza.getSize(), pizza.getPrice());
    }
}