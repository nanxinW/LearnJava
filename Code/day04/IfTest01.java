/*
	if 语句的语法结构？
	 写法一：
		if (布尔语句){
			java语句；
		}
	 
	 写法二：
	 	if(布尔语句){
			java语句；
		}
		else{
			java语句；
		}
	 
	 写法三：
	 	if(布尔语句){
			java语句；
		}else if （布尔语句）{
			Java语句；
		}else if （布尔语句）{
			java语句；
		}
	 
	 写法四：
	 	if(布尔语句){
			java语句；
		}else if （布尔语句）{
			Java语句；
		}else if （布尔语句）{
			java语句；
		}else{
			java语句;
		}
	
	*注意：以上四种写法，凡是带有else分支的，一定可以保证有一个分支可以执行。

*/

/*
	业务要求：
		1、从键盘上接收一个人的年龄；
		2、年龄要求为【1-150】，其他只表示非法，需要提示非法信息。
		3、根据年龄来判断这个人属于生命的哪个阶段？
			【0-5】 婴幼儿
			【6-10】 少儿
			【11-18】 少年
			【19-35】 青年
			【36-55】 中年
			【56-150】 老年
		4、请使用if语句完成以上的业务逻辑。
*/
import java.util.Scanner;

public class IfTest01
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("请输入您的年龄：");
		int age = s.nextInt();
		System.out.println("您输入的年龄是："+age);
		/*
		if (age < 0 || age > 150)
		{
			System.out.println("您输入的年龄不合法！！");
		}
		else
		{
			System.out.print("您属于：");
			if (age <= 5)
			{
				System.out.print("婴幼儿");
			}
			else if (age <= 10)
			{
				System.out.print("少儿");
			}
			else if (age <= 18)
			{
				System.out.print("少年");
			}
			else if (age <= 35)
			{
				System.out.print("青年");
			}
			else if (age <= 55)
			{
				System.out.print("中年");
			}
			else
			{
				System.out.print("老年");
			}

		}
		*/
		String str = "老年";
		if (age < 0 || age > 150)
		{
			str = "您输入的年纪不合法！！";
		}else if (age <= 5)
		{
			str = "婴幼儿";
		}else if (age <= 10)
		{
			str = "少儿";
		}else if (age <= 18)
		{
			str = "少年";
		}else if (age <= 35)
		{
			str = "青年";
		}else if (age <= 55)
		{
			str = "中年";
		}
		System.out.println(str);

	}
}
