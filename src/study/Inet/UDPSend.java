package study.Inet;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPSend {
	public static void main(String[] args) throws Exception {
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("请输入:");
			byte[] data = scanner.nextLine().getBytes();
			InetAddress inet = InetAddress.getByName("65.49.134.108");
			DatagramPacket dp = new DatagramPacket(data, data.length, inet, 6000);
			DatagramSocket ds = new DatagramSocket();
			ds.send(dp);
		}

	}

}
