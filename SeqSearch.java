import java.util.Scanner;
public class SeqSearch{
	public static void main(String[] args) {
		//1、定义字符串数组
		//2、接收用户输入，遍历数组，逐一比较，如果发现有，则提示信息并break

		String[] names = {"白眉鹰王","金毛狮王","紫衫龙王","青翼蝠王"};
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("请输入名字");

		String findName = myScanner.next();

		int index = -1;

		for (int i= 0;i<names.length ;i++ ) {
			//比较字符串用 equals
			//如果要找到的名字就是当前元素
			//编程思想/技巧，一个经典的方法（index）


			if (findName.equals(names[i])) {
				System.out.println("恭喜你找到"+findName);
				System.out.println("下标="+i);
				//把i保存到index
				index=i;

				break;
			}

			}

			if(index == -1) {//没有找到
				System.out.println("sorry,没有找到"+findName);
				
			}
			
		}



	}