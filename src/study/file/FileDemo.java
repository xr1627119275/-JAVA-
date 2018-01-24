package study.file;

import java.io.File;
import java.io.FileFilter;

public class FileDemo {
	public static void main(String[] args) {
		File file = new File("C:\\迅雷下载");
		findJavaFile(file);

	}

	static void getFile(File file) {
		System.out.println(file);
		for (File dic : file.listFiles()) {
			if (dic.isDirectory()) {
				getFile(dic);
			} else {
				System.out.println(dic);
			}
		}
	}

	static void findJavaFile(File file) {
		File[] fjava = file.listFiles(new FileDemo().new filter());
		for(File f:fjava) {
			if(f.isDirectory()) {
				findJavaFile(f);
			}else {
				System.out.println(f);
			}
		}
	}

	class filter implements FileFilter {
		@Override
		public boolean accept(File pathname) {
			// TODO Auto-generated method stub
			if (pathname.getName().toLowerCase().endsWith(".java")) {
				return true;
			}else if(pathname.isDirectory()) {
				return true;
			}
			return false;
		}
	}

}
