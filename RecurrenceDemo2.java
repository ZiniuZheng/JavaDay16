package recurrence;
/*
 * 古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
 * 			小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死
 * 			问第二十个月的兔子对数为多少？
 * 
 * 1
 * 1
 * 2
 * 3
 * 5
 * 8
 * 13
 * 
 * 规律：除了第一个月和第二个月以外，其余每个月都是前两个月之和
 * 斐波那契数列
 */
public class RecurrenceDemo2 {
	private static int i;
	public static void main(String[] args) {
		int result = method(30); //832040
		System.out.println(result);
	}
	
	public static int method(int n) {
		//System.out.println(i++);
		//如果是第一个月，只有一对兔子
		if(n == 1) {
			return 1;
		}else if(n == 2) {
			//如果是第二个月，也只有一对兔子
			return 1;
		}else {
			//如果不是第一个月和第二个月，则兔子的数量是前两个月之和
			return method(n -1) + method(n - 2);
		}
	}
}
