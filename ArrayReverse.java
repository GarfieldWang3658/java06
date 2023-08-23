public class ArrayReverse{
	public static void main(String[] args) {
		int[]arr = {11,22,33,44,55,66};

		//通过找规律反转

		//规律
		//1、把arr【0】和arr【5】交换
		//2、把arr【1】和arr【4】交换
		//3、把arr【2】和arr【3】交换
		//4、一共交换3次 =arr.lengtrh/2
		//5、每次交换时对应下标 是arr[i]和arr[arr.length-1-i]


	

		int len = arr.length;

		for (int i =0;i<len/2 ;i++ ) {
	    
	    int temp =arr[len-1-i];			
		 
			arr[len-1-i]=arr[i];

			arr[i]=temp;




		}

		System.out.println("反转后的数组");

		for (int i = 0;i<arr.length ; i++) {
			System.out.print(arr[i]+"\t");
		}



	}
}