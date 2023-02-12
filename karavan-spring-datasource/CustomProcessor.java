package org.demo.javakaravan;

import org.apache.camel.BindToRegistry;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import java.util.LinkedHashMap;

@BindToRegistry("myBean")
public class CustomProcessor implements Processor {

    public void process(Exchange exchange) throws Exception {
        //System.out.print(   exchange.getIn().getClass());

        java.util.LinkedHashMap maplocal = (LinkedHashMap)exchange.getIn().getBody();
        exchange.getIn().setBody("###########curentId:"+ maplocal.get("id"));

    }
}