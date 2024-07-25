package days19;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author jam
 * @date 2024. 7. 25. - 오후 4:29:44
 * @subject
 * @content
 *
 */
public class Ex12_02 {
	public static void main(String[] args) {
		Hashtable<String, String> hm = new Hashtable<String, String>();
		hm.put("admin", "관리자");
		hm.put("hong", "홍길동");
		hm.put("kenik", "이창익");
		
		Set<Entry<String, String>> es = hm.entrySet();
		Iterator<Entry<String, String>> ir = es.iterator();
		while (ir.hasNext()) {
			Entry<String, String> entry = ir
					.next();
			System.out.printf("%s=%s\n",entry.getKey(),entry.getValue());
		}
		
		System.out.println(hm);
		System.out.println(hm.size());	//	엔트리의 갯수
		
	}// main
}// class
