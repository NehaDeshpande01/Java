package NEW;
public class Hollow1{
	public static void main(String[]args) {
		int n=5;
		// upper high butterfly
		for(int i=1;i<=n;i++) {
			//left stars
			for(int j =1;j<=i;j++) {
				if(j==1 || j==i) {
					System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}//middle space
			for (int j=1;j<=2*(n-i);j++) {
				System.out.print(" ");
			}//right stars
			for(int j=1;j<=i;j++) {
				if(j==1 || j==i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}//lower half butterfly
		for(int i=n;i>=1;i--) {
			//left stars
			for(int j =1;j<=i;j++) {
				if(j==1 || j==i) {
					System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}//middle space
			for (int j=1;j<=2*(n-i);j++) {
				System.out.print(" ");
			}//right stars
			for(int j=1;j<=i;j++) {
				if(j==1 || j==i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
	}
}
}