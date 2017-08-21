
public class Hamburger {

	private String name;
	private String meat;
	private double price;
	private String breadtype;
	
	private String additional1Name;
	private double additional1price;
	
	private String additional2Name;
	private double additional2price;
	
	private String additional3Name;
	private double additional3price;
	
	private String additional4Name;
	private double additional4price;
	public Hamburger(String name, String meat, double price, String breadtype) {
		super();
		this.name = name;
		this.meat = meat;
		this.price = price;
		this.breadtype = breadtype;
	}
	
	public void addhamburger1(String name , double price){
		this.additional1Name=name;
		this.additional1price=price;
		
	}
	
	public void addhamburger2(String name , double price){
		this.additional2Name=name;
		this.additional2price=price;
		
	}
	
	public void addhamburger3(String name , double price){
		this.additional3Name=name;
		this.additional3price=price;
		
	}
	
	public void addhamburger4(String name , double price){
		this.additional4Name=name;
		this.additional4price=price;
		
	}
	
	public double itemizehamburger(){
		
		double hamburgerprice = this.price;
		
		System.out.println(this.name+"hamburger with"+this.meat+"on "+this.breadtype+"is available for"+this.price);
		if (additional1Name!=null){
			hamburgerprice += this.additional1price;
			System.out.println(this.additional1Name+"added with an extra price of"+this.additional1price);
			
		}
		if (additional2Name!=null){
			hamburgerprice += this.additional2price;
			System.out.println(this.additional2Name+"added with an extra price of"+this.additional2price);
			
		}
		if (additional3Name!=null){
			hamburgerprice += this.additional3price;
			System.out.println(this.additional3Name+"added with an extra price of"+this.additional3price);
			
		}
		if (additional4Name!=null){
			hamburgerprice += this.additional4price;
			System.out.println(this.additional4Name+"added with an extra price of"+this.additional4price);
			
		}
		return hamburgerprice;
	}
	
}
