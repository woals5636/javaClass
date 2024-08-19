package days21;

public class Ex01 {
//	enum Direction{	EAST, SOUTH, WEST, NORTH }
	enum Direction{
		EAST(100, "▶"), SOUTH(200, "▼"), WEST(300, "◀"), NORTH(400,"▲") ;
		
		private int value;
		private String symbol;
		
		Direction(int value){
			this.value = value;
		}
		
		Direction(int value, String symbol){
			this.value = value;
			this.symbol = symbol;
		}
		
		public int getValue() {
			return this.value;
		}
		
		public String getSymbol() {
			return this.symbol;
		}
		
	}
	
	/*
	 * 컴파일러가 클래스 변환
	 * class Direction extends Enum{
	 * 		static final Direction EAST = new Direction();
	 * 
	 * 		private String name;
	 * 		public String name(){
	 * 			return this.name;
	 * 		}
	 * 
	 * 		private int ordinal;
	 * 		public int ordinal(){
	 * 			return this.ordinal;
	 * 		}
	 * }
	 * 
	 * 
	 * 
	 * */
	public static void main(String[] args) {

//		System.out.println(Direction.EAST);	//	"EAST"
//		System.out.println(Direction.EAST.toString());	//	"EAST"
//		System.out.println(Direction.EAST.name());//	"EAST"
//		System.out.println(Direction.EAST.ordinal());	//	0	index

		Direction[] dirArr = Direction.values();
		for (Direction dir : dirArr) {
			System.out.println(dir.name() + "/" + dir.ordinal() + "/" + dir.getSymbol() + "/" + dir.getValue());
		}

	}// main
}// class
