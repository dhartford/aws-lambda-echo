import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;

public class EchoStreamHandler implements RequestStreamHandler {
	
  //  @Override
	  public void handleRequest(InputStream inputStream, OutputStream outputStream, Context context)
	            throws IOException {
		  LambdaLogger logger = context.getLogger();
		  
		  
	        int letter;
	        while((letter = inputStream.read()) != -1)
	        {
	            outputStream.write(Character.toUpperCase(letter));
	        }
	    }
    
}
