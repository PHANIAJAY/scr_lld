package DP_Abstract_Factory;

public class DBEmpDao implements DAO{

    public void save(String type) {
        System.out.println("saving Emp[ployee to DB");
    }
}
