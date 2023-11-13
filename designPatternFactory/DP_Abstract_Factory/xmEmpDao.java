package DP_Abstract_Factory;

public class xmEmpDao implements DAO{
    @Override
    public void save(String type) {
        System.out.println("saving Emp to XML format");
    }
}
