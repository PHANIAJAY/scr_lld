package DesignPatternDecoratorandFlyWeight.DP_Decorator;

public class PlainPizza implements Pizza{
    //starting point for Pizza creation.

    @Override
    public void bake() {
        System.out.println("Baking plain Pizza");
    }
}
