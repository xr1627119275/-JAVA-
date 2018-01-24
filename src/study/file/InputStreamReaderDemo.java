package study.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class InputStreamReaderDemo {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("C:\\迅雷下载\\01.txt");
		InputStreamReader isr =new InputStreamReader(fis, "gbk"); 
		char[] ch = new char[1024];
		int len = isr.read(ch);
		System.out.println(new String(ch,0,len));
	}
	
}
