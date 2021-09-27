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
	// ActionFactory�� ��û�� �м��ϰ�, ��û�� �ش�Ǵ� ���� ��������
	// controllSerevlet���� �� �ּҸ� ��ȯ�Ѵ�.
	
	public Action getAction(String cmd) {  // ActionFactory�� Action�� �������⶧���� �� �߻�Ŭ���� ������ ��������ȴ�.
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
