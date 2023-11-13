package DP_Abstract_Factory;

public class DBDaoAbstractFactory extends DAoAbstractFactory{
    @Override
    public DAO create(String type) {
        DAO dao=null;
        if(type.equals("DB")){
            return dao=new DBDeptDao();
        }
        else if(type.equals("Emp")) {
            return dao = new DBEmpDao();
        }
        return dao;
    }
}
