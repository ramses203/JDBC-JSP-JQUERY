package basic01;

public class EngMessage {
	private MyMessage message;

	public void setMessage(MyMessage message) {
		this.message = message;
	}
	
	public String makeMessage(String msg) {
		msg += "���� ���� ABC���ڿ� =>";
		return message.printMessage(msg);
	}
	
}
