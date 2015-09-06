package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class CombinationSum2 {
	HashSet<List<Integer>> set = new HashSet<List<Integer>>();
	private void combination(int[] candidates,int lastIndex,List<Integer> combinationRow,int target){
		if(lastIndex<0) return;
		if(candidates[lastIndex]>target){
			combination(candidates,lastIndex-1,combinationRow,target);
		}else if(candidates[lastIndex]==target){
			combinationRow.add(candidates[lastIndex]);
		    ArrayList record = new ArrayList(combinationRow);
			Collections.reverse(record);
			set.add(record);
			combinationRow.remove(combinationRow.size()-1);
			combination(candidates,lastIndex-1,combinationRow,target);
		}else{
			combinationRow.add(candidates[lastIndex]);
			combination(candidates,lastIndex-1,combinationRow,target-candidates[lastIndex]);
			combinationRow.remove(combinationRow.size()-1);
			combination(candidates,lastIndex-1,combinationRow,target);
		}
	}
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        ArrayList<Integer> combinationRow = new ArrayList<Integer>();
        List<List<Integer>> res = new ArrayList();
    	if(candidates==null||candidates.length<=0||target<=0){
    		return res;
    	}
    	Arrays.sort(candidates);
    	combination(candidates,candidates.length-1,combinationRow,target);
    	res.addAll(set);
    	return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
