import java.lang.IllegalArgumentException;
public class Amount {
	
	private int amount=0;
	private int dollar = 0;
	private int quarter = 0;
	private int dime = 0;
	private int nickel = 0;
	private int pennie = 0;
	
	public Amount(double amt){
		amount=(int)(amt*100);
		
		if(amt<0){
			throw new IllegalArgumentException("Amount should be positive.");
		}
		
		if(amt>0){
	
			dollar = amount/100;
			quarter = (amount-dollar*100)/25;
			dime = (amount - dollar*100 - quarter*25)/10;
			nickel = (amount - dollar*100 - quarter*25 - dime*10)/5;
			pennie = (amount - dollar*100 - quarter*25 - dime*10 - nickel*5);
		}
	}

	public int dollars(){
		
		return dollar;
	}
	
	public int quarters(){
		
		return quarter;
	}
	
	public int dime(){
		
		return dime;
	}
	
	public int nickels(){
		
		return nickel;
	}
	
	public int pennies(){
		
		return pennie;
	}

}
