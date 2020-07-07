package meteo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Client3 {
    
    public static void main(String args[]) throws Exception
	{
		Socket sk=new Socket("127.0.0.1",5000);
		BufferedReader sin=new BufferedReader(new InputStreamReader(sk.getInputStream()));
		PrintStream sout=new PrintStream(sk.getOutputStream());
		BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
		String s;
		System.out.println("INSERIRE CONDIZIONI METEO (Sole, Pioggia o Nuvoloso. X per terminare)");

		while (true)
		{
			System.out.print("Client 3 - Torino: ");
			s=stdin.readLine().concat("3");
            
			if (s.equalsIgnoreCase("X")){
            	break;
            }
			else
				sout.println(s);

             
			s=sin.readLine();
			System.out.print("Server : "+s+"\n");
  			
		}
		 sk.close();
		 sin.close();
		 sout.close();
 		stdin.close();
	}
    
}