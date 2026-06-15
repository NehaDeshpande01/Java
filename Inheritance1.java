// example of inheritance
package NEW;
 class Education{ //parent class
	public void b1() {
		System.out.println("b1() is Computer science");
	}public void b2() {
		System.out.println("b2() is information technology");
	}public void b3() {
		System.out.println("b3() is Electronics AND TELECOMMUNICATION");
	}
	}
	class Diploma extends Education{//child class
		public void b4() {
			System.out.println("b4() is electrical");
		}public void b5() {
			System.out.println("b5() mechanical");
		}public void b6() {
			System.out.println("b6() is civil");
		}
	}
 public class Inheritance1{//main class
	public static void main(String[]args) {
	Diploma obj =new Diploma();//obj
	obj.b1();
	obj.b2();
	obj.b3();
	obj.b4();
	obj.b5();
	obj.b6();
	}
}