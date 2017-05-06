package Server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Connection extends Thread{ 

	BufferedReader input;
	BufferedWriter output;
	Socket clientSocket;
	
	public Connection (Socket client){
		try{
		clientSocket = client;
		input = new BufferedReader (new InputStreamReader(clientSocket.getInputStream()));
		output = new BufferedWriter (new OutputStreamWriter(clientSocket.getOutputStream()));
		this.start();
		}catch(IOException e){
			System.err.println("Connecton: " + e.getMessage());
		}
	}
	
	public void run() {
		
	try{
		//initialize the buffer input and output
		BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		BufferedWriter output = new BufferedWriter (new OutputStreamWriter(clientSocket.getOutputStream()));
		
		String clientInput = input.readLine();
		if (clientInput.equals("SET") ){
			
			//SET methode
			output.write("SET chosen");
			
		}
		
		if (clientInput.equals("GET")) {
			
			//GET methode
			output.write("GET chosen");
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
