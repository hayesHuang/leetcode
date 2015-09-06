package leetcode;

public class NextPermutation {
	
    public void nextPermutation(int[] num) {
        if(num.length<=1) return;
        int end=num.length-1;
        int begin=0;
        int k=end;
        while(k>0&&num[k-1]>=num[k]){
        	k--;
        }
        if(k==0){
        	begin=0;
        }else{
        	begin=k;
        	k=end;
        	while(k>=begin){
        		if(num[k]>num[begin-1]){
        			int tmp = num[k];
        			num[k] = num[begin-1];
        			num[begin-1]=tmp;
        			break;
        		}else{
        			k--;
        		}
        	}
        }
        while(begin<end){
        	int tmp=num[end];
        	num[end]=num[begin];
        	num[begin]=tmp;
        	end--;
        	begin++;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
