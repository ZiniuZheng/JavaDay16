package recurrence;

import java.io.File;
/*
 * 需求：输出指定目录下所有的java文件名（包含子目录）
 */
public class RecurrenceTest {

	public static void main(String[] args) {
		File f = new File("/Users/zhengziniu/eclipse-workspace/day16/src");
		method(f);
	}
	
	//输出指定目录下的所有java文件名（不包含子目录）
		public static void method(File file) {
			if(file.isDirectory()) {
				File[] files = file.listFiles();
				for(File f: files) {
					//判断是否是文件对象
					if(f.isFile()) {
						if(f.getName().endsWith(".java")) {
							System.out.println(f.getName());
						}
					}
				}
			}
		}
	//输出指定目录下的所有java文件名（包含子目录）
	public static void method2(File file) {
		if(file.isDirectory()) {
			File[] files = file.listFiles();
			for(File f: files) {
				//判断是否是文件对象
				if(f.isFile()) {
					if(f.getName().endsWith(".java")) {
						System.out.println(f.getName());
					}
				}else if(f.isDirectory()) {
					method2(f);
				}
			}
		}
	}
}
