package restapi;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import com.jayway.restassured.*;
import com.jayway.restassured.response.Response;



public class WheatherGetRequestApi
{


		@Test()
		public void test001() throws ParseException, IOException
		{
		String str="http://eupathdb.org/webservices/GeneQuestions/GenesByMolecularWeight.wadl";
		
		 // Create request object 
		 HttpUriRequest request = new HttpGet(str); 
		 
		 // send response or execute query 
		 HttpResponse httpResponse = HttpClientBuilder.create().build().execute(request); 
		 
		 // Convert the response to a String format 
		 
		 String result = EntityUtils.toString(httpResponse.getEntity()); 
		 	
		 System.out.println(httpResponse+"\n\n\n"); 
		 System.out.println(result+"\n\n"); 
		
		}
		
		
		
		@Test
		public void test002() 
		{
Response respone =RestAssured.when()
					.get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b1b15e88fa797225412429c1c50c122a1");
		
		System.out.println(respone.getStatusCode());
		//System.out.println(respone.asString());
			
		System.out.println(respone.contentType());
				
		//System.out.println(respone.getContentType());
		
		//System.out.println(respone.print());
		
		//System.out.println(respone.statusLine());
		
		//System.out.println(respone.getHeaders());
		
		
		
		}
}
