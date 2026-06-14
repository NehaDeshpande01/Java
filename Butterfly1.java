package NEW;
public class Butterfly1{
	public static void main(String[]args) {
		int n =5;
		for(int i=1;i<=n;i++) {//upper halh
			for(int j=1;j<=i;j++){//1st part
				System.out.print("*");
				
			}//space
			int space=2*(n-i);
			for (int j=1;j<=space;j++) {
				System.out.print(" ");
			}//2nd part
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}System.out.println();
		}
		  for(int i=n;i>=1;i--) {//lower halh
			for(int j=1;j<=i;j++){//1st part
				System.out.print("*");
				
			}//space
			int space=2*(n-i);
			for (int j=1;j<=space;j++) {
				System.out.print(" ");
			}//2nd part
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}System.out.println();
	}
}
}