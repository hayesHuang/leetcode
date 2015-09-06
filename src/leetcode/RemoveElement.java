package leetcode;

public class RemoveElement {
	public int removeElement(int[] A, int elem) {
		if(A.length==0) return 0;
        int i=0,j=0;
        while(j<A.length){
        	if(A[j]==elem){
        			j++;
        	}else{
        		if(i==j){
        			i++;
        			j++;
        		}else{
        			A[i]=A[j];
        			i++;
        			j++;
        		}
        	}
        }
        return i;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
