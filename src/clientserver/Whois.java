/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientserver;

/**
 *
 * @author Ara
 */
// Demonstrate Sockets.
import java.net.*;
import java.io.*;
class Whois {
public static void main(String args[]) throws Exception {
int c;
// Create a socket connected to internic.net, port 43.
Socket s = new Socket("10.10.2.134", 22);
// Obtain input and output streams.
InputStream in = s.getInputStream();
OutputStream out = s.getOutputStream();
// Construct a request string.
String str = "AAAAAAAAAAAA";
//// Convert to bytes.
byte buf[] = str.getBytes();
//// Send request.
out.write(buf);
//// Read and display response.
//while ((c = in.read()) != -1) {
//System.out.print((char) c);
//}
//s.close();
}
}