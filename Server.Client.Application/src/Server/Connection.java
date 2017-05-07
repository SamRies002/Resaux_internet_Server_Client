package Server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.HashMap;

public class Connection extends Thread{ 

	BufferedReader input;
	BufferedWriter output;
	Socket clientSocket;
	
	//NEW FOR LATER GET HASHMAP MUST DO IT INTO THE CONSTRUCTOR
	DataForTheServer dataServer;
	
	public Connection (Socket client){
		try{
		this.clientSocket = client;
		this.input = new BufferedReader (new InputStreamReader(clientSocket.getInputStream()));
		this.output = new BufferedWriter (new OutputStreamWriter(clientSocket.getOutputStream()));
		
		this.start();
		}catch(IOException e){
			System.err.println("Connecton: " + e.getMessage());
		}
	}
	
	public void run() {
		//System.out.println("Connected1");

	try{
		//initialize the buffer input and output
		BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		BufferedWriter output = new BufferedWriter (new OutputStreamWriter(clientSocket.getOutputStream()));
		System.out.println("Connected2");
		// FEHLER stop hier 
		// beim start vom server geht es schon hier hin und führt die InputOutputHelp.readFromInput aus.
		String clientInput = input.readLine();
		System.out.println("Received: " + clientInput);
		if (clientInput.equals("S")|| clientInput.equals("SET") ){
			
			//SET methode
			output.write("SET chosen");
			System.out.println("SET");
			
		}else if (clientInput.equals("G")|| clientInput.equals("GET")) {
			
			//GET methode
			output.write("GET chosen");
			System.out.println("GET");
		}else{
			System.out.println("Write SET or GET");
		}
		
	}catch(IOException e){
		System.err.println("Connecton: " + e.getMessage());
	}
	finally {
		try{
			clientSocket.close();
		}catch(IOException e){
			System.err.println("Connecton: " + e.getMessage());
			}

		}
	}
}
