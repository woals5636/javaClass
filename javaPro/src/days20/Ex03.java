package days20;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Properties;

/**
 * @author jam
 * @date 2024. 7. 26. - 오전 11:13:00
 * @subject	Properties 컬렉션 클래스 예제
 * @content	1. key(String) value(String) = Map
 * 			2. 환경설정값을 쓰기/읽기
 * 			3. setProperty() / getProperty() => p
 * 			4. 파일(.properties) 저장
 * 				p.store( FileWriter, 주석문 )
 * 				p.storeToXML( FileOutputStream, 주석문 )
 *
 */
public class Ex03 {

	public static void main(String[] args) {
		/*
		 * Properties 컬렉션클래스
		 * 1. Hashtable<String, String> == Properties
		 * 2. key + value = entry
		 * 3. 환경 설정값들을 파일로 쓰기/읽기
		 * 					put()/get()
		 * 					setProperties()/getProperties
		 * 4. 저장되는 파일확장자	.properties
		 *		store(), storeToXML()
		 *		load()
		 * 
		 * 
		 * */

		// 예) DBMS(오라클) + Java 연동 ( DB 연결 설정 정보 ) 
		String className = "oracle.jdbc.driver.OracleDriver";            
		String url = "jdbc:oracle:thin:@localhost:1521:xe";                  
		String user = "scott";                                                                   
		String password = "tiger";  
		
		Properties p = new Properties();
		p.setProperty("className", "oracle.jdbc.driver.OracleDriver");
		p.setProperty("url", "jdbc:oracle:thin:@localhost:1521:xe");
		p.setProperty("user", "scott");
		p.setProperty("password",  "tiger");
		
		String fileName = ".\\src\\days20\\jdbcConfig.properties";
		// FileReader, BufferedReader
		// FileWriter
		try (FileWriter writer = new FileWriter(fileName)){
			p.store(writer, "jdbc config sample.");
			
			System.out.println(" SAVE END ");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}// main	
	
}// class
