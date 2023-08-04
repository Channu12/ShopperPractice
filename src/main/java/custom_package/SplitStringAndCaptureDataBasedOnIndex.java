package custom_package;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Component;
import com.tyss.optimize.nlp.util.Nlp;
import com.tyss.optimize.nlp.util.NlpException;
import com.tyss.optimize.nlp.util.NlpRequestModel;
import com.tyss.optimize.nlp.util.NlpResponseModel;
import com.tyss.optimize.nlp.util.annotation.InputParam;
import com.tyss.optimize.nlp.util.annotation.InputParams;
import com.tyss.optimize.nlp.util.annotation.ReturnType;

@Component("LIC13645_PJT1008_PE_NLPf11d2a1d-91ef-46ea-846d-44d3a0232ea2")
public class SplitStringAndCaptureDataBasedOnIndex implements Nlp {
	@InputParams({ @InputParam(name = "string", type = "java.lang.String"),
			@InputParam(name = "regex", type = "java.lang.String"),
			@InputParam(name = "index", type = "java.lang.Integer") })
	@ReturnType(name = "str", type = "java.lang.String")

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
		String string = (String) attributes.get("string");
		String regex = (String) attributes.get("regex");
		Integer index = (Integer) attributes.get("index");

		// Your program element business logic goes here ...
		String str = string.split(regex)[index].trim();
		nlpResponseModel.getAttributes().put("str", str);
		return nlpResponseModel;
	}
}