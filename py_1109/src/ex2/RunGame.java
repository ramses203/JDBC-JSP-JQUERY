package ex2;

import java.util.Scanner;

public class RunGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RSPGame rspGame = new RSPGame();
        GameRate gameRate = new GameRate();
        int gameResult = 0;
        while(true) {
            System.out.println("게임을 시작합니다. 1-가위, 2-바위,3-보,4-종료");
            String temp = sc.nextLine();
            if(temp.equals("4")) {
                break;
            }
            gameResult= rspGame.compGame(Integer.parseInt(temp));
            if(gameResult==0) {//게임에서 이겼을 경우
            	System.out.println("이겼습니다.");
                gameRate.winTotal();
            }else {//게임에서 졌거나 비겼을 경우
            	System.out.println("졌습니다.");
                gameRate.loseTotal();
            }
        }
        //게임 종료 시 결과값을 출력
        System.out.println("승률: " + gameRate.getWinRate() );
    }
}
