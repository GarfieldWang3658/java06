public class ArrayDetail{
	public static void main(String[] args) {
		//数组是多个相同类型的数据组合，实现对这些数据的统一管理。
		//int[]arr1 = {1,2,3,60};数据类型组合实现数据的统一管理。
		double[]arr2 ={1.1,2.2,3.3,60.6,100};//int->double.类型兼容
		//数据中的元素可以是元素可以是任何数据类型，包括基本类型和引用类型，但不能混用。
		String[]arr3 ={"北京","jack","milan"}; 
		short[]arr4 = new short[3];//相当于内存中存放了3个0；

		for (int i= 0;i < arr4.length ;i++ ) {
			System.out.println(arr4[i]);
		}

	}
}