package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {
	private void subsets(List<List<Integer>> res,int[] s, int index, List<Integer> tmp){
		if(index==s.length){
			List<Integer> subset = new ArrayList<Integer>(tmp);
			res.add(subset);
		}else{
			subsets(res,s,index+1,tmp);
			tmp.add(s[index]);
			subsets(res,s,index+1,tmp);
			tmp.remove(tmp.size()-1);
		}
		
		
	}
	
    public List<List<Integer>> subsets(int[] S) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> tmp = new ArrayList<Integer>();
        if(S==null||S.length<1) return res;
        Arrays.sort(S);
        subsets(res,S,0,tmp);
        return res;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
