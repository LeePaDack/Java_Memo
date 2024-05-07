package com.kh.serverEx;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
/*
서버로 서버 안녕하세요. 라고 메세지 서버에게 보낸 후 클라이언트 자동으로 종료되게 코드 작성
 */

public class Client {

	public static void main(String[] args) {
		int port = 3000;
		String 서버IP;
		
		try {
			서버IP = InetAddress.getLocalHost().getHostAddress();
			
			Socket socket = new Socket(서버IP, port);
			System.out.println("서버에 연결됐습니다.");
			
			// Buffer 입력한 글자 가져오고 PrintWriter 로 출력하기
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			// 주최자한테 메세지 전송
			out.println("서버 안녕하세요.");
			
			// 주최자에게 온 메세지 수신 후 출력
			String msg = in.readLine();
			System.out.println("send success : " + msg);
			
			// close 작성하기
			out.close();
			in.close();
			socket.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
}
