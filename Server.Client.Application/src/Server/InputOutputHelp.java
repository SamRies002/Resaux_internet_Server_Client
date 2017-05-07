package Server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class InputOutputHelp {
	public static String readFromInput(BufferedReader input) throws IOException{
		System.out.println("Input");
		return input.readLine();
	}
	
	public static void writeToOutput(BufferedWriter output, String message) throws IOException{
		output.write(message + "\n");
		output.flush();
}
}
