package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Subsets2 {
	private void generateSubsets(List<List<Integer>> res, int[] num, List<Integer> tmp, int start){
		res.add(new ArrayList(tmp));
		for(int i=start;i<num.length;i++){
			if(i!=start&&num[i]==num[i-1]){
				continue;
			}else{
				tmp.add(num[i]);
				generateSubsets(res,num,tmp,start+1);
				tmp.remove(tmp.size()-1);
			}
		}
	}
    public List<List<Integer>> subsetsWithDup(int[] num) {
    	List<List<Integer>> res= new ArrayList<List<Integer>>();
    	if(num.length==0) return res;
    	ArrayList<Integer> tmp = new ArrayList<Integer>();
        Arrays.sort(num);
        generateSubsets(res,num,tmp,0);
        return res;      
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subsets2 test = new Subsets2();
		int[] num = new int[]{1,2,3,4,5,6,7,8,0};
		test.subsetsWithDup(num);

	}

}
