package DP_FactoryMethod_1;

public class PersonFactory {
    public static Person create(String msg){
        Person p=null;
        if(msg=="Male"){
            return p=new Male();
        }
        return p=new Female();

    }
}
