package exception;
/*
 * Exception in thread "main" java.lang.ArithmeticException: / by zero
	at day16/exception.ExceptionDemo.main(ExceptionDemo.java:23)
 * 我们在写代码的时候，经常出现的一些小问题，那么为了方便我们处理这些问题，java为我们提供了异常机制
 * 
 * 异常包含了错误的类型、原因以及位置
 * 
 * 异常：不正常，我们在代码的时候出现的编译或者运行时的错误
 * 
 * 异常的体系结构：
 * 		Throwable（最顶层）
 * 				Exception:可以处理的问题
 * 				Error:出现的不能够处理的严重问题
 * 
 * 电脑坏了：
 * 		系统中毒：重装系统就可以了 (Exception)
 * 		主板坏了：买一台新的 (Error)
 */
public class ExceptionDemo {

	public static void main(String[] args) {
		int a = 10 / 0;
		System.out.println(a);
	}
}
