package pubnubmon;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

public class Monitor {

  /**
   * Method that tries to connect to host and return based on success
   * @param host host to connect to
   * @return true of host is alive, false if dead
   */
    public Boolean isAlive(String host) {
      Socket socket = new Socket(); // unbound
      SocketAddress address = new InetSocketAddress(host, 80);
      try {
        socket.connect(address, 4000);
        socket.close();
        return true;
      } catch (IOException e) {
        return false;
      } // 4 second connect timeout
    }
    
   
}
