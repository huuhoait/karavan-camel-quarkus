

import org.apache.camel.AggregationStrategy;
import org.apache.camel.Exchange;



import javax.inject.Named;
import javax.inject.Singleton;

@Singleton
@Named("customAggSplit")
public class MyAggregationStrategySplit implements AggregationStrategy {
    @Override
    public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {

        if (oldExchange == null) {
            return newExchange;
        }

        String oldBody = oldExchange.getIn().getBody(String.class);
        System.out.println("Split oldBody:"+oldBody);
         
        String newBody = newExchange.getIn().getBody(String.class);
         System.out.println("Split new:"+newBody);
        //oldExchange.getIn().setBody(oldBody + ";" + newBody);
        return oldExchange;
    }
}
