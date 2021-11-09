package ex2;

public class GameRate {

    private int win;
    private int total;
    private double winRate;

    public GameRate() {
        win = 0;
        total = 0;
        winRate = 0.0;
    }
    public int getWin() {
        return win;
    }
    public int getTotal() {
        return total;
    }
    public void winTotal() {
        win+=1;
        total+=1;
    }
    public void loseTotal() {
        total+=1;
    }
    public double getWinRate() {
        return (double)win/total*100;
    }

}