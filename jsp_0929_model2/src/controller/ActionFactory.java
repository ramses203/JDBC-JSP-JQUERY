package controller;

import model.Action;
import model.BoardFormModel;
import model.IndexModel;
import model.login.LoginFormModel;
import model.login.LoginProcess;
import model.login.LogoutProcess;
import model.member.MemberModel;

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
		}else if(cmd.equals("board")) {
			action = new BoardFormModel();
		}else if(cmd.equals("loginForm")) {
			action = new LoginFormModel();
		}else if(cmd.equals("loginProcess")) {
			action = new LoginProcess();
		}else if(cmd.equals("logoutProcess")) {
			action = new LogoutProcess();
		}else if(cmd.equals("member")) {
			action = new MemberModel();
		}
		return action;
	}
}
