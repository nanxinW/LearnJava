/*
	最常用的整型数据：int
	在java语言中整数型字面量有4种表现形式：
		十进制：最常用
		二进制
		八进制
		十六进制
	
	在java中有一条非常中要的结论，必须记住：
		在任何情况下，整数型的“字面量/数据”默认被当做int类型处理。
		如果希望该变量被当做long类型来出里，需要在“字面量”后面添加L

	小容量可以直接赋值大容量，称为自动类型转换。
	大容量转化成小容量必须进行强制类型转换符,但除此之外：如果数本身没有超小容量的取值范围，则数值可以直接赋值。
*/

public class IntTest
{
	public static void main(String[] args)
	{
		//十进制
		int a = 10;
		System.out.println(a);
		
		//八进制
		int b = 010;
		System.out.println(b);

		//十六进制
		int c = 0x10;
		System.out.println(c);

		//二进制
		int d = 0b10;
		System.out.println(d);

		//100这个字面量默认被当做int类型处理。
		//不存在类型转换；
		int a2 = 100;

		//200这个字面量被默认当做int类型来处理
		//b这个变量是long类型，存在类型转换
		long b2 =200;

		//300L是long类型，这就不存在类型转换了
		long d2 = 300L;
		
		//不存在类型转换。100L是long类型字面量，x是long类型字面量。
		long x = 100L;
		
		//x是long类型，占用8个字节，而y变量是int类型，占用4个字节
		//大容量转化成小容量必须进行强制类型转换符。但强制类型转换可能存在精度损失。
		int y = (int)x;

		//分析：以下代码可以通过吗？
		//300 被默认当做是int类型
		// b 变量是byte类型
		//大容量转换成小容量，想要通过必须进行强制类型转换。虽然转换了 但存在精度损失。
		//300 这个int类型对应的二进制数据： 00000000 00000000 00000001 0010110
		//byte 占一个字节，砍掉前面3个字节，结果是：0010110 (44)
		byte e = (byte)300;
		System.out.println("输出e的结果：");
		System.out.println(e);

	}
}