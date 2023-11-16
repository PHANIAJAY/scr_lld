package DesignPatternDecoratorandFlyWeight.DP_Decorator;

public class VeggiePizzaDecoartor extends PizzaDecorator{

    public VeggiePizzaDecoartor(Pizza pizza) {
        super(pizza);
    }

    public void bake(){
        super.bake();
        System.out.println("Adding the Veggie Topings ");
    }
}
