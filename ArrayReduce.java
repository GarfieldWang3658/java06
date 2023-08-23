import java.util.Scanner;
public class ArrayReduce{
	public static void main(String[] args) {

		Scanner myScanner=new Scanner(System.in);
		
		int[] arr = {1,2,3,4,5};


		do{

		int j = 1;

		int[] arrNew = new int[arr.length-j];

		for (int i = 0;i<arrNew.length ;i++) {


			arrNew[i]=arr[i];
			j++;
		
}
		arr=arrNew;

			System.out.println("最后的元素为"+arr[arr.length-1]);

			System.out.println("请确定是否继续 y/n");

 		    char key = myScanner.next().charAt(0);
	        
	        if (key=='n') {break;}
	} while (arr.length>1);
			System.out.println("不能再缩减");	
}
}
