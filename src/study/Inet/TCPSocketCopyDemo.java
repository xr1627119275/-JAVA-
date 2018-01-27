package study.Inet;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPSocketCopyDemo {
	public static void main(String[] args) throws Exception{
		Socket socket = new Socket("65.49.134.108", 6000);
		OutputStream out = socket.getOutputStream();
		FileInputStream fis = new FileInputStream("C:\\迅雷下载\\forum.torrent");
		byte[] bytes = new byte[1024];
		int len = 0;
		while((len = fis.read(bytes))!=-1) {
			out.write(bytes,0,len);
		}
		socket.shutdownOutput();
		InputStream in = socket.getInputStream();
		len = in.read(bytes);
		System.out.println(new String(bytes,0,len));
		
		
		fis.close();
		socket.close();		
	}
}
