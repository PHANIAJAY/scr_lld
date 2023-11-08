package Solid_Principles.SRP;

public class invoice {
   private int quantity;
   private Marker marker;

   public invoice(int quantity,Marker marker){
       this.marker=marker;
       this.quantity=quantity;
   }

//   public int totalcalculation(){
//       int price=((marker.price)*(this.quantity));
//       return price;
//   }
//
//   public void printInvoice()
//    {
//
//    }
//
//    public void savetoDB()
//    {
//
//    }
    //For all the function we have implemented the separate class.
    /*
    wht if we want change the class like
    1.change the GST added for calculation
    2.change the savetoDB data
    3.change the printinvoice in pdf or word.

    hence to 3 reasons so it doesnt makes sence violates SRP .
     */
}
