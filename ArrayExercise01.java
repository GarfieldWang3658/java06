public class ArrayExercise01{
	public static void main(String[] args) {

		//思路
		//1、定义一个char数组
		//2、因为 ‘A’+1 =‘B’，所以使用for循环符值
		//3、使用for循环访问所有元素
		char [] alphabet;
		alphabet =new char[26];
		

		for (int i = 0;i < alphabet.length;i++ ) {
		 alphabet[i] =(char)('A' + i);//需要强制转换	
		
		}

		System.out.println("====数组=====");
		for (int  i = 0; i < alphabet.length;i++ ) {
			 System.out.println(alphabet[i]);
		}

	}
}