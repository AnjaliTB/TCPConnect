import java.io.*;
import java.net.*;
public class ClientTcp
{
public static void main(String[] args) throws Exception
  {
     Socket sock = new Socket("127.0.0.1", 3000);
     / reading from keyboard (keyRead object)
     BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
  	 // sending to client (pwrite object)
     OutputStream ostream = sock.getOutputStream(); 
     PrintWriter pwrite = new PrintWriter(ostream, true);
     }
}
