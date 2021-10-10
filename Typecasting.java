public class Typecasting {

	public static void main(String args[]) {

		
		short old_age = 29;
		int new_age = old_age;
		System.out.println(old_age);
		System.out.println(new_age);

		int salary = 10000;
		double new_salary = salary;
		System.out.println(salary); 
		System.out.println(new_salary); 


		

		int cash = 20000;
		short new_cash = (short) cash;
		System.out.println(cash);
		System.out.println(new_cash);

		
		int money = 2000000;
		short new_money = (short) money;
		System.out.println(money);
		System.out.println(new_money); 

		float num = 20.95f;
		int my_num = (int) num;
		System.out.println(num); 
		System.out.println(my_num); 
	}
}

