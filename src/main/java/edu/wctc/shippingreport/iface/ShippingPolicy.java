package edu.wctc.shippingreport.iface;

import edu.wctc.shippingreport.Sale;

public interface ShippingPolicy {
    void applyShipping(Sale sale);
}
