//to find count of positive ant negative num
package NEW;
public class HW11{
public static void main(String[]args) {
	int positive=0;
	int negative=0;
	int[]arr= {1,-23,4,-5,6,-7,6,7,-8,9,-56,45,-34,76,-87,97};
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>=0)
			positive++;
		else
			negative++;
	}
	System.out.println("count of positive: "+positive);
	System.out.println("count of negative: "+negative);
}
}
