package Client;
import java.io.*;
import java.net.*;
import java.util.Scanner;


public class TCPCLientMain {

	public static void main(String[] args) throws Exception{
	
		Socket clientSocket = null;
		String inputClient;
		int input1;
		boolean loop = true;
		try{
			
			while(true){
			 int serverPort;
			 serverPort = 2405;
			 while(loop){
			
			 System.out.println("Enter the port (2405, 2406, 2407, 2408, 2409, 2410, 2411, 2412 )");
			 Scanner portScan = new Scanner(System.in);
			 input1 = portScan.nextInt();
			 if(input1 > 2404 && input1 < 2413){
			 serverPort = input1;
			 loop = false;
			 }else{
				 System.err.println("Can't find the specific server..");
				
			 }
			 }
			 
			 BufferedReader input2 = new BufferedReader(new InputStreamReader(System.in));
			 clientSocket = new Socket("localhost", serverPort);
			 DataOutputStream outServer = new DataOutputStream(clientSocket.getOutputStream());
			 BufferedWriter output = new BufferedWriter (new OutputStreamWriter(clientSocket.getOutputStream()));
			 BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			 System.out.println("Enter a command: ");
			 inputClient = input2.readLine();
			 output.write(inputClient);
			 System.out.println("Server Response: " + inputClient);
			 //System.out.println(input);
			 //System.out.println(output);
			 //clientSocket.close();
			 //while((inputClient = input.readLine()) != null){
			//	 System.out.println(inputClient);
			// }
			
			// System.out.println("Line Read: ");
			//output.write(inputClient);
			 
			// System.out.println("Entered command :" + in);
			 
			}
		}catch(IOException e){
			System.err.println("ClientMain: " + e.getMessage());
		}
		
	}
}
		