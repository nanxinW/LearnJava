/*
	1、for 循环的语法机制及其运行原理？
		语法机制：
			for（初始化表达式; 条件表达式; 更新表达式）{
				循环体；//循环体由java语句构成
			}
			注意：初始化表达式最先执行，并且在整个 循环中 只执行一次
				  条件表达式结果必须是一个布尔类型
		执行原理：
			1、首先执行初始化表达式，然后执行条件表达式进行判断是否为true，
			   true则执行循环体。、
			2、循环体执行完后，执行更新表达式，然后在执行条件表达式判断是否为true，是则执行循环体。。。。。。
*/

/*
	业务要求：
		使用for循环，实现1-100的所有奇数求和
*/

public class ForTest01
{
	public static void main(String[] args)
	{
		int sum = 0;
		/*
		for (int i = 1; i<101; i++ )
		{
			if (i % 2 != 0)
			{
				sum+=i;
			}
		}
		*/
		for (int i = 1;i<100 ;i+=2 )
		{
			sum+=i;
		}
		//System.out.println("1");
		System.out.println(sum);
	}
}
