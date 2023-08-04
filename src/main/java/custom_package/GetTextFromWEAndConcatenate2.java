package custom_package;

import com.tyss.optimize.nlp.util.Nlp;
import com.tyss.optimize.nlp.util.NlpException;
import com.tyss.optimize.nlp.util.NlpRequestModel;
import com.tyss.optimize.nlp.util.NlpResponseModel;
import com.tyss.optimize.nlp.util.annotation.InputParam;
import com.tyss.optimize.nlp.util.annotation.InputParams;
import com.tyss.optimize.nlp.util.annotation.ReturnType;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;

@Component("LIC13645_PJT1008_PE_NLP3f032c98-3c49-421f-8050-c79c77a520aa")
public class GetTextFromWEAndConcatenate2 implements Nlp {
    @InputParams({@InputParam(name = "elementName", type = "java.lang.String"), @InputParam(name = "elementType", type = "java.lang.String"), @InputParam(name = "element", type = "org.openqa.selenium.WebElement")})
    @ReturnType(name = "string", type = "java.lang.String")

      @Override
      public List<String> getTestParameters() throws NlpException {
        List<String> params = new ArrayList<>();
        return params;
      }
    
      @Override
      public StringBuilder getTestCode() throws NlpException {
        StringBuilder sb = new StringBuilder();
        return sb;
      }
      @Override
      public NlpResponseModel execute(NlpRequestModel nlpRequestModel) throws NlpException {
        
          NlpResponseModel nlpResponseModel = new NlpResponseModel();
          Map<String, Object> attributes = nlpRequestModel.getAttributes();
          WebElement ele1 = (WebElement) attributes.get("ele1");
          WebElement ele2 = (WebElement) attributes.get("ele2");

          // Your program element business logic goes here ...
          String string = ele1.getText()+ele2.getText();
          nlpResponseModel.getAttributes().put("string", string);
          return nlpResponseModel;
      }
  } 