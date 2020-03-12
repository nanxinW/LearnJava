/*
	1、整数能否直接赋值给char
	2、char x = 97；
		这个java语句是允许的，并且输出的结果是'a
		经过这个测试得到两个结论：
			1：当一个整型赋值给char类型变量的时候，会自动转换为char字符型，最终结果是一个字符。
			2：当一个整数没有超出byte short char的取值范围的时候，这个整数可以直接赋值给byte short char类型的变量。
*/

public class CharTest02
{
	public static void main(Sreing[] args)
	{
		char c1 = 'a';
		System.out.println(c1);

		//这里会做类型转化吗？
		//97是int类型
		//c2是char类型

		char c2 = 97;
		System.out.println(c2); //'a'

		//char 类型取值范围是：【0-65535】
		char c3 = 65535;
		System.out.println(c3);
		
		//错误：不兼容类型：从int类型转换到char可能会有损失
		//char c4 = 65536;

		//怎么解决以上问题？
		char c4 = (char)65536;
	}
}
