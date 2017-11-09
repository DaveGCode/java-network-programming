// Webpage downloader
import java.net.*;
import java.io.*;
import java.util.Scanner; // Used for user input

public class webpage{
	public static void main(String[] args){
		try{
			Scanner user_input = new Scanner(System.in);
			
			System.out.println("Enter a webpage to download: \n");
			String webpage = user_input.nextLine(); // Takes the user's input
			
			URL u = new URL(webpage); // takes the user's webpage makes it into a URL var
			InputStream in = u.openStream(); // Streams the webpage
			
			int i;
			while((i=in.read())!=-1){
				System.out.write(i); // Prits out the webpage
			}// end while
			in.close(); // closes webpage stream
		} // end try
		catch(Exception e){
			System.out.print(e);
		} // end catch
	} // end main
} // end class