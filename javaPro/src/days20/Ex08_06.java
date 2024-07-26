package days20;

import java.util.ArrayList;

/**
 * @author jam
 * @date 2024. 7. 26. - 오후 3:42:39
 * @subject	<? extends T>
 * @content <? super T>
 *			<?> == <? extends Object>
 *			? : 와일드 카드
 */
public class Ex08_06 {

	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox<>();
		FruitBox<Apple> appleBox = new FruitBox<>();
		FruitBox<Grape> grapeBox = new FruitBox<>();

 // Juice juice	 =	 Juicer.makeJuice(fruitBox);
 //		Juice juice	 =	 Juicer.makeJuice(appleBox);
		Juice juice	 =	 Juicer.makeJuice(grapeBox);


	} // main

} // class

//과일
class Fruit extends Object{
	@Override
	public String toString() {
		return "Fruit";
	}
}
//과일<-사과
class Apple extends Fruit{
	@Override
	public String toString() {
		return "Apple";
	}
}

//과일<-포도
class Grape extends Fruit{
	@Override
	public String toString() {
		return "Grape";
	}
}

// 제네릭 클래스
class Box5<T>{
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {  this.list.add(item); }
	int size() { return this.list.size(); }
	T get(int i) { return this.list.get(i); }
	@Override
	public String toString() { return  this.list.toString();  }
}

// 제한된 제네릭 클래스
class FruitBox<T extends Fruit> extends Box5<T>{
	//
}

// 일반 클래스 - 쥬스
class Juice{

}
// 과일(사과,포도) 상자로 부터 쥬스를 만드는 기기
class Juicer{

	/*
	//static Juice makeJuice( FruitBox<?> box ) {
	static Juice makeJuice( FruitBox<? extends Fruit> box ) {
		return new Juice();
	}
	*/
	// 위의  static 메서드(makeJuice)를 제네릭 메서드로 수정.
	//[제네릭 메서드]
	//   ㄴ 메서드의 선언부에 제네릭 타입이 선언된 메서드를
	//      제네릭 메서드
	//   ㄴ 선언 형식
	//    접근지정자 static <T> 리턴자료형 제네릭메서드명(매개변수..){
    //     }
	static <T extends Fruit> Juice makeJuice( FruitBox<T> box ) {
		return new Juice();
	}

	/*
	 *  제네릭 타입의 매개변수는 오버로딩이 성립되지 않는다.
	 *  문제점 ?
	 *  해결 방안 ?             ? 와일드 카드 사용
	 *                          ? == 모든 타입(Object) 같은 의미
	static Juice makeJuice( FruitBox<Fruit> box ) {
		return new Juice();
	}
	static Juice makeJuice( FruitBox<Apple> box ) {
		return new Juice();
	}
	static Juice makeJuice( FruitBox<Grape> box ) {
		return new Juice();
	}
	*/

}

// 제네릭 메서드 예제
/*
 * public static void printAll(ArrayList<? extends Product> list,
 *                             ArrayList<? extends Product> list2)
 * {
 * }
 *
 * public static <T extends Product> void printAll(ArrayList<T> list,
 *                             ArrayList<T> list2)
 * {
 * }
 *
 *               <T extends Comparable<? super T>>
 *
 */


