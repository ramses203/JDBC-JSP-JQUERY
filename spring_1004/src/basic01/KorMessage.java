package basic01;

public class KorMessage {
	//step1
	private MyMessage message;
	//step : 스프링으로부터 의존성을 받기 위해서 setter를 추가

	public void setMessage(MyMessage message) {
		this.message = message;
	}
	
	public String makeMessage(String msg) {
		msg += "전통 한글 표준어 기능:";
		return message.printMessage(msg);
	}
}
