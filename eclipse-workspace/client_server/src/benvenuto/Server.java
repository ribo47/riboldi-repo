package benvenuto;

import java.net.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.*;

public class Server {
private static int visitor=0;
public static void main(String[] argv){
	try{
		ServerSocket acceptSocket = new ServerSocket(5200);
		while(true){
			Socket clientSock=acceptSocket.accept(); 
			InputStream s = clientSock.getInputStream();
			BufferedReader input = new BufferedReader(new InputStreamReader(s));
			String line;
			while ((line = input.readLine()) != null) {
				visitor++;
				DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
				Date date = new Date();
				System.out.println("Ciao "+line+"\nVisitatore numero "+visitor);
				System.out.println(dateFormat.format(date));

			}
			
			Socket sendSock = new Socket("127.0.0.1",5200);

			PrintWriter out = new PrintWriter(sendSock.getOutputStream(),true);    
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader stdIn = new BufferedReader(isr);
			String userInput;
			
			while ((userInput = input.readLine()) != null) {
				System.out.println("1");
				out.println(userInput);
			}
			
			input.close();  
			s.close();        
			stdIn.close();   
			out.close();
			clientSock.close();
			
		}
	}catch(IOException e){
		System.out.println("Server"); 

		System.out.println(e.getMessage()); 
	}

}}
