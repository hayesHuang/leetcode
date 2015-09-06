package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Permutations {
	private void permute(int i,int[] num, List<List<Integer>> res){
		if(i==num.length){
			List<Integer> record = new ArrayList<Integer>();
			for(int j=0;j<num.length;j++){
				record.add(num[j]);
			}
			res.add( record);
		}
		for(int j=i;j<num.length;j++){
			int tmp=num[j];
			num[j]=num[i];
			num[i]=tmp;
			permute(i+1,num,res);
			tmp=num[j];
			num[j]=num[i];
			num[i]=tmp;
		}
		
	}
	
    public List<List<Integer>> permute(int[] num) {
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
    	if(num==null||num.length<=0){
    		return res;
    	}
    	permute(0,num,res);
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
