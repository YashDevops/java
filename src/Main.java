
public class Main {

	public static void main(String[] args){
		Hamburger hamburger =new Hamburger("Basic", "Sausage", 12.34, "WhiteRoll");
		hamburger.addhamburger1("Tomatoes", 2.43);
		hamburger.addhamburger2("Carrot", 2.89);
		hamburger.addhamburger3("Cheese", 3.12);
		hamburger.addhamburger4("Lettuce", 1.89);
		System.out.println("Total Burger Price"+hamburger.itemizehamburger()+"\n");
	
	
		
		
		HealthyHamburger healthyHamburger =new HealthyHamburger("Grilled", 20.21);
		healthyHamburger.addhamburger1("Tomatoes", 2.31);
		healthyHamburger.addhamburger2("Lettuce", 2.13);
		healthyHamburger.addhamburger3("Cheeze", 2.13);
		healthyHamburger.Healthyham1("Mozerealla Grilled", 2.41);
		System.out.println("Total Burger cost will be"+healthyHamburger.itemizehamburger());
	
	}
}
