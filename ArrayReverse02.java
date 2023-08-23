public class ArrayReverse02{
	public static void main(String[] args) {
		
		int [] arr={11,22,33,44,55,66};

		//思路
		//1、先创建一个新的数组

		//2、逆序遍历arr，将每个元素拷贝到arr2的元素中
		//3、建议增加个一个循环变量j->0->5

			int[] arr2 = new int[arr.length];
			//逆序遍历arr

		for (int i = arr.length-1,j=0;i>=0 ;i--,j++ ) {
			
			arr2[j]=arr[i];

			
		}
		//4、当For循环结束，arr2 就是一个逆序的数组
		//5、让arr 指向arr2的数据空间，此时arr原来的数据空间就没有变量引用使用了，
		//会被当作垃圾销毁。
		arr = arr2;

		for (int i = 0;i<arr.length ;i++ ) {
			
		

		System.out.print(arr[i]+"\t");
	}

	}
}