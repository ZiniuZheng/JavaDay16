package recurrence;
/*
 * 需求：求5的阶乘
 * 5! = 5 * 4 * 3 * 2 * 1;	//120
 * 5! = 5 * 4!;				//120
 * 		4! = 4 * 3!;		//24
 * 			3! = 3 * 2!		//6
 * 				2! = 2 * 1!	//2
 * 					1! = 1;	//1
 * 
 * 	n! = n * (n - 1)!
 * 
 * 	递归：把大问题拆成很多小问题，然后再把小问题拆成更小的问题
 * 			当我们把更小的问题解决了，小问题也解决了
 * 				随着小问题的解决，大问题也解决了
 * 	在方法本身不断的调用自己
 * 
 * 	递归注意事项：
 * 			递归一定要有出口，内存溢出
 * 			递归次数不宜过多，内存溢出
 * 
 * 	public void show(int n){//5
 * 		//出口
 * 		if(n == 0){
 * 			return;
 * 		}
 * 
 * 		show(n - 1);
 * 	}
 * 
 * 	从前有座山，山里有个庙，庙里有个老和尚，老和尚在给小和尚讲故事
 * 		从前有座山，山里有个庙，庙里有个老和尚，老和尚在给小和尚讲故事
 * 			从前有座山，山里有个庙，庙里有个老和尚，老和尚在给小和尚讲故事
 * 				从前有座山，山里有个庙，庙里有个老和尚，老和尚在给小和尚讲故事
 * 					从前有座山，山里有个庙，庙里有个老和尚，老和尚在给小和尚讲故事
 * 						...
 * 
 * 	学习编程...找工作...赚钱...娶媳妇...生娃娃
 * 		学习编程...找工作...赚钱...娶媳妇...生娃娃
 * 			学习编程...找工作...赚钱...娶媳妇...生娃娃
 * 				学习编程...找工作...赚钱...娶媳妇...生娃娃
 * 					学习编程...找工作...赚钱...娶媳妇...生娃娃
 * 					...
 */
public class RecurrenceDemo {

	public static void main(String[] args) {
		int result = jc(5);
		System.out.println(result); //120
	}
	
	//求一个数的阶乘
	public static int jc(int n) {
		//必须要有出口
		if(n == 1) {
			return 1;
		}else {
			return n * jc(n - 1);
		}
	}
}
