package DP_Abstract_Factory;

import jdk.nashorn.internal.runtime.regexp.JoniRegExp;

public class DAOFactory_Producer {
    public static DAoAbstractFactory produce(String factorytype)
    {
        DAoAbstractFactory daf=null;
        if(factorytype.equals("XML")){
             daf=new XMLDAoAbstractFactory();
        }
        else if(factorytype.equals("DB")){
            daf=new DBDaoAbstractFactory();
        }
        return daf;
    }
}
