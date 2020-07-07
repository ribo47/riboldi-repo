package benvenuto;

import java.net.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.*;

public class Client {
	
	public static void main(String[] argv) {
		try{
			
			Socket sock = new Socket("127.0.0.1",5200);

			while(true) {

				PrintWriter out = new PrintWriter(sock.getOutputStream(),true);    
				InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader stdIn = new BufferedReader(isr);
				String userInput;
				
				while ((userInput = stdIn.readLine()) != null) {
					System.out.println("1");
					out.println(userInput);
				}
								
				ServerSocket acceptSocket = new ServerSocket(5200);
				sock=acceptSocket.accept(); 
				InputStream s = sock.getInputStream();
				BufferedReader input = new BufferedReader(new InputStreamReader(s));
				String line;
				while ((line = input.readLine()) != null) {
					
					System.out.println("Client: "+line);

				}
				
				stdIn.close();   
				out.close();
				input.close();  
				s.close();        
				sock.close();
				
			}
	    }catch(IOException e){
			System.out.println("Client"); 

	    	System.out.println(e.getMessage());
	    }
	}
}
