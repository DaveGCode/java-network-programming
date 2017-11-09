 
import java.net.*; //
 
public class ReverseIP {
        public static void main (String []args){
        try{
                InetAddress address = InetAddress.getByName(args[0]);

                System.out.print(address.getCanonicalHostName());
        }//end try
        catch (Exception e)
        {
                System.out.print(e);
        }//end catch
        }//end main
 
}//end class