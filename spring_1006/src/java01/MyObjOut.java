package java01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;



public class MyObjOut {
public static void main(String[] args) throws FileNotFoundException, IOException {
	String path ="D:\\kosmo91\\jsp\\workspace\\spring_1006\\src\\java01\\data.dat";
	ObjectOutputStream oop = new ObjectOutputStream(new FileOutputStream(path));
	MyMember member = new MyMember();
	member.setId("test");
	member.setName("±è±æµ¿");
	oop.writeObject(member);
}
}
