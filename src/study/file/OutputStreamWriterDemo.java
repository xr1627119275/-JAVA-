package study.file;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {
	public static void main(String[] args) throws Exception{
		writerGBK();
	}	
	static void writerGBK() throws Exception{
		FileOutputStream fos = new FileOutputStream("C:\\迅雷下载\\01.txt");
		OutputStreamWriter osw =new OutputStreamWriter(fos, "utf-8"); 
		osw.write("你好");
		osw.close();
 	}
}
