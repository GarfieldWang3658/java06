public class TwoDimensionalArray03{
	public static void main(String[] args) {

		int arr[][];
		arr = new int[3][];
		
		//创建二维数组，一个有3个一维数组的二维数组，
		//但每个一维数组还没有开空间。
		
		for (int i =0;i<arr.length ;i++ ) {//遍历每个一维数组
			
			//1、给每个一维数组开空间
			
			arr[i]=new int[i+1];

			//2、给每个一维数组。的每个元素 赋值。

			for (int j=0;j<arr[i].length ;j++ ) {
				arr[i][j]=i+1;
				System.out.print(arr[i][j]+"\t");

			}
			System.out.println();



			
		}



		}
	}