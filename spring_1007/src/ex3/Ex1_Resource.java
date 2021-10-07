package ex3;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Qualifier;

public class Ex1_Resource {
	@Resource(name = "resn1")
	@Qualifier("bb")
	private Ex1_MyResource res;
	
	public Ex1_MyResource getRes() {
		return res;
	}
}
