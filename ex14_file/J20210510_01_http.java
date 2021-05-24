package ex14_file;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class J20210510_01_http {

	//http 웹 컨넥션
	public static void main(String[] args) throws MalformedURLException, IOException, InterruptedException {
		// 파싱
		String target = "https://www.naver.com/";	//원하는데이터주소값
		
		HttpURLConnection con 
			= (HttpURLConnection)new URL(target).openConnection();
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(con.getInputStream(),"utf-8"));
		FileWriter fw = null; 
		String temp; 
		int cnt = 0;
		while ((temp = br.readLine())!= null) {
			cnt++;									//화면에 보이기
			//System.out.println(cnt + temp);
			if (temp.contains("class=\"title")) {
				System.out.println(temp);
				fw = new FileWriter(temp + ".txt");
			}
		}
		br.close();
		con.disconnect();

	}
}

		
		

