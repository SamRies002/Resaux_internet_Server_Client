package Server;
import java.io.*;
import java.net.*;


public class TCPServerMain {

	    public static void main(String args[]) throws Exception {
	    	
	    	//String clientResponse;
	    	//String clientResponse2;
	    	int portServer = 2405;
	    	ServerSocket startSocket = new ServerSocket(portServer);
	    	Socket clientSocket = null;
	    	DataForTheServer dataServer = new DataForTheServer();
	    	
	    	try{
	    		System.out.println("server is active...");
	    		
	    		while(true){
	    			clientSocket = startSocket.accept();
	    			//BufferedReader clientInput = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
	    			//BufferedWriter output = new BufferedWriter (new OutputStreamWriter(clientSocket.getOutputStream()));
	    			//clientResponse = clientInput.readLine();
	    			//System.out.println("Recived " + clientResponse);
	    			//output.write(clientResponse);
	    			//System.out.println("test");
	    			Connection clientConnection = new Connection(clientSocket);
	    			
	    		}
	    		
	    	}catch(IOException e){
	    		System.out.println("Listen : " + e.getMessage());
	    	}
	    	finally {
	    	
	    			clientSocket.close();
	    			startSocket.close();
	    	
	    			}

	    		
	    }
}
	    	/**
	    	 //Configure the port (2405)of the server
            ServerSocket welcomeSocket = null;
            Socket connectionSocket = null;
	    //	try{
	    	//initialize
	        int firsttime = 1;
	        int serverPort = 2405;
	        System.out.println("The server is running..");
           
	        //activate server (auto)
	        while (true) {
	        	
	        	
	        	//initialze the server
	            String clientSentence;
	            String capitalizedSentence="";
	            
	            //Configure the port (2405)of the server
	            welcomeSocket = new ServerSocket(serverPort);
	            connectionSocket = welcomeSocket.accept();
	            
	            //Takes the input (request) from the client
	            BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
	            
	            //This is send back as a response from the client
	            DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
	            
	            //initizialise the String with the client input
	            clientSentence = inFromClient.readLine();
	            //System.out.println(clientSentence);
	            if (clientSentence.equals("SET")) {
	                outToClient.writeBytes("connection is ");
	                System.out.println("Set Method chosen");
	                welcomeSocket.close();
	                outToClient.writeBytes(capitalizedSentence);
	            }
	            
	             else if with the GET function 
	            
	            //initizialise the String with the client input
	            capitalizedSentence = clientSentence.toUpperCase() + "\n";
	            if(!clientSentence.equals("quit"))
	            outToClient.writeBytes(capitalizedSentence+"enter the message or command: ");
	            System.out.println("passed");
	            outToClient.writeBytes("enter the message or command: ");
	            welcomeSocket.close();
	            System.out.println("connection terminated"); 
	            }
	    	
	            catch(IOException e) {
	        	System.err.println("Listen: " + e.getMessage()); 
	        } 
	    	
	    
	}

} **/
