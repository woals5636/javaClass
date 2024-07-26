package days20;

import java.io.FileReader;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

/**
 * @author jam
 * @date 2024. 7. 26. - 오전 11:30:57
 * @subject	Properties 컬렉션 클래스 예제
 * @content	Ex03.java -> jdbcConfig.properties 파일을 Properties 컬렉션 클래스를 사용해서 환경설정값을 얻어오는 예제
 * 
 * 			p.load(FileReader)
 * 			value = p.getProperty(key)
 * 
 * 			p.keySet() 모든 key를 얻어와서 value 값을 출력
 *
 */
public class Ex03_03 {

	public static void main(String[] args) {
		String className;            
		String url;                  
		String user;                                                                   
		String password;  
		
		Properties p = new Properties();
//		p.setProperty("className", "oracle.jdbc.driver.OracleDriver");
//		p.setProperty("url", "jdbc:oracle:thin:@localhost:1521:xe");
//		p.setProperty("user", "scott");
//		p.setProperty("password",  "tiger");
		
		String fileName = ".\\src\\days20\\jdbcConfig.properties";
		try (FileReader reader = new FileReader(fileName)){
			p.load(reader);
			// 키 출력
			Set<Object> ks = p.keySet();
			Iterator<Object> ir = ks.iterator();
			while (ir.hasNext()) {
				String key = (String) ir.next();
				String value = p.getProperty(key);
				System.out.printf("key=%s,\tvalue=%s\n",key,value);
			}
			System.out.println(" END ");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}// main	
	
}// class
