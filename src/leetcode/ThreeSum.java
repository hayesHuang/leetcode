package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ThreeSum {
    public List<List<Integer>> threeSum(int[] num) {
    	Arrays.sort(num);
    	List<List<Integer>> result= new ArrayList<List<Integer>>();
    	int i=0;
    	while(i<num.length-2){
    		int j=i+1;
    		int k=num.length-1;
    		while(j<k){
    			if(num[i]+num[j]+num[k]==0){
    				List<Integer> triplet = new ArrayList(Arrays.asList(num[i],num[j],num[k]));
    				result.add(triplet);
    				int numj=num[j];
    				while(numj==num[j]&&j<k){
    					j++;
    				}
    			}else if(num[i]+num[j]+num[k]<0){
    				j++;
    			}else{
    				k--;
    			}
    		}
    		int numi=num[i];
    		while(numi==num[i]&&i<num.length-2){
    			i++;
    		}
    	}
    	return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[]{0,0,0,0};
		List<List<Integer>> result =new ThreeSum().threeSum(num);
		System.out.println(result);

	}

}
