/*
	while循环：
		1、while循环的语法机制以及执行原理：
			语法机制：
				while(布尔语句)
				{
					Java语句;
				}
			执行原理：
				先判断布尔语句是否为true，在执行java语句
*/

public class WhileTest
{
	public static void main(String[] args)
	{
		//whiile 和 for 本质上一样，没有什么区别，只是写法不同
		for (int i =1; i<10;)
		{
			i++;
		}
		int i = 1; 
		while (i<10)
		{
			i++;
		}
	}
}
