package study.Inet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPSocketServerCopyDemo {
public static void main(String[] args) throws IOException{
	ServerSocket server = new ServerSocket(6000);
	Socket socket = server.accept();
	InputStream in = socket.getInputStream();
	File upload = new File("upload");
	if(!upload.exists()) {
		upload.mkdir();
	}
	FileOutputStream fos = new FileOutputStream(upload+File.separator+"abc.torrent");
	int len = 0;
	byte[] bytes = new byte[1024];
	while((len = in.read(bytes))!=-1) {
		fos.write(bytes,0,len);
	}
	OutputStream out = socket.getOutputStream();
	out.write("上传成功".getBytes());
	
	
	
	fos.close();
	server.close();
	socket.close();
}
}
