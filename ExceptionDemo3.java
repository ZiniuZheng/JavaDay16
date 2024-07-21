package exception;
/*
 * 如何处理多个异常：
 * 		可以使用多个try...catch语句
 * 		使用一个try和多个catch
 * 
 * 多个catch之间的顺序
 * 			多个catch之间可以有子父类
 * 			平级之间没有顺序关系
 * 			如果有子父类，父类异常必须放在后面
 */
public class ExceptionDemo3 {

	public static void main(String[] args) {
		try {
			String s = null;
			System.out.println(s.length());
			
			int[] arr = new int[5];
			System.out.println(arr[4]);
			
			int i = 10;
			System.out.println(i/0);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("数组越界异常");
		}catch(NullPointerException e) {
			System.out.println("空指针异常");
		}catch(Exception e) {
			System.out.println("异常");
		}
	}
}
