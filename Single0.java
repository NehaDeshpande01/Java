// single level inheritance
package NEW;
class Country{//parent class
	private String name;
	private String language;
	private int code;
	private double population;
	//default costructor accesses by super
public Country(){
	super();
}public Country(String name,String language,int code,double population){//parameteraised constructor access by this
	super();
	this.name=name;
	this.language=language;
	this.code=code;
	this.population=population;
}
public void displayCountry() {//to display output it is method
	System.out.println("Country Details");
	System.out.println("country name"+name);
	System.out.println("country language"+language);
	System.out.println("country code"+code);
	System.out.println("country population"+population);
}
}class State extends Country{//child class
	private String name1;
	private String language1;
	private double pop;
	private int States;
	 // child default constructor
	public State(){
		super();
	}public State (String name,String language,int code,double population,String name1,String language1,double pop,int states ){
		super(name,language,code,population);//to access parent parameters 
		this.name1=name1;
		this.language1=language1;
		this.pop=pop;
		this.States=states;
	}public void displayState() {
		System.out.println("State Details");
		System.out.println("State name:"+name1);
		System.out.println("language :"+language1);
		System.out.println("population:"+pop);
		System.out.println("States"+States);
	}
}public class Single0{//main class and method
	public static void main(String[]args) {
		State obj = new State("India","Hindi",91,140000000,"Maharashtra","Marathi",3600000,36);
		obj.displayCountry();
		System.out.println();
		obj.displayState();
	}
}