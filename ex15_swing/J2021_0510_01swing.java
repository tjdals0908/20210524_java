package ex15_swing;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

//swing 패키지를 이용한 gui 화면 만들기 
public class J2021_0510_01swing extends JFrame {
	J2021_0510_01swing(){
		super("JFRAME 테스트");
		setTitle("Jframe 테스트");
		setSize(500, 300);
		//컴포넌트 만들기
		JTextField tf = new JTextField(); 		//테스트 박스 
		JButton btnadd = new JButton("테스트");	//어떤내용이 올라가는지 작성
		
		//컴포넌트를 올린 컨테이너 생성 
		Container con = getContentPane();
		//컴포넌트를 컨테이너에 추가 
		con.add(tf,"North"); //north 쪽에 올리겟다
		con.add(btnadd,"South");
		
			
		setVisible(true);	//화면에 보이게 한다 꼭 해줘야 함 
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); 		//윈도우가 종료될대 강제 종료
	}
	
	public static void main(String[] args) {

		J2021_0510_01swing myframe = new J2021_0510_01swing();
		
		
		
		
	}

}
