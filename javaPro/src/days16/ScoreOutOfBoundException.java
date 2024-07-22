package days16;

public class ScoreOutOfBoundException extends RuntimeException{
	
	private static final long serialVersionUID = -5681662120848520969L;
	// 예외 코드 번호: 필드
	private final int ERROR_CODE;
	
	
	
	public int getERROR_CODE() {
		return ERROR_CODE;
	}

	public ScoreOutOfBoundException(String message) {
		this(1000,message);
	}

	public ScoreOutOfBoundException (int error_code, String message) {
		super(message);
		this.ERROR_CODE = error_code;
	}

}
