package NetworkActivity.ServerClientTest;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Logger;

public class ServerTest {

    private static final Logger LOG = Logger.getLogger(ServerTest.class.getName());

    public static void main(String[] args) throws IOException {
        try(ServerSocket servSock  = new ServerSocket(11111)){
             while(true){
                 try (Socket socket = servSock.accept()){
                     serveClient(socket);
                 }
             }
        }
    }
    public static void serveClient (Socket socket) throws IOException {
        LOG.info("Server Client " + socket.getInetAddress());


        InputStream in = socket.getInputStream();
        OutputStream out = socket.getOutputStream();

        while (true){
            int request = in.read();
            if(request == -1){
                break;
            }

            LOG.info("Request " + request);
            out.write(request*request);
            out.flush();

        }
    }
}
