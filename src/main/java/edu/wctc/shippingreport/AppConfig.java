package edu.wctc.shippingreport;

import edu.wctc.shippingreport.iface.SalesInput;
import edu.wctc.shippingreport.iface.SalesReport;
import edu.wctc.shippingreport.iface.ShippingPolicy;
import edu.wctc.shippingreport.impl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("edu.wctc.shippingreport")
public class AppConfig {

    @Bean
    public ShippingPolicy shippingPolicy(){
//        return new FreeShippingPolicy();
        return new FlatShippingPolicy();
    }

    @Bean
    public SalesInput salesInput(){
//        return new ConsoleInput();
        return new FileSalesInput();
    }

    @Bean
    public SalesReport salesReport(){
//        return new DetailedSalesReport();
        return new SummarySalesReport();
    }

}
