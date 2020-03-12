/*
	switch语句：
		1、switch语句的语法格式：
			switch(值){
			case 值1：
				java语句;
				java语句;
				break;
			case 值2:
				java语句;
				java语句;
				break;
			......
			default:
				java语句;
			}
		以上是一个完整的switch语句，其中break语句和default分支也不是必须的。

		2、switch语句支持的值有哪些？
			支持int类型和String类型。
			但一定要注意JDK的版本，在JDK8之前不支持String类型，只支持int。当值为byte short char 类型时可以自动转换成int型。
		
		3、执行原理
			switch语句中“值”与“值1”、“值2”比较的时候会使用“==”进行比较。
			先“值”与“值1”进行比较，如果相同，则执行该分支中的java语句，遇到“break”语句后，switch语句结束了。
			如果不相同，则“值”与“值2”继续进行比较，然后遇到“break”就结束。
			***注意：如果分支执行了，但是该分支中没有“break”语句，此时会出现break击穿现象，
			   比如"值" == “值1”执行第一个case分支，但是由于没有brake语句，所以会直接执行第二个case语句中的内容
			   以此类推下去。
			***case 合并：
				switch(值){
				case 值1：case 值2：case 值3：-------》此处就是case合并问题
					java语句;
					java语句;
					break;
				case 值4:
					java语句;
					java语句;
					break;
				......
				default:
					java语句;
				}
				
*/

/*
	业务要求：
		1、系统接收一个学生的考试成绩，根据考试成绩输出成绩的等级。

		2、等级：
			优：90-100
			良：80-90
			中：70-80
			及格：70-60
			不及格：0-60
*/

public class SwitchTest01
{
	public static void main(String[] args)
	{
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入分数：");
		double score = s.nextDouble();
		if (score < 0 || score > 100)
		{
			System.out.println("非法输入！！");
			return;
		}
		String str = "不及格";
		int grade = (int)(score/10);//95.5/10结果是9.55,强制转为int后为9
		switch (grade)
		{
		case 10: case 9 :
			str = "优";
			break;
		case 8:
			str = "良";
			break;
		case 7:
			str = "中";
			break;
		case 6:
			str = "及格";
			break;
		}
		System.out.println(str);
	}
}
