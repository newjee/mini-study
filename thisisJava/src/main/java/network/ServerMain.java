package network;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerMain {
	
	private static ServerSocket serverSocket = null;
	
	public static void main(String[] args) {
		//서버 시작
		startServer();
		Scanner scan = new Scanner(System.in);

		while(true) {
			String key = scan.nextLine();
			if(key.toLowerCase().equals("q")) {
				break;
			}
		}
		scan.close();
		
		stopServer();
	}

	private static void startServer() {
		
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					//1) 서버 생성 바인딩
					serverSocket = new ServerSocket(50001);
					System.out.println("서버 시작");
					
					while(true) {
						//2) 연결 수락
						Socket socket = serverSocket.accept();
						
						//+) 클라이언트 정보
						InetSocketAddress isa = 
								(InetSocketAddress) socket.getRemoteSocketAddress();
						
						System.out.println(isa.getHostName() + "연결 수락");
						
						//3) 연결 끊기
						socket.close();
						System.out.println(isa.getHostName() + "연결 끊음");
						
					}
				} catch(IOException e ) {
					System.out.println(e.getMessage());
				}
			}
		};
		
		thread.start();
	}

	private static void stopServer() {
		try {
			serverSocket.close();
			System.out.println("종료");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
