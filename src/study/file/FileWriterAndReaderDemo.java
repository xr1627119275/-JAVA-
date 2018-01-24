package study.file;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterAndReaderDemo {
	public static void main(String[] args) throws Exception {
		fileReader_1();
	}

	private static void fileWrite_1()throws Exception {
		FileWriter fw=new FileWriter("C:\\迅雷下载\\01.txt");
		fw.write("hahahah徐睿");
		fw.flush();
		char[] c = {'a','b'};
		fw.write(c);
		
		fw.close();
		
	}
	private static void fileReader_1() throws Exception{
		FileReader fr = new FileReader("C:\\\\迅雷下载\\\\01.txt");
		int len = 0;
		while((len = fr.read())!=-1) {
			System.out.print((char)len);
		}
		
	}
}
