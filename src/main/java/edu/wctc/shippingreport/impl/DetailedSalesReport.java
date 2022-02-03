package edu.wctc.shippingreport.impl;

import edu.wctc.shippingreport.Sale;
import edu.wctc.shippingreport.iface.SalesReport;

import java.util.List;

public class DetailedSalesReport implements SalesReport {
    @Override
    public void generateReport(List<Sale> salesList) {
        System.out.println("SALES DETAIL REPORT");
        System.out.println("Customer - Country - Amount - Tax - Shipping");
        for (Sale sale : salesList){
            String out = sale.getName();
            out += " - " + sale.getCountry();
            out += " - " + sale.getPrice();
            out += " - " + sale.getTax();
            out += " - " + sale.getShipping();
            System.out.println(out);
        }
        System.out.println("\n Reporting Complete!");
    }
}
