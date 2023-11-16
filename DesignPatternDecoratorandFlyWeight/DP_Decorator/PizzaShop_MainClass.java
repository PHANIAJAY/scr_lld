package DesignPatternDecoratorandFlyWeight.DP_Decorator;

public class PizzaShop_MainClass {
    public static void main(String[] args) {
        Pizza pizza=new VeggiePizzaDecoartor(new CheesePizzaDecorator(new PlainPizza()));
        pizza.bake();
    }
}

//A decorator pattern is a behavioural pattern which adds
// adittionaly functionalty to object dynamically at run time.

/*Decorator :lets you attach new behaviour to an object by placing this object
        inside a special wrappper that contains these behaviour
        decorator pattern .it wraps an exsisting object
        allowing you to add a new functionality to that object without altering its structure .
        https://youtube.com/watch?v=v6tpISNjHf8   */