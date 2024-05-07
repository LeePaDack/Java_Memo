package com.kh.serverEx;

import java.net.InetAddress;
import java.net.Socket;
/*
서버 IP 가 192.200.3.58 일 때 서버로 연결하는 방법을 수정해서 작성하기
 */
public class IPPort {
	
	public static void main(String[] args) {
		try {
			// String serverIP = 192.200.3.58
			String serverIP = InetAddress.getLocalHost().getHostAddress();
			
			System.out.println(serverIP);
			//                     각자 컴퓨터 IP 주소
			Socket socket = new Socket(serverIP, 3000);
			System.out.println(socket);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
}
