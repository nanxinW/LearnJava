/*
	关于java语言中的浮点型数据
		浮点型包括：
			float		4个字节
			double		8个字节

		float是单精度，double是双精度，double更加的精确（小数点后的位数更多）
		在java中提供了一种精度比double还要高的数据类型，这种专门使用在财务软件方面：java.math.BigDecimal(属于引用数据类型)
		float和double存储得都是近似值，因为有3.3333333.........这类存在。
		
		注意：任意一个浮点型数据都比整型大

		Java中规定，任何一个浮点型数据被默认当作double来处理。
		如果想让这个浮点型字面量被当作float类型来处理，那么请在字面量后面添加F/f
		1.0 那么1.0默认是double类型处理
		1.0F 这才是float类型（1.0f）
*/
public class FloatTest
{
	public static void main(String[] args)
	{
		//这个不存在类型转换
		//3.1415926是double类型
		//pi 是double类型
		double pi = 3.1415926;
		System.out.println(pi);

		//这个可以吗？
		//错误：不兼容的类型：从double类型转换到float类型可能会有损失
		//float f = 3.14；

		//以上代码如何修改？
		//第一种方式：在字面量后添加F/f
		// float f = 3.14f;

		//第二种是强制类型转换，但可能损失精度。慎用。
		float f = (float) 3.14;
		System.out.println(f);

	}
}
