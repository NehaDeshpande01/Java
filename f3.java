package NEW;
// example of continue
public class f3{
	public static void main (String[]args) {
		int i =10;
		for (int n=1;n<=10;n++) {
			if(i%n!=0) {
				continue;
			}
			System.out.println(n);
			
		}
	}
}