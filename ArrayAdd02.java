import java.util.Scanner;
public class ArrayAdd02{
	public static void main(String[] args) {
		int[]arr={1,2,3};

		//思路
		//1、定义初始数组
		//2、定义一个新的数组 int[]arrNew = new int [arr.length];
		//3、遍历arr 数组，依次将arr的元素拷贝到 arrNew数组
		//4、将4赋给arrNew[arrNew.length-1]=4,把4赋给arrNew最后一个元素
		//5、让arr指向arrNew；原来arr的数组就被销毁了。
		//6、创建一个Scanner可以接受用户输入
		//7、因为用户什么时候退出，不确定，使用do while循环+break来控制。

		Scanner myScanner = new Scanner(System.in);

		int[]arrNew = new int[arr.length+1];

		do{
			for (int i = 0 ;i < arr.length ;i++) {
				
				arrNew[i] = arr[i];
			}

			System.out.println("请输入需要添加的元素");

			int addNum =myScanner.nextInt();

			arrNew[arrNew.length-1]=addNum;

			arr=arrNew;

			System.out.println("arr扩容后的元素");

			for (int i =0 ;i<arr.length ;i++ ) {
				
			System.out.print(arr[i]+"\t");

		}

		System.out.println("");


			System.out.println("请确定是否继续添加 y/n");

			char key = myScanner.next().charAt(0);

			if (key == 'n') {//如果输入n就退出
				break;
				
			}


	}while(true);


			System.out.println("你退出了添加");


			
		}
	}