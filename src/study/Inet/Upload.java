package study.Inet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Upload implements Runnable {
	private Socket socket;

	public Upload(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		try {
			InputStream in = socket.getInputStream();
			File upload = new File("upload");
			if (!upload.exists()) {
				upload.mkdir();
			}
			FileOutputStream fos = new FileOutputStream(upload + File.separator + "abc.torrent");
			int len = 0;
			byte[] bytes = new byte[1024];
			while ((len = in.read(bytes)) != -1) {
				fos.write(bytes, 0, len);
			}
			OutputStream out = socket.getOutputStream();
			out.write("上传成功".getBytes());

			fos.close();

			socket.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
