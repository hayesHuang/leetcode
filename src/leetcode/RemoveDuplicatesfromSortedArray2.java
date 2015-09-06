package leetcode;

public class RemoveDuplicatesfromSortedArray2 {
    public int removeDuplicates(int[] A) {
        if(A.length<3) return A.length;
        int first =0;
        int second=1;
        int pointer=2;
        while(pointer<A.length){
        	if(A[first]==A[second]&&A[second]==A[pointer]){
        		pointer++;
        		while(pointer<A.length&&A[pointer]==A[second]){
        			pointer++;
        		}
        		if(pointer<A.length){
        			A[second+1]=A[pointer];
        			first++;
        			second++;
        			pointer++;
        		}else{
        			return ++second;
        		}
        	}else{
        		A[second+1]=A[pointer];
        		first++;
        		second++;
        		pointer++;
        	}
        }
        return ++second;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
