package basic01;

public class KorMessage {
	//step1
	private MyMessage message;
	//step : ���������κ��� �������� �ޱ� ���ؼ� setter�� �߰�

	public void setMessage(MyMessage message) {
		this.message = message;
	}
	
	public String makeMessage(String msg) {
		msg += "���� �ѱ� ǥ�ؾ� ���:";
		return message.printMessage(msg);
	}
}
