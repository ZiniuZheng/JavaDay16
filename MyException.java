package exception;

public class MyException extends RuntimeException {
	
	public MyException() {
		super();
	}
	
	public MyException(String s) {
		super(s);
		System.out.println("自定义异常");
	}
}
