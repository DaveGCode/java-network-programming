//Program: UDP server used to received data from a local UDP client

import java.io.*;
import java.net.*;


public class udpserver {
    public static void main (String[] args){
        try {
            DatagramSocket server = new DatagramSocket(5000); // Create server socket on port 5000
            byte data[] = new byte[100];
            DatagramPacket sentPacket = new DatagramPacket(data, data.length);
            server.receive(sentPacket); // Received packet sent from udpclient
            System.out.println(new String(sentPacket.getData())); // Display received packet data
            server.close();
        }// end try
        catch (Exception e){
            System.err.println(e);
        }// end catch
    }// end main
}// end clas