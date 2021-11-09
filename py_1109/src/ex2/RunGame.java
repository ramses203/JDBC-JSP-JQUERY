package ex2;

import java.util.Scanner;

public class RunGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RSPGame rspGame = new RSPGame();
        GameRate gameRate = new GameRate();
        int gameResult = 0;
        while(true) {
            System.out.println("������ �����մϴ�. 1-����, 2-����,3-��,4-����");
            String temp = sc.nextLine();
            if(temp.equals("4")) {
                break;
            }
            gameResult= rspGame.compGame(Integer.parseInt(temp));
            if(gameResult==0) {//���ӿ��� �̰��� ���
            	System.out.println("�̰���ϴ�.");
                gameRate.winTotal();
            }else {//���ӿ��� ���ų� ����� ���
            	System.out.println("�����ϴ�.");
                gameRate.loseTotal();
            }
        }
        //���� ���� �� ������� ���
        System.out.println("�·�: " + gameRate.getWinRate() );
    }
}
