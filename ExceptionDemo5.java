package exception;

import java.io.FileWriter;
import java.io.IOException;
/*
 * finally:组合try...catch使用，用于释放资源等收尾工作，无论try...catch语句如何执行，finally的代码一定会执行
 * 
 * try{
 * 		有可能出现问题的代码;
 * }catch(异常对象){
 * 		处理异常;
 * }finally{
 * 		释放资源;
 * 		清理垃圾;
 * }
 */
public class ExceptionDemo5 {

	public static void main(String[] args) {
		//method();						//Command+Option+M	把一段代码生成到一个方法中
		FileWriter fw = null;
		try {
			fw = new FileWriter("/Users/zhengziniu/zzn.txt");
			fw.write("你好");
			System.out.println(2 / 0);
			fw.write("我在学Java");
			fw.flush();
			fw.close();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fw.flush();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private static void method() {
		try {
			System.out.println(2 / 1);
		}catch(ArithmeticException e) {
			System.out.println("除数不能为0");
		}finally {
			System.out.println("释放资源，清理垃圾");
		}
	}
}
