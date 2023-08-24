public class TwoDimensionalArray01{
	public static void main(String[] args) {
		
		//1、从定义形式上来看，int[][]
		//二维数组的元素为一个一维数组。
		//2、可以这样理解，原来的一唯数组的每个元素是一组数组，就构成二维数组

		//关键概念
		//1)
		System.out.println("二维数组的元素统计="+arr.length);

		//2)二维数组的每个元素是一维数组，所以如果需要得到每一个一维数组的值
		//需要再次遍历
		//3）访问第(i+1)个一维数组的第j个值 == arr[i][j]
		//举例访问，第3个一维数组的第4个值，arr[2][3]

		System.out.println("第3个一维数组的第4个值"+arr[2][3]);



		int[][] arr={{0,0,0,0,0,0},{0,0,1,0,0,0,},{0,2,0,3,0,0},{0,0,0,0,0,0}};

		for (int i = 0;i<arr.length ;i++ ) {//遍历二维数组的每个元素
			//遍历二维数组的每个元素（数组）
			for (int j = 0;j<arr[i].length ;j++ ) {
				//1、arr【ℹ】，表示二维数组的第i+1个元素。比如arr【0】，二维数组的第一个元素。
				//2、arr[i].length 得到对应的每个一维数组的长度

				System.out.print(arr[i][j]+"\t");//输出了一维数组
				
			}
			System.out.println("");
		}



	}
}