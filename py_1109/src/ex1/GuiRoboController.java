package ex1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GuiRoboController extends JFrame{
	private JPanel p1,p2;
	private JButton btn1,btn2;
	private JLabel res;
	
	
	public GuiRoboController() {
		
		//위에 패널
		p1 = new JPanel();
		btn1 = new JButton("on");
		btn2 = new JButton("off");
		p1.add(btn1);  // p1은 버튼 두개를 가지고 있는 패널
		p1.add(btn2);
		p1.setBackground(Color.red);
		add(p1, "North");
		
		
		p2 = new JPanel();
		res = new JLabel();
		p2.add(res);
		add(p2);  //JFrame의 주소?
		// RoboDog  생성하기
		RoboDog ref = new RoboDog();
		
		//-----------------------------------
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setTitle("Btn1 click!");
				ref.onOff("on");
			}
		});
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setTitle("Btn2 click!");
				ref.onOff("off");
				
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 450);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new GuiRoboController();
	}
	
}
