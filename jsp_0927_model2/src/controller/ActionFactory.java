package controller;

import model.Action;
import model.HelloModel;
import model.MemberFormModel;
import model.MyProfileModel;
import model.TodayModel;
import model.bookModel;
import model.indexModel;

public class ActionFactory {
	private static ActionFactory factory;
	
	private ActionFactory() {}
	
	public synchronized static ActionFactory getFactory() {
		if(factory == null)
			factory = new ActionFactory();
		return factory;
	}
	// ActionFactory는 요청을 분석하고, 요청에 해당되는 모델을 생성한후
	// controllSerevlet에세 그 주소를 반환한다.
	
	public Action getAction(String cmd) {  // ActionFactory는 Action을 가져오기때문에 그 추상클래스 형으로 가져와햐안다.
		Action action = null;
		if(cmd.equals("index")) {
			action = new indexModel();
		}else if(cmd.equals("today")){
			action = new TodayModel();
		}else if(cmd.equals("memberForm")) {
			action = new MemberFormModel();
		}else if(cmd.equals("book")) {
			action = new bookModel();
		}else {
			
		}
		return action;
	}
}
