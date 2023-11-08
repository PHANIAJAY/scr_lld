package Solid_Principles.OCP;

import Solid_Principles.SRP.invoice;

public class InvoiceDOA_OCP {
    invoice Invoice;
    public InvoiceDOA_OCP(invoice Invoice){
        this.Invoice=Invoice;

    }

    public void saveToDb(){
        //save into DB
    }

//
//    public void saveToFile(){
//        //save into DB
//    }
// say wanted to add the savetofile along with savetodb then doin modification in same cxlass is wrong

}
