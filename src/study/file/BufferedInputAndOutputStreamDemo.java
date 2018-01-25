package study.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class BufferedInputAndOutputStreamDemo{
	public static void main(String[] args) throws Exception{
		BufferedOutputStream_Demo();
		BufferedInputStream_Demo();
		
	}

	private static void BufferedInputStream_Demo() throws Exception{
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\迅雷下载\\01.txt"));
		byte[] bytes = new byte[5];
		int len = 0;
		while ((len=bis.read(bytes))!=-1) {
			System.out.print(new String(bytes,0,len));
		}
		bis.close();
	}

	private static void BufferedOutputStream_Demo() throws Exception{
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\迅雷下载\\01.txt"));
		bos.write(55);
		byte bytes[] = "HelloWorld".getBytes();
		bos.write(bytes);
		bos.close();
	}
}
