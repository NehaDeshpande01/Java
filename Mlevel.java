// multilevel inheritance ex of file manager
package NEW;
class FileManager{
	private String systemName;
	private int totalDrive;
	private String osType;
	//default constructor
	public FileManager() {
		super();
	}public FileManager(String systemName,int totalDrive,String osType){
		super();
		this.systemName=systemName;
	    this.totalDrive=totalDrive;
		this.osType=osType;
	}
public  void displayFileManager() {
	System.out.println("File manager details");
	System.out.println("systemname is: "+systemName);
	System.out.println("total drive is: "+totalDrive);
	System.out.println("os type is: "+osType);
    }
 }
class Drive extends FileManager{
	private String driveName;
	private int driveSize;
	private int Space;
	private String sType;
	private boolean isExternal;
	
	public Drive() {
		super();
	}
	
	public Drive(String systemName,int totalDrive, String osType, String driveName, int driveSize,int Space, String sType,
                 boolean isExternal) {
	    super(systemName,totalDrive,osType);
	    this.driveName=driveName;
	    this.driveSize=driveSize;
	    this.Space=Space;
	    this.sType=sType;
	    this.isExternal=isExternal;
	    }
	public void displayDrive() {
		System.out.println("Drive Details");
		System.out.println("drivename is: "+driveName);
		System.out.println("deive size is: "+driveSize);
		System.out.println("Space is: "+Space);
		System.out.println("sType is: "+sType);
		System.out.println("isExternal: "+isExternal);
		
	}
	}
class Folder extends Drive{
	private String fName;
	private String createdDate;
	private int files;
	private String ownerName;
	
	public Folder() {
		super();
	}
	public Folder( String systemName,int totalDrive, String osType, String driveName, int driveSize,int Space, String sType,
                 boolean isExternal,String fName,String createdDate,int files,String ownerName ) {
		super(systemName,totalDrive,osType, driveName, driveSize, Space, sType, isExternal);
		this.fName=fName;
		this.createdDate=createdDate;
		this.files=files;
		this.ownerName=ownerName;
		
	}

public void displayFolder() {
	System.out.println("Folde Name");
	System.out.println("folder name is:  "+fName);
	System.out.println("date is: "+createdDate);
	System.out.println("files is: "+files);
	System.out.println("owner name is: "+ownerName);
  }  
  } 
class Myfile extends Folder{
	private String Filename;
	private String Filetype;
	private double Filesize;
	private String modifiesDate;
	private boolean isReadonly;
	
	public Myfile() {
		super();
	}
	public Myfile(String systemName,int totalDrive, String osType, String driveName, int driveSize,int Space, String sType,
                 boolean isExternal,String fName,String createdDate,int files,String ownerName,String Filename,String Filetype,
                 double Filesize,String modifiesDate, boolean isReadonly){
		super( systemName,totalDrive,osType, driveName, driveSize, Space, sType, isExternal,fName,createdDate,files,
				ownerName);
		this.Filename=Filename;
		this.Filetype=Filetype;
		this.Filesize=Filesize;
		this.modifiesDate=modifiesDate;
		this.isReadonly=isReadonly;
		
	}
	public void displayMyfile() {
		System.out.println("File name is:  "+Filename);
		System.out.println("File type is:  "+Filetype);
		System.out.println("File size is:  "+Filesize);
		System.out.println("modifiesDate is:  "+modifiesDate);
		System.out.println("is Readonly:  "+isReadonly);
	}
}class Mulevel{
	public static void main(String[]args) {
		Myfile obj = new Myfile("MyLaptop",4,"Windows","N:",256,130,"Mfs",false,"Project","1/7/2025",5,"Mukesh Ambani","clgp"
				,"a",4.3,"25/7/2025",false);
		obj.displayFileManager();
		System.out.println();
		obj.displayDrive();
		System.out.println();
		obj.displayFolder();
		System.out.println();
		obj.displayMyfile();
	}
}