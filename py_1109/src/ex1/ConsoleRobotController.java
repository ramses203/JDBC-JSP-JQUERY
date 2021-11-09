package ex1;

import java.util.Scanner;

public class ConsoleRobotController {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("전원 : 1 - on,  2 - off");
			int powerVal = Integer.parseInt(sc.nextLine());
			RoboDog ref = new RoboDog();
			if(powerVal == 1) {
				ref.onOff("on");
			}else if (powerVal == 2){
				ref.onOff("off");
			}
			
			
			System.out.println("배터리 용량");
			 System.out.println("=> : "+ref.printVol());
			 System.out.println("강아지 울음 결정 :");
			 System.out.println(ref.dSound(sc.nextLine()));
		sc.close();
		}
}
