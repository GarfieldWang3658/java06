public class Array01{
	public static void main(String[] args) {
		
		//思路
		//定义6个变量，加起来去的总体重，在求出平均体重。


		// double hen1 = 3;
		// double hen2 = 5;
		// double hen3 = 1;
		// double hen4 = 3.4;
		// double hen5 = 2;
		// double hen6 = 50; 

		// //定义六个double 变量，求和，得到总体重
		// //平均体重= 总体重/6

		// double totalWeight =hen1+hen2+hen3+hen4+hen5+hen6;

		// double avgWeight = totalWeight/6;
		// System.out.println("总体重="+totalWeight+"平均体重="+avgWeight);

		//传统实现的方式问题，用单独的变量，没灵活性、复杂、效率低
		//使用数组 解决
		
		//数组解决
		//定义一个数组

		double totalWeight = 0;
		double[] hens = {3,5,1,3.4,2,50};
		System.out.println("===使用数组解决===");
		//java 可以通过数组名.length 得到数组的大小（长度）；
		System.out.println("数组的长度="+hens.length);
		//1、double[]表示是double类型的数组，数组名：hens
		//2、{。。。。}表示数组的值/元素。依次表示数组的第几个元素
		//遍历数组得到数组的所有元素的和，使用for循环。

		for (int i = 0;i<hens.length;i++ ) {
			//System.out.println("第"+(i+1)+"个元素的值="+hens[i]);

		//1、可与通过 hens[下标]来访问数组的元素；
		//	下标是从0开始编号的，比如第一个元素就是hens[0]
		//  第2个元素就是hens[1],依次类推
		//2、通过for循环，就可以循环的访问数组的元素/值
		//3、使用一个变量 totalweight 将各个元素累积

		totalWeight += hens[i];
	}

		System.out.println("总体重"+totalWeight+"平均体重="+(totalWeight/hens.length));

			

	}
}