package ex1;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class TcpClient {

	public static void main(String[] args) {
		Socket socket = null;


		try {
			socket = new Socket();
			
			socket.connect(new InetSocketAddress("127.0.0.1", 5000));
			System.out.println("connected");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
