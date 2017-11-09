// Program: TCP Server used to interact with local TCP client

import java.io.*;
import java.net.*;

public class tcpserver {
    public static void main(String[] args){
        try {
            ServerSocket server = new ServerSocket(5000, 10); // Create server, 10 clients max
            Socket connection = server.accept();
            // Create input/output streams for data transmission
            ObjectOutputStream out = new ObjectOutputStream(connection.getOutputStream());
            ObjectInputStream in = new ObjectInputStream(connection.getInputStream());
            // Creation connection message, write to client
            String message = "Connection successful";
            out.writeObject(message);
            // Read in data sent from Client
            message = (String) in.readObject();
            System.out.println("Data received from Client:" + message);
            connection.close();
        }// end try
        catch (Exception ex){
            System.err.println(ex);
        }// end catch
    }// main
}// end class