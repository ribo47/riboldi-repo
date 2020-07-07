package chat;

import java.net.*;
import java.io.*;



public class Server {
    
    public static void main(String[]args) throws IOException
    {
        Socket connessione = null;
        int porta = 5200;
        ServerSocket sSocket = new ServerSocket(porta);

        InputStreamReader in, input;
        BufferedReader sIn, t;
        OutputStream out;
        PrintWriter sOut;
        String msgSend, msgRec;
        try
        {
            System.out.println("Server attivo, in attesa");
            while(true)
            {
                connessione = sSocket.accept();
                out = connessione.getOutputStream();
                sOut = new PrintWriter(out);
                in = new InputStreamReader(connessione.getInputStream());
                sIn = new BufferedReader(in);
                input = new InputStreamReader(System.in);
                t = new BufferedReader(input);
                System.out.println("Scrivi messaggio.");
                while(true)
                {
                    msgRec = sIn.readLine();
                    
                    System.out.println("(Client)" + msgRec);
                    msgSend = t.readLine();
                    sOut.println(msgSend);
                    sOut.flush();                    
                }
            }
        }
        catch (IOException e)
        {
	    	System.out.println(e.getMessage());
        }
        connessione.close();

    }
}