package days19;

import java.util.Collection;
import java.util.HashMap;
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
public class Ex12 {
	public static void main(String[] args) {
		/*
		 *	[ Map ]
		 *	1. key + value 한쌍 관리 == Entry(엔트리)
		 *	2. key 중복 X
		 *     value 중복 O
		 *	3. HashMap	 (신) - 사용 권장.
		 *	   HashTable (구)
		 *
		 *	4. Hashing ?
		 *	 - 해시함수를 이용하여 데이터를 해시 테이블에 저장하고 검색하는 기법.
		 *	 - 해시함수란? 데이터를 저장하는 곳을 알려주는 함수로 데이터를 빠르게 검색할 수 있다.
		 *
		 *	예)
		 *		[2020]-[1][2]...[12]
		 *		[2021]-[1][2]...[12]
		 *		[2022]-[1][2]...[12]
		 *		[2023]-[1][2]...[12]
		 *		[2024]-[1][2]...[12]
		 *	- 해싱을 사용하기 때문에 많은 양의 데이터를 검색할 때 뛰어난 성능이 있다.
		 *
		 */
		//		id		name
		HashMap<String, String> hm = new HashMap<String, String>();
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
		
		/*
		// 1. 모든 key 조회
		Set<String> keys = hm.keySet();
		Iterator<String> ir = keys.iterator();
		while (ir.hasNext()) {
			String key = (String) ir.next();
			System.out.printf("%s=%s\n",key,hm.get(key));
		}
		
		// value hm.get(key)
		
		Collection<String> values = hm.values();
		Iterator<String> ir2 = values.iterator();
		while (ir2.hasNext()) {
			String value = ir2.next();
			System.out.printf("%s=%s\n",value);
		}
		*/
		
	}// main
}// class
