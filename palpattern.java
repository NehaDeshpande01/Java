package NEW;
public class palpattern{
	public static void main(String[]args) {
		int n=5;
		for(int i =1;i<=n;i++) {
			//spaces
			for (int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}// 1 st half numbers
			for(int j=1;j<=i;j--) {
				System.out.print(j);
			}// 2nd half num
			for(int j=2;j<=i;j++) {
				System.out.print(j);
			}
		}
	}
}