package service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.first.fromNone.commons.CallBackLogger;

@Service
public class CallBackService {
	
	private static JdbcTemplate jdbcTemplate;

	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	    CallBackService.jdbcTemplate = jdbcTemplate;
	}


	    // Main method to process callback data
//		@Async
		public CompletableFuture<String> processCallbackAsync(String requestXml) {
		    try {
		        System.out.println("Processing requestXml: " + requestXml);
		        
		        // Simulate table update or processing
		        String callbackResponse = tableUpdate(requestXml);
		        System.out.println("Processed response: " + callbackResponse);
		        
		        // Wrap the response in a CompletableFuture
		        return CompletableFuture.completedFuture(callbackResponse);
		    } catch (Exception e) {
		        e.printStackTrace(); // Log the exception
		        // Handle or rethrow exception appropriately
		        throw new RuntimeException("Error processing callback", e);
		    }
		}


		@Transactional
		public static String tableUpdate(String requestjson) {
			CallBackLogger callBackLogger = new CallBackLogger();
			callBackLogger.logConsole("INSIDE tableUpdate");
		
			requestjson = requestjson.trim();

			String value  =requestjson;
	
			callBackLogger.logConsole(" value :" + value);
			
			if(value.length() > 3999 )
				value = value.substring(0,3999);
			
			String insertQuery = "INSERT INTO ng_clos_callbacklog (CALLBACKRESP, DATETIME) VALUES (?, SYSDATE)";
			
            try {
            	callBackLogger.logConsole(insertQuery);
            	jdbcTemplate.update(insertQuery, value);

                return "{ \"status\": \"Success\", \"message\": \"Records Updated Successfully.\"}";
			} catch (Exception e) {
				e.printStackTrace();
	            return "{ \"status\": \"Fail\", \"message\": \"Invalid.\", \"Exception\":\"\""+e+"}";
			}


		}		
}