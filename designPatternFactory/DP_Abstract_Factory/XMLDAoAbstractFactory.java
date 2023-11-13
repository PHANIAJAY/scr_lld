package DP_Abstract_Factory;

public class XMLDAoAbstractFactory extends DAoAbstractFactory{
    @Override
    public DAO create(String type) {
        DAO dao=null;
        if(type.equals("DB")){
            return dao=new xmlDeptDao();
        }
        else if(type.equals("Emp")){
            return dao=new xmEmpDao();
        }
        return dao;
    }
}
