//to find smallest number
package NEW;
class Arr14{
	public static void main(String[]args) {
		int[]arr= {90,20,30,10,45,37,43,4,87};
		int small=arr[0];
		for(int i=0;i<arr.length;i++) {
			if (arr[i]<small) {
				small=arr[i];
			}
		}
		System.out.println(small);
	}
}