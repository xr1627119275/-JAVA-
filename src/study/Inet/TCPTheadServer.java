package study.Inet;

import java.net.ServerSocket;
import java.net.Socket;

public class TCPTheadServer {
	public static void main(String[] args) throws Exception{
		ServerSocket server = new ServerSocket(6000);
		while (true) {
			Socket socket = server.accept();
			new Thread(new Upload(socket)).start();
		}
	}
}
