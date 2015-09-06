package leetcode;

public class MergeSortedArray {
	public void merge(int A[], int m, int B[], int n) {
		int[] tmp= new int[m+n];
		int i=0,j=0,k=0;
	    for(;i<m&&j<n&&k<(m+n);k++){
	    	if(A[i]<B[j]){
	    		tmp[k]=A[i];
	    		i++;
	    	}else{
	    		tmp[k]=B[j];
	    		j++;
	    	}
	    }
	    while(i<m){
	    	tmp[k]=A[i];
	    	i++;k++;
	    }
	    while(j<n){
	    	tmp[k]=B[j];
	    	j++;k++;
	    }
	    for(int t=0;t<m+n;t++){
	    	A[t]=tmp[t];
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
