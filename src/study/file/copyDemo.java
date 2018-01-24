package study.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.logging.Logger;

import org.ietf.jgss.Oid;

public class copyDemo {
	public static void main(String[] args) {
		copy_01();
	}
	static void copy_01() {
		long s = System.currentTimeMillis();
		FileOutputStream fos=null;
		FileInputStream fis=null;
		
		try {
			fis = new FileInputStream("C:\\迅雷下载\\575701.mp4");
			fos = new FileOutputStream("C:\\迅雷下载\\575701_copy.mp4");
			
			byte[] b= new byte[1024*130];
			int len = 0;
			while((len = fis.read(b))!=-1) {
				fos.write(b);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				if(fos!=null)
					fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}finally {
				try {
					if(fis!=null)
						fis.close();
					long e = System.currentTimeMillis() - s;
					System.out.println(e);
				} catch (Exception e3) {
					// TODO: handle exception
				}
			}
		}
	}
}
