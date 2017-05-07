package Server;
import java.io.*;
import java.net.*;


public class TCPServerMain {

	    public static void main(String args[]) throws Exception {
	    	
	    	
	    	int portServer1 = 2405;
	    	int portServer2 = 2406;
	    	int portServer3 = 2407;
	    	int portServer4 = 2408;
	    	int portServer5 = 2409;
	    	int portServer6 = 2410;
	    	int portServer7 = 2411;
	    	int portServer8 = 2412;
	    	
	    	ServerSocket startSocket1 = new ServerSocket(portServer1);
	    	ServerSocket startSocket2 = new ServerSocket(portServer2);
	    	ServerSocket startSocket3 = new ServerSocket(portServer3);
	    	ServerSocket startSocket4 = new ServerSocket(portServer4);
	    	ServerSocket startSocket5 = new ServerSocket(portServer5);
	    	ServerSocket startSocket6 = new ServerSocket(portServer6);
	    	ServerSocket startSocket7 = new ServerSocket(portServer7);
	    	ServerSocket startSocket8 = new ServerSocket(portServer8);
	    	
	    	Socket clientSocket1 = null;
	    	Socket clientSocket2 = null;
	    	Socket clientSocket3 = null;
	    	Socket clientSocket4 = null;
	    	Socket clientSocket5 = null;
	    	Socket clientSocket6 = null;
	    	Socket clientSocket7 = null;
	    	Socket clientSocket8 = null;
	    	
	    	//DataForTheServer dataServer = new DataForTheServer();
	    
	    	
	    	try{
	    		System.out.println("server 1 is active...");
	    		System.out.println("server 2 is active...");
	    		System.out.println("server 3 is active...");
	    		System.out.println("server 4 is active...");
	    		System.out.println("server 5 is active...");
	    		System.out.println("server 6 is active...");
	    		System.out.println("server 7 is active...");
	    		System.out.println("server 8 is active...");
	    		while(true){
	    			
	    			clientSocket1 = startSocket1.accept();
	    			clientSocket2 = startSocket2.accept();
	    			clientSocket3 = startSocket3.accept();
	    			clientSocket4 = startSocket4.accept();
	    			clientSocket5 = startSocket5.accept();
	    			clientSocket6 = startSocket6.accept();
	    			clientSocket7 = startSocket7.accept();
	    			clientSocket8 = startSocket8.accept();
	    			
	    			Connection clientConnection1 = new Connection(clientSocket1);
	    			Connection clientConnection2 = new Connection(clientSocket2);
	    			Connection clientConnection3 = new Connection(clientSocket3);
	    			Connection clientConnection4 = new Connection(clientSocket4);
	    			Connection clientConnection5 = new Connection(clientSocket5);
	    			Connection clientConnection6 = new Connection(clientSocket6);
	    			Connection clientConnection7 = new Connection(clientSocket7);
	    			Connection clientConnection8 = new Connection(clientSocket8);
	    			
	    		}
	    		
	    	}catch(IOException e){
	    		System.out.println("Listen : " + e.getMessage());
	    	}
	    	finally {
	    	
	    			clientSocket1.close();
	    			startSocket1.close();
	    			clientSocket2.close();
	    			startSocket2.close();
	    			clientSocket3.close();
	    			startSocket3.close();
	    			clientSocket4.close();
	    			startSocket4.close();
	    			clientSocket5.close();
	    			startSocket5.close();
	    			clientSocket6.close();
	    			startSocket6.close();
	    			clientSocket7.close();
	    			startSocket7.close();
	    			clientSocket8.close();
	    			startSocket8.close();
	    	
	    			}
	    	

	    		
	    }
}