package controller;

import model.Action;
import model.Action2;
import model.BoardFormModel;
import model.IndexModel;
import model.gallery.MyGalleryInsertModel;
import model.gallery.MyGalleryModel;
import model.gallery.MyGalleryNoticeModel;
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
		}else if(cmd.equals("gallery")) {
			action = new MyGalleryModel();
		}else if(cmd.equals("galleryNotice")) {
			action = new MyGalleryNoticeModel();
		}
		return action;
	}
	public Action2 getAction2(String cmd) {
		Action2 action = null;
		if(cmd.equals("galleryInsert")) {
			action = new MyGalleryInsertModel();
		}
		return action;
	}
}
