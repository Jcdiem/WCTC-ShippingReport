package edu.wctc.shippingreport;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ShippingReportApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

//        ((DiceGame)context.getBean("diceGame")).play();
        ((ReportProcessor)context.getBean("reportProcessor")).processReport();
    }

}
