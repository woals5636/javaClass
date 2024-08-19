package days22;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * @author jam
 * @date 2024. 7. 30. - 오후 2:34:20
 * @subject
 * @content
 *
 */
public class Ex04_02 {

	   public static void main(String[] args) {
	      String name = ".\\src\\days22\\child.ser";

	      try (
	         FileInputStream fis= new FileInputStream(name);
	         ObjectInputStream ois = new ObjectInputStream(fis);   ){
	         // u1   oos.writeObject()
	         Child c = (Child) ois.readObject();
	         System.out.println( c.name + " / " + c.age );
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	   }
	}
