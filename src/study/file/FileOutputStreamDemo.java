package study.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamDemo {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:\\迅雷下载\\01.java");
		byte[] b = new byte[] {67,68,69,70};
		fos.write("哈abc".getBytes());
		fos.close();
	}
}
