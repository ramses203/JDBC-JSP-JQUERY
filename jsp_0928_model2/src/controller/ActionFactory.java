package controller;

import model.Action;
import model.BoardFormModel;
import model.ExamFormModel;
import model.ExamModel;
import model.IndexModel;
import model.LoginModel;
import model.memberFormModel;

public class ActionFactory {

	private static ActionFactory factory;
	private ActionFactory() {}
	public static synchronized ActionFactory getFactory() {
		if(factory == null) factory = new ActionFactory();
		return factory;
	}
	public Action getAction(String cmd) {
		Action action = null;
		if(cmd.equals("index")) {
			action = new IndexModel();
		}else if(cmd.equals("loginForm")) {
			action = new LoginModel();
		}else if(cmd.equals("memberForm")) {
			action = new memberFormModel();
		}else if(cmd.equals("vfname")) {
			action = new ExamFormModel();
		}else if(cmd.equals("board")) {
			action = new BoardFormModel();
		}
		return action;
	}
}
