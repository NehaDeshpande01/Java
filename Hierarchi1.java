package NEW;
class Hierarchi1{
	public static void main(String[]args) {
		Bank bank = new Bank("Ramesh",123456789L,"ABC123",2345);
		GooglePay gPay = new GooglePay(" ganesh","kumar","ganesh@123","pune","23/7/2001","3456","male",97660560967L,"ganesh",67566567554456L,bank,
				"ganesh@upiId");
		gPay.displayGooglePay();
		System.out.println();
		gPay.getBank().displayBank();
		System.out.println();
		gPay.displayGoogle();
		System.out.println("*******************************************");
		GoogleClassroom gClass = new GoogleClassroom("Ramesh","Kumar","ramesh@123","Mumbai","12/6/2001","56778","male",4545434L,"Ramesh",55354,
				"java",6,"http.java.in",4);
		gClass.displayGoogleClassroom();
		System.out.println("**********************************************");
		gClass.displayGoogle();
		System.out.println("************************************************");
		GoogleDrive gDrive = new GoogleDrive("Neha","Deshpande","neha123@gmail.com","sangola","24/6/2003","54653","Female",443465534L,"new","trip",
				"mahabaleshwar","5/6/2016");
		gDrive.displayGoogleDrive();
		System.out.println("***************************");
		gDrive.displayGoogle();
	}
}class Google{
	private String firstName;
	private String lastName;
	private String email;
	private String address;
	private String dob;
	private String password;
	private String gender;
	private long contact; 
	public Google() {
		super();
	}public Google( String firstName,String lastName,String email,String address,String dob,String password,String gender,long contact   ){
		super();
		this.firstName=firstName;
		this.lastName=lastName;
		this.email=email;
		this.address=address;
		this.dob=dob;
		this.password=password;
		this.gender=gender;
		this.contact=contact;
		
	}public void displayGoogle() {
		System.out.println("firstName: "+firstName);
		System.out.println("lastname: "+lastName);
		System.out.println("email: "+email);
		System.out.println("address: "+address);
		System.out.println("dob: "+dob);
		System.out.println("password: "+password);
		System.out.println("gender: "+gender);
		System.out.println("contact: "+contact);
	}
}class Bank{
	private String holderName;
	private long accountNum;
	private String ifsccode;
	private int pin;
	public Bank() {
		super();
	}public Bank(String holderName,long accountNum,String ifsccode,int pin ){
		super();
		this.holderName=holderName;
		this.accountNum=accountNum;
		this.ifsccode=ifsccode;
		this.pin=pin;
	}public void displayBank() {
		System.out.println("holderName: "+holderName);
		System.out.println("accountnum: "+accountNum);
		System.out.println("ifsccode: "+ifsccode);
		System.out.println("pin: "+pin);
	}
}class GooglePay extends Google{
	private String name;
	private long phoneNum;
	private Bank bank;
	private String upiId;
	public GooglePay() {
		super();
	}
	public GooglePay(String firstName,String lastName,String email,String address,String dob,String password,String gender,long contact,
			 String name, long phoneNum,Bank bank,String upiId){
		super(firstName,lastName, email,address,dob, password, gender,contact);
		this.name=name;
		this.phoneNum=phoneNum;
		this.bank=bank;
		this.upiId=upiId;
	}public void displayGooglePay() {
		System.out.println("name: "+name);
		System.out.println("phoneNum: "+phoneNum);
		System.out.println("bank: "+bank);
		System.out.println("upiId: "+upiId);
	}public void addBank( String holderName,long accountNum,String ifsccode,int pin ) {
		bank = new Bank(holderName,accountNum,ifsccode,pin);
	}public Bank getBank() {
		return bank;
	}
}class GoogleClassroom extends Google{
	private String name;
	private int code;
	private String subject;
	private int count;
	private String link;
	private int trainer;
	public GoogleClassroom() {
		super();
	}public GoogleClassroom(String firstName,String lastName,String email,String address,String dob,String password,String gender,long contact,
			 String name, int code,String subject,int count,String link,int trainer){
		super(firstName,lastName, email,address,dob, password, gender,contact);
		this.name=name;
		this.code = code;
		this.subject=subject;
		this.count=count;
		this.link=link;
		this.trainer=trainer;
	}public void displayGoogleClassroom() {
		System.out.println("name: "+name);
		System.out.println("code: "+code);
		System.out.println("subject: "+subject);
		System.out.println("count: "+count);
		System.out.println("link: "+link);
		System.out.println("trainer: "+trainer);
	}
}class GoogleDrive extends Google{
	private String Folder;
	private String File;
	private String subF;
	private String Date;
	public GoogleDrive() {
		super();
	}public GoogleDrive ( String firstName,String lastName,String email,String address,String dob,String password,String gender,long contact,
			String Folder,String File,String subF,String Date){
		super(firstName,lastName, email,address,dob, password, gender,contact);
		this.Folder=Folder;
		this.File=File;
		this.subF=subF;
		this.Date=Date;
	}public void displayGoogleDrive() {
		System.out.println("Folder: "+Folder);
		System.out.println("File: "+File);
		System.out.println("subFolder: "+subF);
		System.out.println("Date: "+Date);
	}
}