package model;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;

import controller.ActionForward;

public interface Action2 {

	public ActionForward execute(MultipartRequest request, HttpServletResponse response) throws IOException;
	
}
