package homework;

import java.util.Random;
import java.util.Scanner;

public class HolJackGame {
public static void main(String[] args) {
	int win = 0;
	int total = 0;
	double winrate = 0;
	
	Scanner sc = new Scanner(System.in);
	
	while(true) {
		
		System.out.println("1-홀, 2-짝, 3-종료 : ");
		String temp = sc.nextLine();
		int num = 0;
		if(temp.equals("1")||temp.equals("2")||temp.equals("3")) {
			num = Integer.parseInt(temp);
		}else {
			System.out.println("1,2,3만 입력하세요.");
			
		}
		int cpu = (int)((Math.random()*2)+1);
		
		 if(num == 3) {
			System.out.println("종료입니다.");
			System.out.println("전체 게임 수 : "+total+"이긴횟수 : "+ win);
			System.out.println("승률"+ winrate+"%");
		
			if (total < 5) {
				System.out.println("********************");
				System.out.println("상품은 5게임 이상일때문 지급됩니다."); 
			}else {
				if (winrate >= 80) {
					System.out.println("A등급 : 1000만원");
				}else if (winrate >= 70) {
					System.out.println("B등급 : 500만원");
				}else if (winrate >= 60) {
					System.out.println("C등급 : 100만원");
				}else if (winrate >= 50) {
					System.out.println("D등급 : 10만원");
				}else {
					System.out.println("상품 없습니다. 차비 1000원");
				}
			}break;
		}else if(num == cpu) {
			System.out.println("win ^^");
			win ++;
			total ++;
			winrate = ((double)win/total)*100;
		}else if(num != cpu) {
			System.out.println("lose ^^");
			total ++;
			winrate = ((double)win/total)*100;
		}
	
	}
	
	
}
}
