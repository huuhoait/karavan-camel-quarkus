

import org.apache.camel.AggregationStrategy;
import org.apache.camel.Exchange;


import javax.inject.Named;
import javax.inject.Singleton;

@Singleton
@Named("customAgg")
public class MyAggregationStrategy2 implements AggregationStrategy {
    @Override
    public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {

        if (oldExchange == null) {
            return newExchange;
        }

        String oldBody = oldExchange.getIn().getBody(String.class);
        System.out.println("This is a baeldung article");
        String newBody = newExchange.getIn().getBody(String.class);
        oldExchange.getIn().setBody(oldBody + ";" + newBody);
        return oldExchange;
    }
}
