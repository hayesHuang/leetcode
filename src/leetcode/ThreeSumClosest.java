package leetcode;

import java.util.Arrays;

public class ThreeSumClosest {
    public int threeSumClosest(int[] num, int target) {
    	Arrays.sort(num);
    	if(num.length<3)return 0;
    	int closestSum=num[0]+num[1]+num[2];
    	int minDiff=Math.abs(closestSum-target);
    	for(int i=0;i<num.length-2;i++){
    		int j=i+1,k=num.length-1;
    		while(j<k){
    			int tmpSum=num[i]+num[j]+num[k];
    			int diff=tmpSum-target;
    			if(diff==0){
    				return tmpSum;
    			}else{
    				int tmpDiff=Math.abs(diff);
    				if(tmpDiff<minDiff){
    					closestSum=tmpSum;
    					minDiff=tmpDiff;
    				}
    				if(diff>0){
    					k--;
    				}else{
    					j++;
    				}
    			}
    		}
    	}
    	return closestSum;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
