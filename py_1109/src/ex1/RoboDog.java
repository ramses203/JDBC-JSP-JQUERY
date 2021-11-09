package ex1;

public class RoboDog {

	/*
	 * �̸� => dName => String ���� => dPower => boolean �뷮 => dVolume => int
	 * 
	 * 
	 * �޼��� ������ ���� ������ Ų��. => public void boolean onOff(String power){����ʵ��� dPower����
	 * ���� �ʱ�ȭ �Ѵ�.}
	 * 
	 * �޼��� ������ ���°��� ����Ѵ�. => �������� : ������ true�� ���, bPower�� ���¸� ��ȯ 
	 * public boolean statusPower(){}
	 * 
	 * �޼��� �뷮�� ����Ѵ�. =>  public String printVol(){} => �뷮�� ���ڿ��� ��ȯ�Ѵ�. 
	 * 
	 * �޼��� �������� ¢�´�. => �������� : ������ true�� ���, ¢�´�(������,������ �з�). => public String dSound(String sound){}
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
			  return sb.append("������ Ű�ž� Ȯ���� �����մϴ�.").toString();
		  }else {
			  if(dVolume <= 10) {
				  sb.append("���͸� �뷮�� 10% �̸��Դϴ�. ������ �ϼ���");
			  }else {
				  sb.append("���͸� �뷮").append(dVolume+"% �Դϴ�.");
			  }
		  }
		  return sb.toString();
	  }
	  
	  public String dSound(String s) {
		  if(dName == null) dName= "�п��� ";
		  StringBuilder sb = new StringBuilder();
		  if(!dPower) {
			  return sb.append("������ Ű�ž� Ȯ���� �����մϴ�.").toString();
		  }else {
			  if(dVolume <= 10) {
				  sb.append("���͸� �뷮�� 10% �̸��Դϴ�. ������ �ϼ���");
				   sb.append(" ������");
			  } else {
			  sb.append("������ ");
			  }
		  }
		  
		  sb.append(dName).append(s).append(" �ϰ� ���.");
		  return sb.toString();
		  
		  
	  }

}
