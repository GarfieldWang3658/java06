public class ArrayAssign{
	public static void main(String[] args) {
		
		//基本数据类型的分配机制
		//只拷贝，n2的数据变化不会影响n1的值

		int n1 = 10;
		int n2 = n1;

		//数组在默认情况下是引用传递，赋值方式为引用传递
		//传递的是一个地址。
		//arr2的变化会影响到arr1 

		int[] arr1 = {1,2,3};
		int[] arr2 = arr1;//把arr1 赋给arr2
		arr2[0]=10;

		for (int i =0;i<arr1.length ;i++ ) {
			System.out.println(arr1[i]);
		}




	}
}