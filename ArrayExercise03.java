public class ArrayExercise03{
	public static void main(String[] args) {

		double[] hens = {3,5,1,3.4,2,50,13,15,12,6.5};

		double total = 0;
		double avg = 0;

		for (int i = 0 ;i<hens.length ;i++ ) {
			total += hens[i];
			avg =total/i;

			
		}System.out.println("总重量"+total+"平均重量"+avg);

		

		}
	}