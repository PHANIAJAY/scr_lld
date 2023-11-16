package DesignPatternDecoratorandFlyWeight.DP_FlyWeight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private static Map<String,Shape> shapes = new HashMap<>();
    public static Shape getShape(String type){
        Shape sshape=null;
        if(shapes.get(type)==null){
            return null;
        }
        else{
            if(type.equals("circle")){
                sshape=new Circle();
            } else if (type.equals("Rectangle")) {
                sshape=new Rectangle();
            }
            shapes.put(type,sshape);
        }
        return sshape;
    }
}
