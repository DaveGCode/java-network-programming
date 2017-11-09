// IP malicious check

import java.net.*;

public class SpamCheck {
	public static void main (String []args) {
		String website = ".sbl.spamhaus.org";
		String IP = "www.dit.ie";
		String query;
		
		try {
			query = args[0] + website;
			InetAddress.getByName(query);
			System.out.print( IP + " is spam.");
			
		}//end try
		
		catch (Exception e) {
			System.out.print(IP + " appears legit");
		}//end catch
		
	}//end main
	
	
}//end class