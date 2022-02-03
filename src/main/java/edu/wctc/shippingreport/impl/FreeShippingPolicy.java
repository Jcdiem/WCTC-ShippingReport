package edu.wctc.shippingreport.impl;

import edu.wctc.shippingreport.Sale;
import edu.wctc.shippingreport.iface.ShippingPolicy;

public class FreeShippingPolicy implements ShippingPolicy {

    @Override
    public void applyShipping(Sale sale) {
        sale.setShipping(0);
    }
}
