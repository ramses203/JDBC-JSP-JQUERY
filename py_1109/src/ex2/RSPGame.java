package ex2;

public class RSPGame {
	private int uStatus;
	private int cStatus;
	
	public int compGame(int user) {
		uStatus = user;
		cStatus = (int)((Math.random()*3)+1);
		
		if(uStatus == cStatus) {
			return 2;
		} else if((uStatus==2 || uStatus==3) && (cStatus==uStatus-1)) {
			return 0;
		}else if(uStatus==1 && (cStatus==3)) {
			return 0;
		}else {
			return 1;
		}
	}
}
