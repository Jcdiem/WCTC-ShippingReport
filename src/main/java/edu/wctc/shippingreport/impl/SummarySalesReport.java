package edu.wctc.shippingreport.impl;

import edu.wctc.shippingreport.Sale;
import edu.wctc.shippingreport.iface.SalesReport;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SummarySalesReport implements SalesReport {
    @Override
    public void generateReport(List<Sale> salesList) {
        System.out.println("SUMMARY SALES REPORT");
        List<String> countryList = new ArrayList<>();
        List<List<String>> dataSum = new ArrayList<>();

        for(Sale sale : salesList){
            String curCountry = sale.getCountry();
            boolean countryExists = false;
            for (String country : countryList){
                if(curCountry.equalsIgnoreCase(country)) countryExists = true;
            }
            if (!countryExists) countryList.add(curCountry);
        }

        for(String country : countryList){
            int totalAmount = 0;
            int totalShipping = 0;
            int totalTax = 0;

            for(Sale sale : salesList){
                if(country.equalsIgnoreCase(sale.getCountry())) {
                    totalAmount += sale.getTotal();
                    totalShipping += sale.getShipping();
                    totalTax += sale.getTax();
                }
            }

            dataSum.add(new ArrayList<String>(Arrays.asList(country,Integer.toString(totalAmount),Integer.toString(totalTax),Integer.toString(totalTax))));
        }

        System.out.println("Country - Amount - Tax - Shipping");
        for(List<String> data : dataSum){
            System.out.println(data.get(0) + " - " + data.get(1) + " - " + data.get(2) + " - " + data.get(3));
        }
        System.out.println("\n FINISHED REPORTING");

    }
}
