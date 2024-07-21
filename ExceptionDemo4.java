package exception;
/*
 * Throwable的常用方法：
 * 		String getMessage()
 * 		String toString()
 * 		void printStackTrace()
 */
public class ExceptionDemo4 {

	public static void main(String[] args) {
		try {
			System.out.println(2 / 0);
		} catch(ArithmeticException e) {
			//String getMessage(): 原因
			System.out.println(e.getMessage());
			
			//String toString(): 类型和原因
			System.out.println(e.toString());
			
			//void printStackTrace(): 类型、原因和位置
			e.printStackTrace();
		}
	}
}
