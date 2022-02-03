package edu.wctc.shippingreport.impl;

import edu.wctc.shippingreport.Sale;
import edu.wctc.shippingreport.iface.SalesInput;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ConsoleInput implements SalesInput {
    @Override
    public List<Sale> getSales() {
        List<Sale> saleList = new ArrayList<Sale>();
        Scanner kb = new Scanner(System.in);
        String input = "y";

        while(input.equalsIgnoreCase("y")){
            Sale runSale = new Sale();

            System.out.println("Enter Country");
            runSale.setCountry(kb.nextLine());
            System.out.println("Enter Name");
            runSale.setName(kb.nextLine());
            System.out.println("Enter Amount");
            runSale.setPrice(Double.parseDouble(kb.nextLine()));
            System.out.println("Enter Taxes");
            runSale.setTax(Double.parseDouble(kb.nextLine()));

            saleList.add(runSale);

            System.out.println("Continue?");
            input = kb.nextLine();
        }

        return saleList;
    }
}
