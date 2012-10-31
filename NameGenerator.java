import java.io.*;
import java.util.*;

public class NameGenerator{

	public static void main(String[] args){
		Name nickname = new Name();
		int userGuess = getUserInput("How many letters do you want in your nickname?");
		nickname.generate(userGuess);

	}
		
	public static int getUserInput(String prompt) {
		int inputLine = 0;
		System.out.print(prompt + "  ");
		
		InputStreamReader istream = new InputStreamReader(System.in);
		BufferedReader bufRead = new BufferedReader(istream);
		
		try{
			inputLine = Integer.parseInt(bufRead.readLine());
		}
		catch (IOException err) {
			System.out.println("Error reading line");
		}
		catch(NumberFormatException err){
			System.out.println("Please enter a number");
		}
		return inputLine;
  }
	
}