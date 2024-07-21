package exception;

import java.io.FileWriter;
import java.io.IOException;
/*
 * 异常的分类：
 * 		运行时期异常：RuntimeException的子类就是运行时期异常，在编译时期可以自由选择处理或者不处理
 * 		编译时期异常：是Exception的子类，非RuntimeException的子类，在编译时期必须处理
 */
public class ExceptionDemo6 {

	public static void main(String[] args) throws IOException {
		System.out.println(2 / 0);
		String s = null;
		System.out.println(s.length());
		
		FileWriter fw = new FileWriter("/Users/zhengziniu/zzn.txt");
	}
}
