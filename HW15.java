// to find frequency of an array
package NEW;
public class HW15{
	public static void main(String[]args) {
		int []arr= {1,2,3,4,5,6,7,7,7,7,4,3,2,5};
		boolean []b=new boolean[arr.length];
		
		
		for (int i=0;i<arr.length;i++) {
			if (b[i])
				continue;
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]&&b[j]==false) {
					count++;
					b[j]=true;
				}
			}
			if(count==1)//to find unique number
				System.out.println(arr[i]);
		}//to find duplicate if(count>1)
		
	}
}