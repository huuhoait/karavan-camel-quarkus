
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import javax.inject.Named;
import javax.inject.Singleton;

@Singleton
@Named("S3Processor")
public class S3Processor implements Processor {

  public void process(Exchange exchange) throws Exception {
     S3 temp = (S3)exchange.getIn().getBody();
     String varIamge =  exchange.getProperty("imageDataProp",String.class);
     temp.setImageFrontLink(varIamge);
      System.out.println("out************:"+varIamge);
  }
}
