package ex1.model;

public class Ex2SubModel {
private static Ex2SubModel model;
private Ex2SubModel() {}

public synchronized static Ex2SubModel getinstance() {
	if(model == null) {
		model = new Ex2SubModel();
	}
	return model;
	
}

public int subtract(int a, int b) {
	int c = a - b;
	return c;
}
}
