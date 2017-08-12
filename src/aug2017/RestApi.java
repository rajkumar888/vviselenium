package aug2017;

import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


public class RestApi {

	public static void main(String[] args) throws ParseException, IOException {
		
		String str="http://eupathdb.org/webservices/GeneQuestions/GenesByMolecularWeight.wadl";
		
		 // Create request object 
		 HttpUriRequest request = new HttpGet(str); 
		 
		 // send response or execute query 
		 HttpResponse httpResponse = HttpClientBuilder.create().build().execute(request); 
		 
		 // Convert the response to a String format 
		 
		 String result = EntityUtils.toString(httpResponse.getEntity()); 
		 
		 // Convert the result as a String to a JSON object 
		 JsonObject jo = (JsonObject) new JsonParser().parse(result); 
		 
		 // Convert the inner result as a String to a JSON object 
		 JsonObject joData = (JsonObject) jo.get("data"); 
		 

		 System.out.println(httpResponse+"\n\n\n"); 
		 System.out.println(result+"\n\n"); 
			
		 
		 System.out.println(jo); 
		 System.out.println(jo.get("status")); 
		 System.out.println(joData.get("sid"));

	}

}
