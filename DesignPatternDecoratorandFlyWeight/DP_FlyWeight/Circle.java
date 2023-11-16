package DesignPatternDecoratorandFlyWeight.DP_FlyWeight;

public class Circle extends Shape{
    private String label;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
    public void draw(int radius,String fillcolor,String linecolor){
        System.out.println("Drawing the label"+label+"with radius" +radius+"With fillcolor"+fillcolor);
    }
}
