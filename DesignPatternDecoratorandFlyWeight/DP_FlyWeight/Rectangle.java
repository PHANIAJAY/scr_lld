package DesignPatternDecoratorandFlyWeight.DP_FlyWeight;
public class Rectangle extends Shape{
    private String label;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
    public void draw(int length,int breadth,String fillStyle){
        System.out.println("Drawing the label"+label+"with length" +length+"with breadth"+breadth+"With Fillstyle"+fillStyle);
    }
}
