package edu.wctc.shippingreport.impl;

import edu.wctc.shippingreport.Sale;
import edu.wctc.shippingreport.iface.SalesInput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileSalesInput implements SalesInput {
    @Override
    public List<Sale> getSales() {
        File file = new File("src/sales.txt");
        List<Sale> saleList = new ArrayList<>();

        try {
            Scanner reader = new Scanner(file);


            while(reader.hasNext()){
                String line = reader.nextLine();
                String[] salesInfo = line.split(",");
                Sale sale = new Sale();
                sale.setName(salesInfo[0]);
                sale.setCountry(salesInfo[1]);
                sale.setPrice(Double.parseDouble(salesInfo[2]));
                sale.setTax(Double.parseDouble(salesInfo[3]));

                saleList.add(sale);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return saleList;
    }
}
