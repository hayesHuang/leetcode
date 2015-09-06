package leetcode;

public class RemoveDuplicatesfromSortedArray {
	public int removeDuplicates(int[] A) {
	   if(A.length<2) return A.length;
	   int i=0;
	   for(int j=1;j<A.length;j++){
		   if(A[i]!=A[j]){
			   if(i!=j-1){
				   i++;
				   A[i]=A[j];
			   }else{
				   i++;
			   }
		   }
	   }
	   return i+1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
