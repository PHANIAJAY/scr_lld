package DP_Abstract_Factory;

public class xmlDeptDao implements DAO{

    @Override
    public void save(String type) {
        System.out.println("saving dept to XML format");
    }
}
