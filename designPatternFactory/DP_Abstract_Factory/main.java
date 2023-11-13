package DP_Abstract_Factory;

public class main {
    public static void main(String[] args) {
        DAoAbstractFactory daf=DAOFactory_Producer.produce("XML");
        DAO dao= daf.create("DB");
        dao.save("saving");

    }
}
