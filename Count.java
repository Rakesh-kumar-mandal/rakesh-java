public class Count {

	public static void main(String[] args) {
		
		int num = 263748874;
		int count = 0;
		
		if(num == 0) {
			System.out.println(1);
		}
		else {
			for(int j = num; j > 0; j /= 10) {
				count++;
			}
			System.out.println("Number of digits : "+count);
		}

	}

}