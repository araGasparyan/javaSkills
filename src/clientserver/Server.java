/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientserver;

import static clientserver.WriteServer.ds;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ara
 */
public class Server {
public static int serverPort = 5000;
public static int clientPort = 4000;
public static int buffer_size = 1024;
public static DatagramSocket ds;
public static byte buffer[] = new byte[buffer_size];
public static void TheServer(String data) throws Exception {
int pos=0;
boolean tmp=true;
for(int i=0;i<data.length();i++){
    buffer[pos]=(byte)data.charAt(pos);
    pos++;
}
System.out.println(pos);
    System.out.println(buffer[0]+" "+buffer[1]+" "+buffer[2]+" "+buffer.length);
ds.send(new DatagramPacket(buffer,pos,
InetAddress.getByName("10.10.2.23"),clientPort));
ds.close();
}

public static void main(String[] args) {
   
    try {
        ds= new DatagramSocket(serverPort);
        Server.TheServer(args[0]);
    } catch (Exception ex) {
        Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
    }
}

}

