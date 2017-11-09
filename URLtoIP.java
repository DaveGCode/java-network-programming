// Program to convert provided URL into IP format
// Returns: www.123.ie

import java.net.*;

public class URLtoIP {
    public static void main (String[] args){
        try {
            InetAddress address = InetAddress.getByName(args[0]);
            // Can put www. where args[0]
            System.out.print(address);
        }//end try
        catch (Exception e) {
            System.out.print(e);
        }
    }
}