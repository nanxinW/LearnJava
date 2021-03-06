/**
*变量测试类1
*@author 王楠鑫
*@version 1.5 当前版本号
*@since 1.0   从这个版本开始 历史最初版本号
*/

/*
	1、什么是变量？
		变量就是内存中存储数据的最基本的单元。
		在java中任何数据都是有数据类型的，不同的数据类型在内存中分配的空间不同。
		比如 int这种整数类型，JVM会自动给int分配4个字节大小的空间，也就是32比特位大小。
		**1个字节=8个比特位bit，1个比特位就是一个0或1.注意：比特位是二进制位。
		变量三要素：数据类型、名字、数值

	
	2、变量怎么定义/声明？语法格式是什么？
		数据类型 变量名；

		***java 规定变量必须先声明，再赋值才能访问。不然会出现错误：可能尚未初始化变量；
	
	3、变量名注意事项
		1、同一个域中变量名不能重名
		2、与类型无关变量名不能重名
		3、一行可以同时声明多个变量。
	
	
*/

public class VarTest01
{
	/**
	*这是一个程序的入口
	*@param args是main方法的参数
	*/
	public static void main(String[] args){
		int age ;
		System.out.println(age);
		System.out.println(3.1415926);
	}

}

/*
	4、关于一个变量的分类
		变量根据出现的位置进行划分：
			在方法体当中声明的变量：局部变量
			在方法体之外，类体内声明的变量：成员变量
		注意：局部变量只在方法体中有效，方法体执行结束该变量的内存就释放了。
*/
class T1
{
	//这里可以定义一个成员变量
	int i = 100;
	public static void main(String[] args)
	{
		//局部变量k
		int k = 200;//main方法结束k内存空间释放。
	}
}

/*
	5、什么是变量的作用域？
		变量的有效范围。关于变量作用域记住一句话：出了大括号就不认识了。
		**所有的编程语言都有一个原则：就近原则。比如下面的T2里面运行输出的i是100，而不是300.


*/
class T2
{
	//成员变量
	int i = 300;
	public static void main(String[] args)
	{
		//局部变量
		int i = 100;//这个i的有效范围是main方法
	}
	public static void x()
	{
		//局部变量
		int i = 200;//这个i的有效范围是x方法，因为不在一个域中，所以不冲突。
	}
}
