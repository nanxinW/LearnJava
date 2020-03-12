/*
	业务要求：
		使用for循环实现九九乘法表
*/

public class ForTest02
{
	public static void main(String[] args)
	{
		int i ,j;
		for (i =1; i<10 ;i++ )
		{
			for (j = i;j<10 ;j++ )
			{
				System.out.println(i);
				System.out.println(j);
				System.out.println(i*j);
			}
		}
	}
}
