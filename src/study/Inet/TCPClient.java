package study.Inet;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {
	public static void main(String[] args) throws IOException {
		Socket socket = new Socket("127.0.0.1",6000);
		OutputStream out = socket.getOutputStream();
		out.write("服务器OK,".getBytes());
		
		InputStream in=socket.getInputStream();
		byte[] data=  new byte[1024];
		int len = in.read(data);
		System.out.println(new String(data,0,len));
		socket.close();
	}
}
