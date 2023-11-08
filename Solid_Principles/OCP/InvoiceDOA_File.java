package Solid_Principles.OCP;

import Solid_Principles.SRP.invoice;

public class InvoiceDOA_File implements InvoiceDOA_OCP_Inteface{

    @Override
    public void save(invoice Invoice) {
        //save data
    }
}
