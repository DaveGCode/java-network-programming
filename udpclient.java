//Program: UDP Client used to send a message to a local UDP Server

import java.io.*;
import java.net.*;


public class udpclient {
    public static void main (String[] args){
        try {
            DatagramSocket client = new DatagramSocket(); // Create client socket
            String message = "Hello Server";
            byte data [] = message.getBytes();
            // Creates datagram packet to be sent to UDP Server
            // data: message to send | data.length: length of message | InetAddress: IP address of local host | Port: 5000
            DatagramPacket sendPacket = new DatagramPacket(data, data.length, InetAddress.getLocalHost(), 5000);
            client.send(sendPacket); // Send packet to server
            client.close();
        }// end try
        catch (Exception e){
            System.err.println(e);
        }// end catch
    }// end main
}// end class