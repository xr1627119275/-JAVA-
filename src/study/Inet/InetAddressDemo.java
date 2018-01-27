package study.Inet;

import java.net.InetAddress;

public class InetAddressDemo {
	public static void main(String[] args) throws Exception {
		function_1();
		function_2();
	}
	
	private static void function_2() throws Exception{
		InetAddress inet = InetAddress.getByName("www.wangwang520.cn");
		System.out.println(inet);
		
	}

	static void function_1() throws Exception{
		InetAddress inet = InetAddress.getLocalHost();
		System.out.println(inet.getHostName());
	}
}
