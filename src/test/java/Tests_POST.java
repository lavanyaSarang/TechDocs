import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import io.restassured.internal.path.json.JSONAssertion;

public class Tests_POST {
	//Testing
	@Test
	public void test1_post() {
	
		Map <String , Object> map=new HashMap <String , Object>();
		map.put("name", "Lavanya");
		map.put("job", "QA");
		System.out.println(map);
		JSON request=new JsonObject(map);
		//request.put()
		
	}

}
