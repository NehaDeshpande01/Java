package NEW;
// to find prime num
public class prime{
	public static void main(String[]args) {
		int num =23;
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
			if(count==2 && num>1) {
				System.out.println("num is prime");
			}else {
				System.out.println("num is not prime");
			}
		}
		
	}

	