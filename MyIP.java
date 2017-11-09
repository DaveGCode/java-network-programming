// Program to return the address of the local host

import java.net.*; //

public class MyIP {
        public static void main (String []args){
        try{
                InetAddress address = InetAddress.getLocalHost();
 
                System.out.print(address);
        }//end try
        catch (Exception e)
        {
                System.out.print(e);
        }//end catch
        }//end main
 
}//end class