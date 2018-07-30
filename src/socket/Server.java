package socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        Socket cs = null;
        try {
            ServerSocket ss = new ServerSocket(3306);
            cs = ss.accept();
            while(true){


                System.out.println("A new client is connected : " + cs);

                DataInputStream dis = new DataInputStream(cs.getInputStream());
                DataOutputStream dos = new DataOutputStream(cs.getOutputStream());

                System.out.println("Assigning new thread for this client");

                Thread t = new ClientHandler(cs,dis,dos);
                t.start();
            }

        }catch(IOException e){
            try {
                cs.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }
    }
}
