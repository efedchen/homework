package NetworkActivity.ServerClientTest;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientTest {
    public static void main(String[] args) {
        try(Socket sock = new Socket("localhost", 11111))
        {
            OutputStream out = sock.getOutputStream();
            out.write(4);
            out.flush();

            InputStream in = sock.getInputStream();
            int responce =  in.read();
            System.out.println(responce);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
