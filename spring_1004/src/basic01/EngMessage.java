package basic01;

public class EngMessage {
	private MyMessage message;

	public void setMessage(MyMessage message) {
		this.message = message;
	}
	
	public String makeMessage(String msg) {
		msg += "영국 전통 ABC문자열 =>";
		return message.printMessage(msg);
	}
	
}
