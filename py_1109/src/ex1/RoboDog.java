package ex1;

public class RoboDog {

	/*
	 * 이름 => dName => String 전원 => dPower => boolean 용량 => dVolume => int
	 * 
	 * 
	 * 메서드 전원을 끈다 전원을 킨다. => public void boolean onOff(String power){멤버필드의 dPower에다
	 * 값을 초기화 한다.}
	 * 
	 * 메서드 전원의 상태값을 출력한다. => 전제조건 : 전원이 true일 경우, bPower의 상태를 반환 
	 * public boolean statusPower(){}
	 * 
	 * 메서드 용량을 출력한다. =>  public String printVol(){} => 용량을 문자열로 반환한다. 
	 * 
	 * 메서드 강아지가 짖는다. => 전제조건 : 전원이 true일 경우, 짖는다(대형견,소형견 분류). => public String dSound(String sound){}
	 */

	private String dName;
	private boolean dPower;
	private int dVolume;
	
	

	public RoboDog() {
		dVolume = 100;
	}


	public void onOff(String powVal) {
		if (powVal.equals("on")) {
			dPower = true;
		} else {
			dPower = false;
		}
		System.out.println("Log =>" + dPower);
	}
	
	  
	  public boolean stPower() { 
		  return dPower; 
	  }
	 
	  
	  
	  
	  public String printVol() {
		  StringBuilder sb = new StringBuilder();
		  if(!dPower) {
			  return sb.append("전원을 키셔야 확인이 가능합니다.").toString();
		  }else {
			  if(dVolume <= 10) {
				  sb.append("배터리 용량이 10% 미만입니다. 충전을 하세요");
			  }else {
				  sb.append("배터리 용량").append(dVolume+"% 입니다.");
			  }
		  }
		  return sb.toString();
	  }
	  
	  public String dSound(String s) {
		  if(dName == null) dName= "왈왈이 ";
		  StringBuilder sb = new StringBuilder();
		  if(!dPower) {
			  return sb.append("전원을 키셔야 확인이 가능합니다.").toString();
		  }else {
			  if(dVolume <= 10) {
				  sb.append("배터리 용량이 10% 미만입니다. 충전을 하세요");
				   sb.append(" 힘없이");
			  } else {
			  sb.append("힘차게 ");
			  }
		  }
		  
		  sb.append(dName).append(s).append(" 하고 운다.");
		  return sb.toString();
		  
		  
	  }

}
