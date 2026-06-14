package NEW;
public class f12{//pyramid of five numbers
	public static void main(String[]args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			//space
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}//1st part numbers
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}// 2nd part of num
			for(int j=2;j<=i;j++) {
				System.out.print(j);
			}System.out.println();
			
		}
	}
}