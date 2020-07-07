package chat;

import java.net.*;
import java.io.*;

public class Client {
    
    public static void main(String[]args) throws UnknownHostException, IOException 
    {
        String server = "localhost";
        int porta = 5200;
        Socket connessione = new Socket(server, porta);

        InputStreamReader in, input;
        BufferedReader sIn, t;
        OutputStream out;
        PrintWriter sOut;
        
        String msgSend, msgRec;
       
        try
        {
            in = new InputStreamReader(connessione.getInputStream());
            sIn = new BufferedReader(in);
            out = connessione.getOutputStream();
            sOut = new PrintWriter(out);
            input = new InputStreamReader(System.in);
            t = new BufferedReader(input);
            System.out.println("Scrivi messaggio: ");
            while(true)
            {
                msgSend = t.readLine();   
                sOut.println(msgSend);
                sOut.flush();
                msgRec = sIn.readLine();
                System.out.println("(Server)" + msgRec);
            }
            
        }
        catch (IOException e)
        {
	    	System.out.println(e.getMessage());
        }
        
        connessione.close();
    }
}