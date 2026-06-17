// ex of single level inheritance
package NEW;
class Lehnga{//parent class
	private String name;//private method
	private String Body;
	private String Fabric;
	private String Hairstyle;
	private int size;
	
	public Lehnga() {//default constructor
		super();//access
	}public Lehnga(String name,String Body,String Fabric,String Hairstyle,int size) {
		super();
		this.name=name;
		this.Body=Body;
		this.Fabric=Fabric;
		this.Hairstyle=Hairstyle;
		this.size= size;
	}
	public void displayLehnga() {
		System.out.println("lehnha information");
		System.out.println("name "+name);
		System.out.println("Body "+Body);
		System.out.println("Fabric "+Fabric);
		System.out.println("Hairstyle "+Hairstyle);
		System.out.println("size "+size);
	}
}class parameter extends Lehnga{
	private String Colour;
	private int Price;
	private String Work;
	private int Pattern;
	
	public parameter() {
		super();
	}public parameter(String name,String Body,String Fabric,String Hairstyle,int size, String Colour,int Price,String Work,int Pattern){
		super(name,Body,Fabric,Hairstyle,size);
		this.Colour=Colour;
		this.Price=Price;
		this.Work=Work;
		this.Pattern=Pattern;
	}public void displayparameter() {
		System.out.println("lehnha parameter");
		System.out.println("Colour "+Colour);
		System.out.println("Price "+Price);
		System.out.println("Work "+Work);
		System.out.println("Pattern "+Pattern);
	}
}public class Single11{
	public static void main(String[]args) {
		parameter obj =new parameter("Sharara","Apple","Satin","low bun",38,"Maroon",4000,"Embroydery",5);
		obj.displayLehnga();
		System.out.println();
		obj.displayparameter();
		
		
		
		
		
		
	}
}