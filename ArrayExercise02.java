public class ArrayExercise02{
	public static void main(String[] args) {

		//1、定义一个int数组
		//2、假定arr[0]是最大值，maxIndex=0，
		//3、从下标1开始遍历数组arr，如果max<当前元素，说明max不是真正最大值，
		//就把当前元素赋给max；maxindex=当前元素下标
		//4、当我们遍历这个数组arr后，max就是真正最大值，maxindex最大值对应的下标。

		int [] arr ={4,-1,9,10,23};

		int max = arr[0];//假定第一个元素就是最大值
		int maxIndex = 0;//记录元素下标


		for (int i =1;i<arr.length ;i++ ) {//从下标1开始遍历数组
			if (max < arr[i]) {//如果max<当前元素
				max = arr[i];//将max设置成当前元素
				maxIndex = i;
			}
			
		}System.out.println("最大值"+max+"最大值下标"+maxIndex);


	}
}