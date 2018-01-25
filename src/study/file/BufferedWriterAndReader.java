package study.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStreamWriter;

public class BufferedWriterAndReader {
	
	public static void main(String[] args) throws Exception{
		BufferedWriter_demo();
		BufferedReader_demo();
	}

	private static void BufferedWriter_demo() throws Exception{
		FileWriter fWriter = new FileWriter("C:\\迅雷下载\\01.txt");
		BufferedWriter bWriter = new BufferedWriter(fWriter);
		
		bWriter.write("你好");
		
		bWriter.newLine();
		bWriter.write("哈哈");
		bWriter.newLine();
		bWriter.write("Itcast");
		
		bWriter.close();
	}

	private static void BufferedReader_demo() throws Exception{
		FileReader fReader = new FileReader("C:\\迅雷下载\\01.txt");
		BufferedReader bufferedReader = new BufferedReader(fReader);
		String  line = "";
		int lineNumber = 0;
		while((line = bufferedReader.readLine())!=null) {
			lineNumber++;
			System.out.println(lineNumber+" "+line);
		}
		bufferedReader.close();
	}
	
}
