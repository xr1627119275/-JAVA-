package study.Inet;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	public static void main(String[] args) throws IOException{
		ServerSocket server = new ServerSocket(6000);
		Socket socket = server.accept();
		InputStream in=socket.getInputStream();
		byte[] data=  new byte[1024];
		int len = in.read(data);
		System.out.println(new String(data,0,data.length));
		OutputStream out = socket.getOutputStream();
		out.write("收到谢谢".getBytes());
		socket.close();
		server.close();
		out.close();
	}
}
