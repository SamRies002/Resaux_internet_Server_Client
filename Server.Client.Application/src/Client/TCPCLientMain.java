package Client;
import java.io.*;
import java.net.*;


public class TCPCLientMain {

	public static void main(String[] args) throws Exception{
	
		Socket clientSocket = null;
		String inputClient = null;
		
		try{
			String in;
			
			 int serverPort = 2405;
			 clientSocket = new Socket("localhost", 2405);
			 BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			 BufferedWriter output = new BufferedWriter (new OutputStreamWriter(clientSocket.getOutputStream()));
			 
			 System.out.println("Enter a command: ");
			 inputClient = input.readLine();
			 
			 while((inputClient = input.readLine()) != null){
				 System.out.println(inputClient);
			 }
			
			// System.out.println("Line Read: ");
			output.write(inputClient);
			 
			// System.out.println("Entered command :" + in);
			 
			 
		}catch(IOException e){
			System.err.println("ClientMain: " + e.getMessage());
		}
	}
}
			 /**
		
		        String sentence;
		        String modifiedSentence;
		        
		        System.out.println("Enter a client message: ");
		        //configure the scanner
		        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
		        
		        //Scanner to read the ip and port.
		        Socket clientSocket = new Socket("127.0.0.1", 2405);
		        
		        //Configure the Response for the server
		        DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
		        
		        //What the client sends to the server
		        BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		        
		        //Configure the string "sentence"
		        sentence = inFromUser.readLine();
		        
		        //The response of the server
		        outToServer.writeBytes(sentence + "\n");
		        
		        //2nd sentence
		        modifiedSentence = inFromServer.readLine();
		        
		        //Server gives out the 2nd sentence
		        System.out.println("FROM SERVER:" + modifiedSentence);
		        
		        //Close connection to server
		        clientSocket.close();
		    }
		

	} **/


