//example of multilevel university package Basic;
package NEW;
class University{
	private String Uname;
	private String quality;
	private String Infrastructure;
	private boolean TLR;
	
	public University() {
		super();
	}
	public University(String Uname,String quality,String Infrastructure,boolean TLR) {
		super();
		this.Uname=Uname;
		this.quality=quality;
		this.Infrastructure=Infrastructure;
		this.TLR=TLR;
	}
	public void displayUniversity() {
		System.out.println("University details");
		System.out.println("university name is: "+Uname);
		System.out.println("quality is:  "+quality);
		System.out.println("Infrastructure is: "+Infrastructure);
		System.out.println("university name is: "+TLR);
	}
}class College extends University{
	private String Cname;
	private String quality1;
	private String Location;
	private double Placement;
	private boolean isReaserch;
	private boolean seprateCurriculum;
	 
	public College() {
		super();
	}
	public College(String Uname,String quality,String Infrastructure,boolean TLR,String Cname,String quality1,
			String Location, double Placement, boolean isReaserch,boolean seprateCurriculum) {
		super( Uname, quality, Infrastructure, TLR );
		this.Cname=Cname;
		this.quality1=quality1;
		this.Location=Location;
		this.Placement=Placement;
		this.isReaserch=isReaserch;
		this.seprateCurriculum=seprateCurriculum;
	}public void displayCollege() {
		System.out.println("College details ");
		System.out.println("college name is: "+Cname);
		System.out.println("quality is: "+quality1);
		System.out.println("Location is: "+Location);
		System.out.println("Placement is: "+Placement);
		System.out.println("isreaserch is: "+isReaserch);
		System.out.println("seperate curriculun is: "+seprateCurriculum);
	}
	
}class Department extends College{
	private String Dname;
	private int Labs;
	private int projects;
	private int faculty;
	
	public Department() {
		super();
	}public Department(String Uname,String quality,String Infrastructure,boolean TLR,String Cname,String quality1,
			String Location, double Placement, boolean isReaserch,boolean seprateCurriculum,String Dname,int Labs,
            int projects,int faculty ){
		super( Uname, quality, Infrastructure, TLR ,Cname,quality1,Location,Placement,isReaserch,seprateCurriculum);

		this.Dname=Dname;
		this.Labs=Labs;
		this.projects=projects;
		this.faculty=faculty;
		
	}
	public void displayDepartment() {
		System.out.println("Department details ");
		System.out.println("Department name is: "+Dname);
		System.out.println("no of Labs is: "+Labs);
		System.out.println("no of projects is: "+projects);
		System.out.println("no of faculty is: "+faculty);
	}
}
class Professor extends Department{
	private boolean PHD;
	private boolean Disciplined;
	private double teachexperience;
	private String performance;
	
	public Professor() {
		super();
	}public Professor(String Uname,String quality,String Infrastructure,boolean TLR,
			String Cname,String quality1,String Location, double Placement, boolean isReaserch,boolean seprateCurriculum,
			String Dname,int Labs,int projects,int faculty,
			boolean PHD, boolean Disciplined, double teachexperience,String performance ){
		super(Uname, quality, Infrastructure, TLR ,Cname,quality1,Location,Placement,isReaserch,
				seprateCurriculum,Dname,Labs,projects,faculty);
		this.PHD=PHD;
		this.Disciplined=Disciplined;
		this.teachexperience=teachexperience;
		this.performance=performance;
		
	}public void displayProfessor() {
		System.out.println("About professor");
		System.out.println("PHD: "+PHD);
		System.out.println("is it Dicsiplined: "+Disciplined);
		System.out.println("teachingexperience is: "+teachexperience);
		System.out.println("Academic performance is: "+performance);
	}
	
}
class Mlevel1{
	public static void main(String[]args) {
		Professor obj = new Professor("Pune","Excellent","Old",true,"COEP","Better","Pune",98.9,true,true,"ENTC",32,100,15,true,true,5.5,"Good");
		obj.displayUniversity();
		System.out.println();
		obj.displayCollege();
		System.out.println();
		obj.displayDepartment();
		System.out.println();
		obj.displayProfessor();
	}
}