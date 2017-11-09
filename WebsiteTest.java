// Checking to see if a Website is online/offline

import java.net*;

public class WebsiteTest{
	public static void main (String []args){
		try{
			InetAddress address = InetAddress.getByName("www.java2s.com");
			
			boolean reachable ia.isReachable(2000); // looks for it in 2 seconds
			if (reachable)
				System.out.print("Website server is Online");
			else if
				System.out.print("Website is Offline");
		}//end try{
			
		catch(Exception e)
		{
			System.out.print(e)
		}// end catch
	}//end main
}//end class