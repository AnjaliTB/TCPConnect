import java.io.*;
import java.net.*;
class ServerTcp{
    public static void main(String[] args)throws Exception
    {
        ServerSocket sersock = new ServerSocket(3000);
        System.out.println("Server  ready");
        Socket sock = sersock.accept( );   
        BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in)); 
    }

}
