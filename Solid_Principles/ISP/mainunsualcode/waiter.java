package Solid_Principles.ISP.mainunsualcode;

import Solid_Principles.ISP.mainunsualcode.restaurantemployee_Int;

public class waiter implements restaurantemployee_Int {
    @Override
    public void washdish() {
        // waiter not responsible for washing dish ...
    }

    @Override
    public void servecustomers() {

    }

    @Override
    public void cookFood() {
        // waiter not responsible for cooking food ...
    }
}
