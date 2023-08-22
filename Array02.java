import java.util.Scanner;
public class Array02{
	public static void main(String[] args) {
		
		//循环输入5个成绩，保存到double 数组并输出

		//步骤
		//1、创建一个double数组，大小 5
		

		Scanner myScanner = new Scanner(System.in);

		double[] score;//声明数组，这是score是null
		score = new double[5];//分配内存空间
		//2、 循环输入

		for (int i= 0;i < score.length ;i++){

			System.out.println("请输入第" + (i+1) + "个元素的值");
			score[i] = myScanner.nextDouble();
		}

		//输出。遍历数组
		System.out.println("==数组的元素/值的情况如下：==");

		for (int i = 0;i < score.length ;i++ ) {

			System.out.println("第" + (i+1) + "个元素的值为" + score[i]);
			
		}




	}
}