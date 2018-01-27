package study.Inet;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceive {
	public static void main(String[] args) throws Exception {
		DatagramSocket ds = new DatagramSocket(6000);
		byte[] data = new byte[1024];
		while (true) {
			DatagramPacket dp = new DatagramPacket(data, data.length);
			ds.receive(dp);
			int length = dp.getLength();
			System.out.println("IP地址:" + dp.getAddress().getHostAddress() + "..." + new String(data, 0, length));
		}
	}

}
