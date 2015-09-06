package leetcode;

public class SortColors {
    public void sortColors(int[] A) {
        if(A==null||A.length<2) return;
        int start=0,end=A.length-1;
        int pointer=0;
        while(pointer<=end){
        	switch(A[pointer]){
        	case 0:
        		int tmp = A[pointer];
        		A[pointer]=A[start];
        		A[start]=tmp;
        		start++;
        		pointer++;
        		break;
        	case 2:
        		 tmp = A[pointer];
        		 A[pointer]=A[end];
        		 A[end]=tmp;
        		 end--;
        		 break;
        	default:
        		pointer++;
        	}
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
