package days22;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * @author jam
 * @date 2024. 7. 30. - 오후 2:25:49
 * @subject
 * @content
 *
 */
public class Ex03_02 {
	public static void main(String[] args) {

		String name = ".\\src\\days22\\user.ser";

		try (
				FileInputStream fis = new FileInputStream(name);
				ObjectInputStream ois = new ObjectInputStream(fis))
				{
			// u1	oos.writeObject();
			User u1 = (User) ois.readObject();
			// u1.name;
			// u2
			User u2 = (User) ois.readObject();
			// u2.age
			// list
			ArrayList<User>list =(ArrayList<User>)ois.readObject();

				} catch (Exception e) {
				}


	}// main
}// class
