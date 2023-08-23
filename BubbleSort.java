public class BubbleSort{
	public static void main(String[] args) {
		//24,69,80,57,13
		//思路
		//1、一共五个元素
		//2、进行了四轮排序，可以看成是外层循环。
		//3、每一轮排序可以确定一个数的位置。
		//比如第一轮排序就确定最大数，
		//4、第二轮排序要确定第二大的数位置，依次类推
		//当进行比较时，如果前面的数小于后面的数，就交换
		//5、每一轮的比较在逐渐减少。 4->3->2->1
		//思路-》代码
		//将多论排序使用一个外层循环包起来即可。

		int[]arr ={24,69,80,57,13};
		int temp = 0;//用于交换的辅助变量。

		for (int i = 0;i< arr.length-1;i++ ) {
			
		

		for (int j =0;j<arr.length-1-i;j++) {
			//如果前面的数大于后面的数，就交换

			if (arr[j]>arr[j+1]) {
				temp = arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				
			}
			
		}
		System.out.println("\n==第"+(i+1)+"轮==");
		for (int j =0;j<arr.length;j++ ) {
		System.out.print(arr[j]+"\t");

			}

	// 	for (int j =0;j<arr.length-2;j++ ) {
	// 		//如果前面的数大于后面的数，就交换

	// 		if (arr[j]>arr[j+1]) {
	// 			temp = arr[j];
	// 			arr[j]=arr[j+1];
	// 			arr[j+1]=temp;
				
	// 		}
			
	// 	}
	// 	System.out.println("\n==第二轮==");
	// 	for (int j =0;j<arr.length;j++ ) {
	// 	System.out.print(arr[j]+"\t");
	// }


	// 	for (int j =0;j<arr.length-3;j++ ) {
	// 		//如果前面的数大于后面的数，就交换

	// 		if (arr[j]>arr[j+1]) {
	// 			temp = arr[j];
	// 			arr[j]=arr[j+1];
	// 			arr[j+1]=temp;
				
	// 		}
			
	// 	}
	// 	System.out.println("\n==第三轮==");
	// 	for (int j =0;j<arr.length;j++ ) {
	// 	System.out.print(arr[j]+"\t");

	// 	}

	// 	for (int j =0;j<arr.length-4;j++ ) {
	// 		//如果前面的数大于后面的数，就交换

	// 		if (arr[j]>arr[j+1]) {
	// 			temp = arr[j];
	// 			arr[j]=arr[j+1];
	// 			arr[j+1]=temp;
				
	// 		}
			
	// 	}
	// 	System.out.println("\n==第四轮==");
	// 	for (int j =0;j<arr.length;j++ ) {
	// 	System.out.print(arr[j]+"\t");
	}
	}
}