package edu.wctc.shippingreport;

import edu.wctc.shippingreport.iface.SalesInput;
import edu.wctc.shippingreport.iface.SalesReport;
import edu.wctc.shippingreport.iface.ShippingPolicy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ReportProcessor {
    private ShippingPolicy shipping;
    private SalesInput input;
    private SalesReport report;

    @Autowired
    public ReportProcessor(SalesInput input, SalesReport report, ShippingPolicy shipping){
        this.input = input;
        this.report = report;
        this.shipping = shipping;
    }

    public void processReport(){

        //Get Report
        List<Sale> data = input.getSales();
        //Apply shipping
        for (Sale sale : data){
            shipping.applyShipping(sale);
        }
        //Generate report
        report.generateReport(data);
    }
}
