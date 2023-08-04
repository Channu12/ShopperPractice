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
import java.util.LinkedHashMap;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;

@Component("LIC13645_PJT1008_PE_NLP8ac9f5b4-b99c-4a9e-afca-bc16bdd18c85")
public class GetTextUsingMap implements Nlp {
	@InputParams({ @InputParam(name = "element1", type = "org.openqa.selenium.WebElement"),
			@InputParam(name = "element2", type = "org.openqa.selenium.WebElement") })
	@ReturnType(name = "map", type = "java.util.Map")

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
		WebElement ele1 = (WebElement) attributes.get("element1");
		WebElement ele2 = (WebElement) attributes.get("element2");

		// Your program element business logic goes here ...
		Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(1, ele1.getText());
		map.put(2, ele2.getText());

		nlpResponseModel.getAttributes().put("map", map);
		return nlpResponseModel;
	}
}