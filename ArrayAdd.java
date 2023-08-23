public class ArrayAdd{
	public static void main(String[] args) {
		int[]arr={1,2,3};

		//思路
		//1、定义初始数组
		//2、定义一个新的数组 int[]arrNew = new int [arr.length];
		//3、遍历arr 数组，依次将arr的元素拷贝到 arrNew数组
		//4、将4赋给arrNew[arrNew.length-1]=4,把4赋给arrNew最后一个元素
		//5、让arr指向arrNew；原来arr的数组就被销毁了。

		
		int[]arrNew = new int[arr.length+1];


			for (int i = 0 ;i < arr.length ;i++) {
				
				arrNew[i] = arr[i];
			}

			arrNew[arrNew.length-1]=4;

			arr=arrNew;

			System.out.println("arr扩容后的元素情况。");

			for (int i =0 ;i<arr.length ;i++ ) {
				
			System.out.print(arr[i]+"\t");

		}
		

	}


			
		}
	