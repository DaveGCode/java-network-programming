// Q. Write a program to find characteristics of IP.
//to run enter java IPcharacteristics 127.0.0.1
import java.net.*;

public class IPchar{
	public static void main (String[] args){
		try{
			InetAddress address = InetAddress.getByName(args[0]);
			if(address.isAnyLocalAddress()){
				System.out.print("It is local address\n");
			}
			else if(address.isLoopbackAddress()){
				System.out.print("It is a loop back address");
			}
			else if(address.isMulticastAddress()){
				System.out.print("It is a multicast address");
			}
			else{
				System.out.print("It is a unicast address");
			}
		}
		catch(Exception e){
			System.out.print(e);
		}
	}
}
