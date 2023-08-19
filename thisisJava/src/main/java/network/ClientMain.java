package network;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientMain {

	public static void main(String[] args) {
		try { 
			Socket socket = new Socket("0.0.0.0", 50001);
			
			System.out.println("연결 성공");
			
			socket.close();
			System.out.println("연결 끊음");
			
		}catch (UnknownHostException e) {
			// TODO: handle exception
		}catch (IOException e) {
			
		}
	}

}
