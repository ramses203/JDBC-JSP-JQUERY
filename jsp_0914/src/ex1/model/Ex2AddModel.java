package ex1.model;

public class Ex2AddModel {
private static Ex2AddModel model;
private Ex2AddModel () {}

public synchronized static Ex2AddModel getInstance() {
	if(model == null) {
		model = new Ex2AddModel();
	}
	return model;
}
public int add(int a, int b) {
	int c = a + b;
	return c;
}
public int subtract(int a, int b) {
	int c = a - b;
	return c;
}

}
