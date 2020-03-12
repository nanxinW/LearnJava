/*
	break语句：
		1、break语句在哪里可以用？
			在两个地方可以用：
				第一个位置：switch语句当中，用于防止case穿透现象；
				第二个位置：用在for、while、do...while 语句当中终止循环。
		
		2、注意下面的例子，如果我想让指定循环结束可以如下代码展示
*/
public class BreakTest
{
	public static void main(String[] args)
	{
		a:for (int i = 1; i < 10; i++ )
		{
			b:for (int j = 1; j < 10; j++)
			{
				if (j == 5)
				{
					break a
				}
			}
		}
	}
}
