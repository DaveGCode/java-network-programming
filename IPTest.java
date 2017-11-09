// Program to check whether the provided address (URL/IP) is an IPv4 or IPv6

import java.net.*; //
 
public class IPTest {
        public static void main (String []args){
        try{
                InetAddress address = InetAddress.getByName(args[0]);
// Can put address (www.) in where (args[0]) ^^^^^ is
                byte [] array = address.getAddress();
                if (array.length==4)
                        System.out.print("IPv4 Address");
                else if (array.length==16)
                        System.out.print("IPv6 Address");
        }//end try
        catch (Exception e)
        {
                System.out.print(e);
        }//end catch
        }//end main
 
}//end class