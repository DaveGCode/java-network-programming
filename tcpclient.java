// Program: TCP Client used to send a message to a local TCP Server
import java.io.*;
import java.net.*;


public class tcpclient {
    public static void main(String[] args) {
        try {
            Socket client = new Socket("localhost", 5000); // localhost socket on port 5000
            // Create input/output streams for data transmission
            ObjectOutputStream out = new ObjectOutputStream(client.getOutputStream());
            ObjectInputStream in = new ObjectInputStream(client.getInputStream());
            // Create message to be sent
            String message = (String) in.readObject();
            System.out.println("Data from Server: " + message);
            message = "Hello";
            out.writeObject(message);
            client.close();
        }//end try
        catch (Exception ex){
            System.err.println(ex);
        }// end catch
    }// end main
}//end class