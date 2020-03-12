/*
	逻辑运算符：
		&	逻辑与 （可以翻译成并且）
		|	逻辑或 （可以翻译成或者）
		！	逻辑非 （取反）
		&&	短路与
		||	短路或

		非常重要:
			逻辑运算符两边要求都是布尔型，并且最终的运算结果也是布尔型。
		
		讲解重点：短路与 && 和 短路或 ||
*/
public class OperatorTest01
{
	public static void main(String[] args)
	{
		/*
			关于短路与 && 和 逻辑与 & 有什么区别？
				首先这个两个运算符的运算结果没有任何区别，完全相同。
				只不过“短路与&&”会发生短路现象。

			什么是短路现象？
				表达式右边不执行，这种现象叫做短路现象。
		*/
		System.out.println(true & true);//true
		System.out.println(true & false);//false
		System.out.println(false & false);//false

		System.out.println(true && true);//true
		System.out.println(true && false);//false
		System.out.println(false && false);//false

		//接下来解释一下什么是短路现象
		 int x = 10;
		 int y = 11;
		 //左边的x>y表达式的结果已经是false了，其实整个表达式的结果已经确定了是false
		 //按道理来说右边的表达式不应该执行。
		 System.out.println(x>y & x > y++);

		 //通过这个测试得出： X > y++ 这个歌表达式执行了
		 System.out.println(y) //12

		 //测试短路与&&
		 int m = 10;
		 int n = 11;
		 System.out.println(m > n && m > n++);
		 System.out.println(n)//11
	}
}
