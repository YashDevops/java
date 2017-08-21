
public class HealthyHamburger extends Hamburger {
	
	private String Healthyadditional1;
	private double Healthyprice1;
	
	
	private String Healthyadditional2;
	private double Healthyprice2;
	
	
	public HealthyHamburger( String meat, double price) {
		super("Healthy Burger", meat, price, "Brown Ryan");
	}

	public void Healthyham1(String name, double price){
		this.Healthyadditional1=name;
		this.Healthyprice1=price;
	
	}
	public void Healthyham2(String name, double price){
		this.Healthyadditional2=name;
		this.Healthyprice2=price;
	
	}

	public double itemizehamburger() {
		double healthyhamburgerprice =super.itemizehamburger();
		
		if (Healthyadditional1 !=null){
			healthyhamburgerprice += this.Healthyprice1;
			System.out.println("Added " + this.Healthyadditional1 + " for an extra " + this.Healthyprice1);
		}
		

		if (Healthyadditional2 !=null){
			healthyhamburgerprice += this.Healthyprice2;
			System.out.println("Added " + this.Healthyadditional2 + " for an extra " + this.Healthyprice2);
		}
	return healthyhamburgerprice;
	}
	
		
}
