// 2D array
package NEW;
public class Arr24{
	public static void main(String[]args) {
		int[][]arr= {{1,2,3},{4,5,6},{7,8,9}};
		for(int [] ele : arr) {
			for(int i:ele) {
				System.out.println(i+" ");
			}
			System.out.println();
		}
	}
}