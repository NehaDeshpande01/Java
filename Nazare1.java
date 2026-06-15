package NEW;//inheritance example
class Brahman{//parent class
	public void f1(){
		System.out.println("f1 is Prasad Deshpande family");
	}public void f2() {
		System.out.println("f2 is Vinayak Deshpande family");
	}public void f3() {
		System.out.println("f3 is Prabhakar Deshpande family");
	}public void f4() {
		System.out.println("f4 is Kanneya Deshpande family");
	}public void f5() {
		System.out.println("f5 is Suhas Deshpande family");
	}public void f6() {
		System.out.println("f6 is Vishnupant Deshpande family");
	}public void f7() {
		System.out.println("f7 is Jayant Deshpande family");
	}public void f8() {
		System.out.println("f8 is Prashant Paricharak family");
	}public void f9() {
		System.out.println("f9 is Raghunath Deshpande family");
	}
}class Deshpande extends Brahman{//child class
	public void f10() {
		System.out.println("f10 is Sulbha Deshpande family");
	}public void f11() {
		System.out.println("f11 is Sneha Deshpande family");
	}public void f12() {
		System.out.println("f12 is Ranjana Deshpande family");
	}public void f13() {
		System.out.println("f13 is Durga Kale family");
	}public void f14() {
		System.out.println("f14 is Nirmala Deshpande family");
	}public void f15() {
		System.out.println("f15 is Bandu Deshpande family");
	}public void f16() {
		System.out.println("f16 is Usha Deshpande family");
	}
		
}public class Nazare1{
	public static void main(String[]args) {
		Deshpande obj = new Deshpande();
		obj.f1();
		obj.f2();
		obj.f3();
		obj.f4();
		obj.f5();
		obj.f6();
		obj.f7();
		obj.f8();
		obj.f9();
		obj.f10();
		obj.f11();
		obj.f12();
		obj.f13();
		obj.f14();
		obj.f15();
		obj.f16();
	}
}