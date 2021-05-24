package ex14_file;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;


//서버클래스
class Server{
	private int port = 33333;		//포트번호는 유일해야된다 

	void start() {
		ServerSocket server= null;   //서버소켓 필요
		Socket socket=null;			//소켓은 클라이어언트와 서버와 연결되어있는 길이라고 보면된다
		BufferedReader br = null;
		try {
			server = new ServerSocket(port);
			System.out.println("서버 시작");
			while(true) {
				System.out.println("클라이언트 접속 대기중...");
				socket = server.accept();//클라이언트가 요청시 허용 //요청을 해야된다
				System.out.println("클라이언트 접속 성공");
				//데이터를 주고 받기 위한 스트림 생성
				br=	new BufferedReader( new InputStreamReader( socket.getInputStream()));  //인풋스트림은 바이트 단위 그래서 인풋인풋스트림리더로 감싸줘야된다(문자단위로 읽어준다) 
				//버퍼리더로 감싼다 라인으로 읽을려고
				while(true) {
					String data = br.readLine();
					if(data == null || data.equals("quit")) break;
					System.out.println("받은메세지:"+data);//클라이언트에다 보낸것 읽기
				}
			}
		}catch (SocketException e) {
				System.out.println("클라이언트 접속 예외 종료");
		} catch (IOException e) {
			System.out.println("io 예외");
			e.printStackTrace();
		}finally {
			try {
				if(br != null)br.close();
				if(socket!=null)socket.close();
				if(server!=null) server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}		
	}
}


public class J20210510_02_network_server {
	public static void main(String[] args) {

		Server server = new Server();
		server.start(); //서버 시작
		
	}

}
