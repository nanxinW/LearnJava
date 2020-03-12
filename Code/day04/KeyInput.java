/*
	1、输出信息到控制台：
		System.out.println(...);
	
	2、在java中怎么接收键盘的输入呢？
		代码如下
		有两种方式创建键盘扫描器
			1：java.util.Scanner s = new java.util.Scanner(System.in)
			2：在class前 先导入import java.util.Scanner
				在class内就可以直接写 Scanner s = new Scanner(System.in);
*/

public class KeyInput
{
	public static void main(String[] args)
	{
		//创建一个键盘扫描器对象
		java.util.Scanner s = new java.util.Scanner(System.in);

		//接收用户的输入，从键盘上接受一个int；类型的数据
		//代码执行到这里的时候，会停下来，等待用户输入
		//用户可以从键值上输入一个整数，然后回车，回车之后，userInputNum就有数值了
		//userInputNum是接收键盘数据的
		int userInputNum = s.nextInt();
		System.out.println("您输入的数字是："+ userInputNum);

		//s.next()可以接收字符串
		String str = s.next();
		System.out.print(str);
	}
}
