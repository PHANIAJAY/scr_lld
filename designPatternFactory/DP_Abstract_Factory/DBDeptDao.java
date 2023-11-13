package DP_Abstract_Factory;

public class DBDeptDao implements DAO{
    @Override
    public void save(String type) {
        System.out.println("saving Dept to DB format");
    }
}
