
public class AmountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d = 11.56;
		Amount mnt = new Amount(d);
		
		System.out.println("amount is "+d);
		System.out.println("dollars are "+mnt.dollars());
		System.out.println("quarters are "+mnt.quarters());
		System.out.println("dimes are "+mnt.dime());
		System.out.println("nickels are "+mnt.nickels());
		System.out.println("pennies are "+mnt.pennies());
		
		System.out.println("------------------------------");
		
		d = 0;
		Amount mnt1 = new Amount(d);
		
		System.out.println("amount is "+d);
		System.out.println("dollars are "+mnt1.dollars());
		System.out.println("quarters are "+mnt1.quarters());
		System.out.println("dimes are "+mnt1.dime());
		System.out.println("nickels are "+mnt1.nickels());
		System.out.println("pennies are "+mnt1.pennies());
		
		System.out.println("------------------------------");
		
		d=-11.56;
		Amount mnt2 = new Amount(d);
		
		System.out.println(mnt1);

	}

}
