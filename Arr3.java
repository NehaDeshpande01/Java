// sum of array 
package NEW;
class Arr3{
	public static void main(String[]args) {
		int[]arr= {1,2,3,4,5,6,7,8};
		int cnt=0;
		for(int a: arr) {
			cnt += a;
		}
		System.out.println(+cnt);
	}
}