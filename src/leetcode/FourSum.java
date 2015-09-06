package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
	public List<List<Integer>> fourSum(int[] num, int target) {
		Arrays.sort(num);
    	List<List<Integer>> result= new ArrayList<List<Integer>>();
    	int n=0;
    	while(n<num.length-3){
    		int i=n+1;
        	while(i<num.length-2){
        		int j=i+1;
        		int k=num.length-1;
        		while(j<k){
        			if(num[n]+num[i]+num[j]+num[k]==target){
        				List<Integer> triplet = new ArrayList(Arrays.asList(num[n],num[i],num[j],num[k]));
        				result.add(triplet);
        				int numj=num[j];
        				while(numj==num[j]&&j<k){
        					j++;
        				}
        			}else if(num[n]+num[i]+num[j]+num[k]<target){
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
        	int numn=num[n];
        	while(numn==num[n]&&n<num.length-3){
        		n++;
        	}
    	}
    	
    	return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
