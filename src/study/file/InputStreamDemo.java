package study.file;

import java.io.FileInputStream;

public class InputStreamDemo {
	public static void main(String[] args) {
		function_2();
	}
	
	private static void function_1() {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("C:\\迅雷下载\\01.java");
			int len = 0;
			while((len = fis.read())!=-1) {
//				System.out.print((fis.read()+" ").toCharArray());
				System.out.print((char)len);
			}
		} catch (Exception e) {
			System.out.println(e.toString());
			
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (Exception e) {
				System.out.println(e.toString());
			}

		}
		
	}
	private static void function_2() {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("C:\\迅雷下载\\01.java");
			byte[] b = new byte[8];
			int len = fis.read(b);
			System.out.println(new String(b,0,len));
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
			
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (Exception e) {
				System.out.println(e.toString());
			}

		}
	}
}
