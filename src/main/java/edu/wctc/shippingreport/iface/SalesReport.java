package edu.wctc.shippingreport.iface;

import edu.wctc.shippingreport.Sale;

import java.util.List;

public interface SalesReport {
    void generateReport(List<Sale> salesList);
}