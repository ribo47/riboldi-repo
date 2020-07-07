package meteo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server2 {

    int port;
    ServerSocket server=null;
    Socket client=null;
    ExecutorService pool = null;
    int clientcount=0;
    static String[] weather = new String[5];
    
    public static void main(String[] args) throws IOException {
        Server2 serverobj=new Server2(5000);
        for(int i=0; i<5; i++) {
			weather[i]="";
		}
        serverobj.startServer();
    }
    
    Server2(int port){
        this.port=port;
        pool = Executors.newFixedThreadPool(5);
    }

    public void startServer() throws IOException {
        
        server=new ServerSocket(5000);
        System.out.println("Server attivo");
        while(true)
        {
            client=server.accept();
            clientcount++;
            ServerThread runnable= new ServerThread(client,clientcount,this);
            pool.execute(runnable);
        }
        
    }

    private static class ServerThread implements Runnable {
        
        Server2 server=null;
        Socket client=null;
        BufferedReader cin;
        PrintStream cout;
        Scanner sc=new Scanner(System.in);
        int id;
        String s;
        
        ServerThread(Socket client, int count ,Server2 server ) throws IOException {
            
            this.client=client;
            this.server=server;
            this.id=count;
            
            cin=new BufferedReader(new InputStreamReader(client.getInputStream()));
            cout=new PrintStream(client.getOutputStream());
        
        }

        @Override
        public void run() {
            int x=1;
         try{
         while(true){
            s=cin.readLine();
            int t=s.charAt(s.length()-1)-'0';
			int index=t-1;
			
			weather[index]=s;
			System. out.print("Client("+index+") :"+s+"\n");
			String temp = new String();
			int i=0;
			while(i<5) {

				if(i!=index)
					if(!weather[i].equals(""))
						temp=temp.concat(" - "+weather[i]);
				i++;

			}
			int j=0;
			
			temp=temp.replace("1", " Milano");
			temp=temp.replace("2", " Monza");
			temp=temp.replace("3", " Torino");
			temp=temp.replace("4", " Roma");
			temp=temp.replace("5", " Napoli");
			
			
			cout.println(s);

                if (s.equalsIgnoreCase("X")){
                    cout.println("Chiusura connessione");
                    x=0;
                    break;
            	}
			cout.println(s);
		}
		
            
        cin.close();
        client.close();
		cout.close();
        if(x==0) {
			
			System.exit(0);
         }
         } 
         catch(IOException ex){
             System.out.println("Error : "+ex);
         }
            
 		
        }
    }
    
}