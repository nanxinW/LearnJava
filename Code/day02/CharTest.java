/*
	1、字符型：
		char

		1、char占用2个字节
		2、char采用unicode编码方式
		3、char类型的字面量使用单引号括起来
		4、char可以存储一个汉字
	
	2、关于java中的转义字符：
		\表示转义。
		\t ---tab
		\n ---换行
		\u ---表示后面跟的是unicode编码,unicode编码是16进制的

		
*/
public class CharTest
{
	public static void main(String[] args)
	{	
		//char可以存储1个汉字吗？
		//可以的，汉字占用2个字节，java中的char类型占用2个字节，正好。
		char c1 = '中';
		char c2 = 'a';
		//'0'可以这个表示的是字符0,''中欧冠可以放单个数字
		char c3 = '0';
		//'1.08'不可以！！这是一个串
		//char c4 = '1.08' ---------X


		//---------------------------------------------------
		//编译器不会报错，属于一个字符。
		char c5 = '\t';
		// \的出现会将紧挨着的后面的字符进行转义。

		/*
		System.out.println() -----换行
		System.out.print()   -----不换行
		*/
		System.out.println("asdasfs\tfnakjfhaj");
		System.out.print("dasddv");
		System.out.println("sadasasdas");

		char x = '\u4e2d';
		System.out.println(x);

	}
}
