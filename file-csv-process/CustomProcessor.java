package org.camel.karavan.demo.postman;

import org.apache.camel.BindToRegistry;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.camel.karavan.demo.postman.Student;

import java.util.LinkedHashMap;

//@BindToRegistry("myBean")
public class CustomProcessor implements Processor {

    public void process(Exchange exchange) throws Exception {
        //System.out.print(   exchange.getIn().getClass());

        Student student = (Student)exchange.getIn().getBody();
       // System.out.println(  "*********************************:"+ student.getFirstName());
        if(student.getId()==107){
            int t = 1/0;
        }
        //exchange.getIn().setBody("###########curentId:"+ student.getFirstName());

    }
}