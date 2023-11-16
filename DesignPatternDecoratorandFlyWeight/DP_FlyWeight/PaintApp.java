package DesignPatternDecoratorandFlyWeight.DP_FlyWeight;

public class PaintApp {
    public void render(int numofshapes){
        Shape shape=null;
        for(int i=1;i<=numofshapes;i++){
            if(i%2==0){
                shape=ShapeFactory.getShape("circle");
                shape.draw(i,"red","white");
            }
            else {
                shape=ShapeFactory.getShape("Rectangle");
                shape.draw(i,i+i,"dotted");
            }
        }
    }
}
