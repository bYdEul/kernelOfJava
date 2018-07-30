package socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getByName("localhost");
            Socket cs = new Socket(ip, 3306);//cs:client socket  ss:server socket
            //System.out.println(client.getLocalAddress());
            Scanner scn = new Scanner(System.in);

            DataInputStream dis = new DataInputStream(cs.getInputStream());
            DataOutputStream dos = new DataOutputStream(cs.getOutputStream());

            while(true)
            {
                System.out.println(dis.readUTF());
                String tosend = scn.nextLine();
                dos.writeUTF(tosend);
                if(tosend.equals("Exit"))
                {
                    System.out.println("exiting this connection"+cs);
                    cs.close();
                    System.out.println("connecting closing");
                    break;
                }
                String received = dis.readUTF();
                System.out.println(received);
            }
            scn.close();
            dis.close();
            dos.close();
        }catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
